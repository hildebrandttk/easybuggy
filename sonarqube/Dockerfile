FROM sonarqube:6.6
RUN wget -q https://github.com/pdsoftplan/sonar-zap/releases/download/1.0.0-0/sonar-zap-plugin-1.0.0-0.jar -O /opt/sonarqube/extensions/plugins/sonar-zap-plugin-1.0.0-0.jar
RUN wget -q https://github.com/stevespringett/dependency-check-sonar-plugin/releases/download/1.1.0/sonar-dependency-check-plugin-1.1.0.jar -O /opt/sonarqube/extensions/plugins/sonar-dependency-check-plugin-1.1.0.jar
RUN wget -q https://github.com/SonarQubeCommunity/sonar-findbugs/releases/download/3.6.0/sonar-findbugs-plugin-3.6.0.jar -O /opt/sonarqube/extensions/plugins/sonar-findbugs-plugin-3.6.0.jar