# grails-test-app
## GOAL 
1. Use Groovy to implement a RESTful API web application.
   http://ratpack.io or https://grails.org for RESTful API implementation, or any framework you want to use.

2. Use Robotframework (http://robotframework.org) to write a test case to search "Ruckus Wireless" on Google, and check if any result found.

3. Export a RESTful API endpoint to run the test case.

4. Use Gradle & Docker to package the application to container.

5. Send me the Docker container and prepare a readme file to teach me how to use.


## HOW TO USE 
0. Environment requires: java, groovy, grails, gradle and jybot installed.

1. Download source code and run
   `grails run-app`

###### RESTful API
1. Website URL will be 
   `http://localhost:8080/myapp/user/index`

2. You can operate via browser or use RESTful API with `curl`

3. Available commands:

**create user**
```
curl -i -X POST -H "Content-Type: application/json" -d '{"uid":111,"email":"alice@mail.com","name":"Alice"}' localhost:8080/myapp/user
```

**list all users**
```
curl -X GET -H "Accept: application/json" localhost:8080/myapp/user
```

**get single user**
```
curl -X GET -H "Accept: application/json" localhost:8080/myapp/api/{id}
```
(notice: id != uid, use "id" you get via list command mentioned in above)

**update user**
```
curl -H 'Content-Type: application/json' -X PUT -d '{"uid":777,"email":"alicenew@new.mail.com","name":"Alice-update"}' localhost:8080/myapp/user/{id}
```

**delete user**
```
curl -X DELETE localhost:8080/myapp/api/user/{id}
```

* **Notice:**
* id != uid
* When POST/DELETE, server will return 404 error, but request is completed.

###### Auto Test (with robot framwork)
* Endpoint 
  * (Website) http://localhost:8080/myapp/test/index
  * (REST API) http://localhost:8080/myapp/test/
  * (Script path) **$project_path/scipts/mytest.robot**

* Command

**create/run a test**
```
curl -i -X POST -H "Content-Type: application/json" -d '{"name": "myFirstTest"}' localhost:8080/myapp/test
```

* Test will automatically run after user create a 'test' object

* Auto test logs will save to `$project_path/myAutoTestLogs`


## WHAT I HAVE LEARNED 
* **Achieve** Goal 1,2,3
* **Failed** Goal 4,5

###### DETAIL
1. Install groovy and grails
2. Development a web application with Groovy/Grails Tool Suite (GGTS)
3. Implement a domain-class 'User' and do CRUD with "Scaffolding"
   (Scaffolding auto-generates GSPs and controller, and can also do RESTful actions)
4. Install robotframework/RIDE
5. Write a test case according to request.
6. Add a 'domain-class 'Test' and do CRUD
7. While user create a Test, also run test case and save log.
   (use shell command.execute(), so "pybot" have to be installed in the env OS)

## WHAT I HAVE NOT FINISHED 
1. (bug) REST API: When POST/DELETE, server will return 404 error, but request is completed.
2. Auto-Test: Fail to use 'robotframework-maven-plugin' to run test case 
   (plugin not found in grails repository, use shell command.execute() instead)
3. Fail to package project with gradle. 
   (stuck at gradle init, 'Plugin with id 'grails' not found.' ...)
4. Not have enough time to build docker container.


---
Authur: Wei-Lin Chen realseven@gmail.com
