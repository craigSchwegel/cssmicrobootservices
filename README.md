# cssmicrobootservices


 Micro web service project using Spring Boot
 
 The service is deployed in AWS using Beanstalk
 
 The default service is called calcMedian.  It takes an integer list delimited by comma as input
 and returns the median for the list.
 
 The service replaces Tomcat with Jetty as the embedded web server.
 
 Sample execution:
 curl localhost:8080?values="10,8,12,10"
 The median is for the input string is 10

 
