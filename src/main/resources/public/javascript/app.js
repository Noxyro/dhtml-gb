(function () {
	let debugMode = true;

	function sendRequest(method, path, payload, callback) {
		let request = new XMLHttpRequest();

		request.onreadystatechange = function () {
			if (debugMode) { console.log(this.readyState); }
			if (this.readyState !== XMLHttpRequest.DONE) { return; }
			if (this.status !== 200) {
				if (debugMode) { console.log(this.status) }
				return;
			}

			if (debugMode) { console.log(this.responseText) }
			callback(this.responseText)
		};

		var jsonPayload = null;
		if (payload != null) {
			jsonPayload = JSON.stringify(payload);
		}

		request.open(method, path, true);
		request.send(jsonPayload);
	}

	let entriesNode = document.querySelector("#entries");

	function fetchEntries() {
		sendRequest("GET", "entry", null, (content) => {
			if (debugMode) { console.log("Inner html change"); }
			entriesNode.innerHTML = content;
		});
	}

	fetchEntries();

	let form = document.querySelector("#form");
	let formName = document.querySelector("#form-input-name");
	let formMail = document.querySelector("#form-input-mail");
	let formContent = document.querySelector("#form-text-content");
	form.addEventListener("submit", (event) => {
		let payload = {name: formName.value, mail: formMail.value, content: formContent.value};
		sendRequest("POST", "/post", payload, () => {
			if (debugMode) { console.log("Payload: " + payload) }
			fetchEntries();
		});

		event.preventDefault();
	});

})();

