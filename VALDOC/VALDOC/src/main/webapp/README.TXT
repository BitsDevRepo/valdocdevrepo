================================================================================
RELEASE-NOTES FOR VALDOC Deployment
================================================================================

==========
CONTENTS:
==========
* Pre-Requisites
* Deployment Procedure 


==============
Pre-Requisites
==============
* JDK 7 and above
* Tomcat 7 and above.

=======================
Deployment Process :
=======================
A. Please check the below tables -
 1. app_user
 2. user_role
 2. role_permission
 
  -> app_user, user_role and role_permission table scripts are available under project structure (/webapp/db/valdoc_db.sql)
  -> Kindly, create the tables and insert the data.
           -> Current sample Users are:
                 1. email/Password -> admin@bits.com/admin123!   (Read, Write and Delete)
                 2. email/Password -> valdoc@bits.com/valdoc123!     (Read and Write)
                 3. email/Password -> guest@bits.com/guest 123!  (Read) 
                 
B. If the WAR file is already available. Deploy the WAR into a web Server and update the below Files -
	1.jdbc.properties     
  		-> Change DB configuration for Dev Environment as required.
  		
     2.config.json.
     	->  Update the http protocol of the host machine if required. (eg. http/https)
     	->  Update the host on which application is deployed. (eg. IP/Domain name)
     	->  Update the port on which tomcat is running.(eg - default port is 8888) only for vish others can use 8080
     
    
C. If the WAR is not available, use Maven to build the project and deploy the war file in tomcat server.

