# DHTML Gästebuch
by Noxyro (C) 2019

#### Unter folgendem Link erreichbar:

https://guestbook.elodrias.de


#### Für das Projekt wurde verwendet:

- [Kotlin](https://kotlinlang.org/) - als Programmiersprache
- [Spring Boot](https://spring.io/projects/spring-boot) - als JVM Web Framework
- [Thymeleaf](https://www.thymeleaf.org/) - als Templating Framework für HTML Seiten
- [Jackson](https://github.com/FasterXML/jackson) - als Bibliothek für JSON Verarbeitung
- [Maven](https://maven.apache.org/) - als Build-Tool


### Abhängigkeiten-Details:

com.gmail.noxyro:dhtml-guestbook:jar:0.0.1-SNAPSHOT  
+- org.springframework.boot:spring-boot-starter-thymeleaf:jar:2.1.4.RELEASE:compile  
|  +- org.springframework.boot:spring-boot-starter:jar:2.1.4.RELEASE:compile  
|  |  +- org.springframework.boot:spring-boot:jar:2.1.4.RELEASE:compile  
|  |  +- org.springframework.boot:spring-boot-autoconfigure:jar:2.1.4.RELEASE:compile  
|  |  +- org.springframework.boot:spring-boot-starter-logging:jar:2.1.4.RELEASE:compile  
|  |  |  +- ch.qos.logback:logback-classic:jar:1.2.3:compile  
|  |  |  |  \- ch.qos.logback:logback-core:jar:1.2.3:compile  
|  |  |  +- org.apache.logging.log4j:log4j-to-slf4j:jar:2.11.2:compile  
|  |  |  |  \- org.apache.logging.log4j:log4j-api:jar:2.11.2:compile  
|  |  |  \- org.slf4j:jul-to-slf4j:jar:1.7.26:compile  
|  |  +- javax.annotation:javax.annotation-api:jar:1.3.2:compile  
|  |  \- org.yaml:snakeyaml:jar:1.23:runtime  
|  +- org.thymeleaf:thymeleaf-spring5:jar:3.0.11.RELEASE:compile  
|  |  +- org.thymeleaf:thymeleaf:jar:3.0.11.RELEASE:compile  
|  |  |  +- org.attoparser:attoparser:jar:2.0.5.RELEASE:compile  
|  |  |  \- org.unbescape:unbescape:jar:1.1.6.RELEASE:compile  
|  |  \- org.slf4j:slf4j-api:jar:1.7.26:compile  
|  \- org.thymeleaf.extras:thymeleaf-extras-java8time:jar:3.0.4.RELEASE:compile  
+- org.springframework.boot:spring-boot-starter-web:jar:2.1.4.RELEASE:compile  
|  +- org.springframework.boot:spring-boot-starter-json:jar:2.1.4.RELEASE:compile  
|  |  +- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.9.8:compile  
|  |  +- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:jar:2.9.8:compile  
|  |  \- com.fasterxml.jackson.module:jackson-module-parameter-names:jar:2.9.8:compile  
|  +- org.springframework.boot:spring-boot-starter-tomcat:jar:2.1.4.RELEASE:compile  
|  |  +- org.apache.tomcat.embed:tomcat-embed-core:jar:9.0.17:compile  
|  |  +- org.apache.tomcat.embed:tomcat-embed-el:jar:9.0.17:compile  
|  |  \- org.apache.tomcat.embed:tomcat-embed-websocket:jar:9.0.17:compile  
|  +- org.hibernate.validator:hibernate-validator:jar:6.0.16.Final:compile  
|  |  +- javax.validation:validation-api:jar:2.0.1.Final:compile  
|  |  +- org.jboss.logging:jboss-logging:jar:3.3.2.Final:compile  
|  |  \- com.fasterxml:classmate:jar:1.4.0:compile  
|  +- org.springframework:spring-web:jar:5.1.6.RELEASE:compile  
|  |  \- org.springframework:spring-beans:jar:5.1.6.RELEASE:compile  
|  \- org.springframework:spring-webmvc:jar:5.1.6.RELEASE:compile  
|     +- org.springframework:spring-aop:jar:5.1.6.RELEASE:compile  
|     +- org.springframework:spring-context:jar:5.1.6.RELEASE:compile  
|     \- org.springframework:spring-expression:jar:5.1.6.RELEASE:compile  
+- com.fasterxml.jackson.module:jackson-module-kotlin:jar:2.9.8:compile  
|  +- com.fasterxml.jackson.core:jackson-databind:jar:2.9.8:compile  
|  |  \- com.fasterxml.jackson.core:jackson-core:jar:2.9.8:compile  
|  \- com.fasterxml.jackson.core:jackson-annotations:jar:2.9.0:compile  
+- org.jetbrains.kotlin:kotlin-reflect:jar:1.2.71:compile  
|  \- org.jetbrains.kotlin:kotlin-stdlib:jar:1.2.71:compile  
|     +- org.jetbrains.kotlin:kotlin-stdlib-common:jar:1.2.71:compile  
|     \- org.jetbrains:annotations:jar:13.0:compile  
+- org.jetbrains.kotlin:kotlin-stdlib-jdk8:jar:1.2.71:compile  
|  \- org.jetbrains.kotlin:kotlin-stdlib-jdk7:jar:1.2.71:compile  
\- org.springframework.boot:spring-boot-starter-test:jar:2.1.4.RELEASE:test  
   +- org.springframework.boot:spring-boot-test:jar:2.1.4.RELEASE:test  
   +- org.springframework.boot:spring-boot-test-autoconfigure:jar:2.1.4.RELEASE:test  
   +- com.jayway.jsonpath:json-path:jar:2.4.0:test  
   |  \- net.minidev:json-smart:jar:2.3:test  
   |     \- net.minidev:accessors-smart:jar:1.2:test  
   |        \- org.ow2.asm:asm:jar:5.0.4:test  
   +- junit:junit:jar:4.12:test  
   +- org.assertj:assertj-core:jar:3.11.1:test  
   +- org.mockito:mockito-core:jar:2.23.4:test  
   |  +- net.bytebuddy:byte-buddy:jar:1.9.12:test  
   |  +- net.bytebuddy:byte-buddy-agent:jar:1.9.12:test  
   |  \- org.objenesis:objenesis:jar:2.6:test  
   +- org.hamcrest:hamcrest-core:jar:1.3:test  
   +- org.hamcrest:hamcrest-library:jar:1.3:test  
   +- org.skyscreamer:jsonassert:jar:1.5.0:test  
   |  \- com.vaadin.external.google:android-json:jar:0.0.20131108.vaadin1:test  
   +- org.springframework:spring-core:jar:5.1.6.RELEASE:compile  
   |  \- org.springframework:spring-jcl:jar:5.1.6.RELEASE:compile  
   +- org.springframework:spring-test:jar:5.1.6.RELEASE:test  
   \- org.xmlunit:xmlunit-core:jar:2.6.2:test  
