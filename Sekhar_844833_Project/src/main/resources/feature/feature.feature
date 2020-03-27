Feature: http://examples.codecharge.com/TaskManager/Default.php

Scenario Outline: Data Driven Login to examples.codecharge.com/TaskManager/Default.php
Given launch the browser
When open the application
Then enter username as "<username>" & password "<password>" and click on login
Examples:
	| 	username 	| 	password 	|
	| 	admin    	| 	admin    	|
	| 	aadmin   	| 	aadmin  	|
	| 	badmin   	| 	badmin   	| 

Scenario: add Task in examples.codecharge.com/TaskManager/Default.php
Given open the Application
When click on Administration2
When login with valid credentials
When click on add task
When enter all fields 
When select Start Date
When select End Date
When click on Add button
Then assert if added task is shown in task list table

Scenario: Search Task in Type
Given open the application7
When select task in Type
When click on Search
Then Assert if previously added task is in the table or not

Scenario: Sort the Task Table according to finish date
Given view the website
When click on finish date
Then Assert if finish date is as same as previously added task finish date

Scenario: screenshot the type Type from the page
Given Open the web application
When select task in Type and search
When take screenshot the Displayed tasks
Then assert the tasks