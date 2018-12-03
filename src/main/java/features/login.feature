Feature: Free CRM Login feature
Scenario: Free CRM Login test Scenario

Given User is already on login page
When title of login page is Free CRM
Then user enters username and password
Then user clicks on login button
Then user is on homepage

Scenario: User is able to create new contact

Given User is already on homepage
When User mouse over contacts link
Then User click on contacts link
Then User enters firstname and lastname
Then User click on save button
Then verify new contact added or not
Then close the browser
 