# SManager
Engineering degree project

# How to run application on your pc?
1) Install IntelliJ IDEA Community Edition
2) Clone repository into your workspace
3) File -> Open -> App/smanager/pom.xml and open as project
4) Install mysql and create user, then create database (You only need to create database, tables will be created automatically, when application starts)
5) Open application.properties and change DBNAME, USER and PASSWORD to the ones that you are using
```
spring.datasource.url = jdbc:mysql://localhost:3306/DBNAME?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
spring.datasource.username = USER
spring.datasource.password = PASSWORD
```
6) Run application (Shift + F10)
7) Application should be available under http://localhost:8080/
