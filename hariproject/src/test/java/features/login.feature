
 Feature: to test the login
 
 Scenario: positive test for user login 
 
 Given navigate to google
 And navigate to "https://www.elocalshops.com/" website
 And navigate to login and click
 When given user input for userid <username> and pasw <password>
 Then dont know still
 And close the driver
 
 
Examples:
|username				|password			|
|abcd@gmail.com	|abcd					|
