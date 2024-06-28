# Spring boot security project 

## Overview
This is simple spring boot web project aimin to show how to use Spring boot security with JWT tokens as well roles.

## Roles
Currently the supported roles are:
- USER - have access to his data
- ADMIN - have acess to all users data
- SUPER_ADMIN - have acess to all user data and can create admins

## OWASP
I integrate dependency-check-maven to help with detecting publicly disclosed vulnerabilities associated with the project's dependencies.
To use it you should run the following command in the terminal: **mvn verify**

## Containerization
The application is containerized with Docker. I am using the following image: **eclipse-temurin:17.0.7_7-jre-alpine** 
As well as the MySQL database is also containerized and the application is able to connect to it.
