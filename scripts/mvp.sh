#! /bin/sh

# This script is very basic implementation of the idea of the whole project, which is an interactive personal architect that creates 
# packages, classes, methods, dependencies all for you, and with clean and good desgin/architecture.

########### Read data from user of the program
echo "Welcome to Generic CRUD project generator.\n"

echo "Please enter your project's name: "

read proj_name

echo "Please enter your domain objects' names(seperated by spaces, maximum of 5 DO-s)"

read domain_obj_1  domain_obj_2 # Restricted to only 2 domain objects at the moment


########## Generate folder structure for the project

mkdir "$proj_name"

cd "$proj_name"

mkdir "src"

cd "src"

mkdir "main"

mkdir "test"

cd "main"

mkdir "java"

mkdir "resources"

cd ../..

####### Requester package setup ##########
cd "src/main/java"

mkdir "Requesters"

cd "Requesters"

touch "Create${domain_obj_1}Requester.java"
touch "Read${domain_obj_1}Requester.java"
touch "Update${domain_obj_1}Requester.java"
touch "Delete${domain_obj_1}Requester.java"

echo "public class Create${domain_obj_1}Requester{}" > "Create${domain_obj_1}Requester.java"
echo "public class Read${domain_obj_1}Requester{}" > "Read${domain_obj_1}Requester.java"
echo "public class Update${domain_obj_1}Requester{}" > "Update${domain_obj_1}Requester.java"
echo "public class Delete${domain_obj_1}Requester{}" > "Delete${domain_obj_1}Requester.java"

cd ..
######################################

######## Services package setup #########

mkdir "Services"

mkdir "Storage"

mkdir "BusinessLogic"

mkdir "entities"






