# Modified to demonstrate vulnerability scanning:

Use docker compose to start a local sonar instance with extra plugins 
* [sonar-findbugs-plugin](https://github.com/SonarQubeCommunity/sonar-findbugs/)
* [dependency-check-sonar-plugin](https://github.com/stevespringett/dependency-check-sonar-plugin)
* [sonar-zap-plugin](https://github.com/pdsoftplan/sonar-zap)

    $ docker-compose up sonarqube

User is admin/admin
                       
You have to install the findbugs plugin in the admin section.


Now you can run son

    $ mvn sonar:sonar
    
to run static code analysis.

    $ mvn dependency-check:check

Will check the dependencies against vulnerability databases.

Please install an run [OWSAP ZAP](https://www.owasp.org/index.php/OWASP_Zed_Attack_Proxy_Project) with proxy port 7979.

To run Zed Attack Proxy start the application [Easybuggy](http://localhost:8080/) 

    $ mvn install

and then run scanning and attacking in an extra console 
    
    $ mvn zap:analyze


# original readme follows
---

[![Build Status](https://travis-ci.org/k-tamura/easybuggy.svg?branch=master)](https://travis-ci.org/k-tamura/easybuggy)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![GitHub release](https://img.shields.io/github/release/k-tamura/easybuggy.svg)](https://github.com/k-tamura/easybuggy/releases/latest)

EasyBuggy :baby_symbol:
=

EasyBuggy is a broken web application in order to understand behavior of bugs and vulnerabilities, for example, [memory leak, deadlock, JVM crash, SQL injection and so on](https://github.com/k-tamura/easybuggy/wiki).

![logo](https://github.com/k-tamura/easybuggy/blob/master/src/main/webapp/images/easybuggy.png)
![vuls](https://github.com/k-tamura/test/blob/master/bugs.png)

:clock4: Quick Start
-

    $ mvn clean install

( or ``` java -jar easybuggy.jar ``` or deploy ROOT.war on your servlet container with [the JVM options](https://github.com/k-tamura/easybuggy/blob/master/pom.xml#L204). )

Access to

    http://localhost:8080

### To stop:

  Use <kbd>CTRL</kbd>+<kbd>C</kbd> ( or access to: http://localhost:8080/exit )

:clock4: For more detail
-
   
See [the wiki page](https://github.com/k-tamura/easybuggy/wiki).

:clock4: Demo
-

This demo shows: Start up -> Infinite Loop -> LDAP Injection -> UnsatisfiedLinkError -> BufferOverflowException -> Deadlock -> Memory Leak -> JVM Crash (Shut down)

![demo](https://github.com/k-tamura/test/blob/master/demo_eb.gif)
