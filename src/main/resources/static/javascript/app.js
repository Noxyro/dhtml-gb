let debugMode = true;
let entriesNode = document.querySelector("#entries");
let errorsNode = document.querySelector("#errors");
let progressNode = document.querySelector("#progress");
let progressBar = document.querySelector("#progress-bar");

function showErrors(errors) {
    errorsNode.classList.remove("d-none");
    errorsNode.innerHTML = errors;
}

function hideErrors() {
    errorsNode.classList.add("d-none");
    errorsNode.innerHTML = "";
}

function updateProgress(progress, description) {
    progressBar.setAttribute("aria-valuenow", progress + "%");
    progressBar.style.width = progress + "%";
    progressBar.innerHTML = description;

    setTimeout(function () {
        if (progress > 0 && progress < 100) {
            progressNode.classList.remove("d-none");
        } else {
            setTimeout(function () {
                progressNode.classList.add("d-none");
                progressBar.innerHTML = "";
            }, 800);
        }
    }, 100);
}

function sendRequest(method, path, payload, callback) {
    let request = new XMLHttpRequest();

    progressNode.classList.remove("d-none");
    request.onreadystatechange = function () {
        if (debugMode) {
            console.log(this.readyState);
        }

        updateProgress(this.readyState * 20, "Step " + this.readyState + " / 4");

        if (this.readyState !== XMLHttpRequest.DONE) {
            return;
        }
        if (this.status !== 200) {
            if (debugMode) {
                console.log(this.status)
            }
            showErrors("Error during request: " + this.status);
            updateProgress(100, "Error!");
            return;
        }

        if (debugMode) {
            console.log(this.responseText)
        }

        callback(this.responseText)
    };

    var jsonPayload = null;
    if (payload != null) {
        jsonPayload = JSON.stringify(payload);
    }

    request.open(method, path, true);
    request.send(jsonPayload);
}

function fetchEntries() {
    updateProgress(90, "Fetching entries ...");
    sendRequest("GET", "/entries", null, (content) => {
        if (debugMode) {
            console.log("Inner html change");
        }
        entriesNode.innerHTML = content.replace("/\n/", "<br/>");
        updateProgress(100, "Done!");
    });
}

(function () {
    fetchEntries();

    let form = document.querySelector("#form");
    let formName = document.querySelector("#form-input-name");
    let formMail = document.querySelector("#form-input-mail");
    let formContent = document.querySelector("#form-text-content");
    form.addEventListener("submit", (event) => {
        let payload = {name: formName.value, mail: formMail.value, content: formContent.value};
        updateProgress(10, "Sending ...");
        sendRequest("POST", "/post", payload, (errors) => {
            if (debugMode) {
                console.log("Payload: " + payload)
            }

            if (errors !== "") {
                showErrors(errors);
                updateProgress(100, "Error!");
                return;
            }

            hideErrors();
            fetchEntries();
        });

        event.preventDefault();
    });

})();

function removeEntry(id) {
    sendRequest("DELETE", "/remove", id, (errors) => {
        if (debugMode) {
            console.log("Removed: " + id)
        }

        if (errors !== "") {
            showErrors(errors);
        } else {
            hideErrors();
        }

        fetchEntries()
    });
}
