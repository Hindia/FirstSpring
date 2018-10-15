# FirstSpringBootApplication
a standalone application which lets you CRUD(Create Read Update Delete) data in a database

Run course-0.0.1-SNAPSHOT.jar in your command prompt to start the application (java -jar [path to course-0.0.1-SNAPSHOT.jar])

The program runs on localhost on port 8080 (127.0.0.1:8080)

The database is empty at first and you can see that on 127.0.0.1:8080/topics. You can POST on your debugger for RESTful web services(ex. POSTMAN, RESTClient) . You can also PUT, GET and DELETE prooviding the id to the particular topic (ex. 127.0.0.1:8080/topics/1)

Furthermore, the application has another entity related to the topic Entity called course which accepts the same function as for the topic entity. You can access the courses in a particular topic using 127.0.0.1:8080/topics/[topicId]/courses. You can also PUT, GET and DELETE prooviding the id to the particular course (ex. 127.0.0.1:8080/topics/1/courses/1)
