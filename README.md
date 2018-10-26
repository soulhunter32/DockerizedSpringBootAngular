:: ENVIRONMENT BUILD INSTRUCTIONS ::

=> Inside /app

=> Compiles back + front to WAR and the WAR to the container
$ mvn clean install

=> Starts container in debug port 5005 and app port 8080
$ docker run -e "SPRING_PROFILES_ACTIVE=dev" -p 8080:8080 -p 5005:5005 --name iridiuz-framework iridiuz/framework:0.0.1