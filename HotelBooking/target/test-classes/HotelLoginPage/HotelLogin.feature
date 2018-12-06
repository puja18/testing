@HotelBookingLogin

Feature: Login

Scenario: check the heading of login page
Given User is on login page
Then check the heading of the page

Scenario: successful login with valid data
Description: to login, user should enter his valid username,password
Given User is on Login page
When User enter the valid username, valid password
Then navigate to hotelBooking

Scenario: Prompt user to enter the valid data when user leaves the login page
Given User is on Login page
When user does not enter either username or password
And clicks the login button
Then display the appropriate message

Scenario:unsuccessful login due to incorect username and password
Given user is on login page
When user enter the wrong username or password  
Then display the error page

Scenario: unsuccessful login due to incorrect username and correct password
Given user is on login page
When user enter the wrong password  
Then display the error page

Scenario: unsuccessful login due to correct username and incorrect password
Given user is on login page
When user enter the wrong username
Then display the error page

Scenario: Prompt user when user leaves the username blank and enter the password
Given User is on Login page
When user leaves the username blank and enters password
And clicks the login button
Then display the appropriate message

Scenario: Prompt user when user leaves the password blank and enter the username
Given User is on Login page
When user leaves the password blank and enter username
And clicks the login button
Then display the appropriate message
