# DHTML Gästebuch
by Oliver Kipping (C) 2019

#### Die Abgabe ist auch unter folgendem Link erreichbar:

https://guestbook.elodrias.de


#### Für das Projekt verwendet wurde:

- Kotlin - als Programmiersprache
- Spring Boot - als JVM Web Framework
- Thymeleaf - als Templating Framework für HTML Seiten
- Jackson - als Bibliothek für JSON Verarbeitung
- Maven - als Build-Tool


## Details:

[INFO] com.gmail.noxyro:dhtml-guestbook:jar:0.0.1-SNAPSHOT
[INFO] +- org.springframework.boot:spring-boot-starter-thymeleaf:jar:2.1.4.RELEASE:compile
[INFO] |  +- org.springframework.boot:spring-boot-starter:jar:2.1.4.RELEASE:compile
[INFO] |  |  +- org.springframework.boot:spring-boot:jar:2.1.4.RELEASE:compile
[INFO] |  |  +- org.springframework.boot:spring-boot-autoconfigure:jar:2.1.4.RELEASE:compile
[INFO] |  |  +- org.springframework.boot:spring-boot-starter-logging:jar:2.1.4.RELEASE:compile
[INFO] |  |  |  +- ch.qos.logback:logback-classic:jar:1.2.3:compile
[INFO] |  |  |  |  \- ch.qos.logback:logback-core:jar:1.2.3:compile
[INFO] |  |  |  +- org.apache.logging.log4j:log4j-to-slf4j:jar:2.11.2:compile
[INFO] |  |  |  |  \- org.apache.logging.log4j:log4j-api:jar:2.11.2:compile
[INFO] |  |  |  \- org.slf4j:jul-to-slf4j:jar:1.7.26:compile
[INFO] |  |  +- javax.annotation:javax.annotation-api:jar:1.3.2:compile
[INFO] |  |  \- org.yaml:snakeyaml:jar:1.23:runtime
[INFO] |  +- org.thymeleaf:thymeleaf-spring5:jar:3.0.11.RELEASE:compile
[INFO] |  |  +- org.thymeleaf:thymeleaf:jar:3.0.11.RELEASE:compile
[INFO] |  |  |  +- org.attoparser:attoparser:jar:2.0.5.RELEASE:compile
[INFO] |  |  |  \- org.unbescape:unbescape:jar:1.1.6.RELEASE:compile
[INFO] |  |  \- org.slf4j:slf4j-api:jar:1.7.26:compile
[INFO] |  \- org.thymeleaf.extras:thymeleaf-extras-java8time:jar:3.0.4.RELEASE:compile
[INFO] +- org.springframework.boot:spring-boot-starter-web:jar:2.1.4.RELEASE:compile
[INFO] |  +- org.springframework.boot:spring-boot-starter-json:jar:2.1.4.RELEASE:compile
[INFO] |  |  +- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.9.8:compile
[INFO] |  |  +- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:jar:2.9.8:compile
[INFO] |  |  \- com.fasterxml.jackson.module:jackson-module-parameter-names:jar:2.9.8:compile
[INFO] |  +- org.springframework.boot:spring-boot-starter-tomcat:jar:2.1.4.RELEASE:compile
[INFO] |  |  +- org.apache.tomcat.embed:tomcat-embed-core:jar:9.0.17:compile
[INFO] |  |  +- org.apache.tomcat.embed:tomcat-embed-el:jar:9.0.17:compile
[INFO] |  |  \- org.apache.tomcat.embed:tomcat-embed-websocket:jar:9.0.17:compile
[INFO] |  +- org.hibernate.validator:hibernate-validator:jar:6.0.16.Final:compile
[INFO] |  |  +- javax.validation:validation-api:jar:2.0.1.Final:compile
[INFO] |  |  +- org.jboss.logging:jboss-logging:jar:3.3.2.Final:compile
[INFO] |  |  \- com.fasterxml:classmate:jar:1.4.0:compile
[INFO] |  +- org.springframework:spring-web:jar:5.1.6.RELEASE:compile
[INFO] |  |  \- org.springframework:spring-beans:jar:5.1.6.RELEASE:compile
[INFO] |  \- org.springframework:spring-webmvc:jar:5.1.6.RELEASE:compile
[INFO] |     +- org.springframework:spring-aop:jar:5.1.6.RELEASE:compile
[INFO] |     +- org.springframework:spring-context:jar:5.1.6.RELEASE:compile
[INFO] |     \- org.springframework:spring-expression:jar:5.1.6.RELEASE:compile
[INFO] +- com.fasterxml.jackson.module:jackson-module-kotlin:jar:2.9.8:compile
[INFO] |  +- com.fasterxml.jackson.core:jackson-databind:jar:2.9.8:compile
[INFO] |  |  \- com.fasterxml.jackson.core:jackson-core:jar:2.9.8:compile
[INFO] |  \- com.fasterxml.jackson.core:jackson-annotations:jar:2.9.0:compile
[INFO] +- org.jetbrains.kotlin:kotlin-reflect:jar:1.2.71:compile
[INFO] |  \- org.jetbrains.kotlin:kotlin-stdlib:jar:1.2.71:compile
[INFO] |     +- org.jetbrains.kotlin:kotlin-stdlib-common:jar:1.2.71:compile
[INFO] |     \- org.jetbrains:annotations:jar:13.0:compile
[INFO] +- org.jetbrains.kotlin:kotlin-stdlib-jdk8:jar:1.2.71:compile
[INFO] |  \- org.jetbrains.kotlin:kotlin-stdlib-jdk7:jar:1.2.71:compile
[INFO] \- org.springframework.boot:spring-boot-starter-test:jar:2.1.4.RELEASE:test
[INFO]    +- org.springframework.boot:spring-boot-test:jar:2.1.4.RELEASE:test
[INFO]    +- org.springframework.boot:spring-boot-test-autoconfigure:jar:2.1.4.RELEASE:test
[INFO]    +- com.jayway.jsonpath:json-path:jar:2.4.0:test
[INFO]    |  \- net.minidev:json-smart:jar:2.3:test
[INFO]    |     \- net.minidev:accessors-smart:jar:1.2:test
[INFO]    |        \- org.ow2.asm:asm:jar:5.0.4:test
[INFO]    +- junit:junit:jar:4.12:test
[INFO]    +- org.assertj:assertj-core:jar:3.11.1:test
[INFO]    +- org.mockito:mockito-core:jar:2.23.4:test
[INFO]    |  +- net.bytebuddy:byte-buddy:jar:1.9.12:test
[INFO]    |  +- net.bytebuddy:byte-buddy-agent:jar:1.9.12:test
[INFO]    |  \- org.objenesis:objenesis:jar:2.6:test
[INFO]    +- org.hamcrest:hamcrest-core:jar:1.3:test
[INFO]    +- org.hamcrest:hamcrest-library:jar:1.3:test
[INFO]    +- org.skyscreamer:jsonassert:jar:1.5.0:test
[INFO]    |  \- com.vaadin.external.google:android-json:jar:0.0.20131108.vaadin1:test
[INFO]    +- org.springframework:spring-core:jar:5.1.6.RELEASE:compile
[INFO]    |  \- org.springframework:spring-jcl:jar:5.1.6.RELEASE:compile
[INFO]    +- org.springframework:spring-test:jar:5.1.6.RELEASE:test
[INFO]    \- org.xmlunit:xmlunit-core:jar:2.6.2:test
