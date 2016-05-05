# What is Jetty and Jetty Runner?
_https://devcenter.heroku.com/articles/deploy-a-java-web-application-that-launches-with-jetty-runner#prerequisites_

Jetty is a lightweight Java application server that offers a flexible array of options for how it can be launched. One popular option is using embedded Jetty the way that the Java quickstart does. Another good option is the Jetty Runner jar file. Each version of Jetty that is released includes a Jetty Runner jar. This jar can be run directly from the java command and can be passed a war file to load right on the command line. An example of this would be:

 java -jar jetty-runner.jar application.war

Jetty Runner will then launch a Jetty instance with the given war deployed to it.
