web:java $JAVA_OPTS -jar target/dependency/webapp-runner.jar --port $PORT target/*.war 
web: java -Dspring.profiles.active=default -Dserver.port=$PORT -jar target/*.jar
web:java -jar target/myapp-1.0.0.jar