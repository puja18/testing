Feature: Hotel Booking Form

Background: Given user is on hotel booking page

Scenario: check the heading of hotel booking page
Given User is on login page
And user is on hotel booking page
Then check the heading of the page

Scenario: successful login with valid data
Description: to confirm booking, user should enter all the mandatory details 
Given User is on hotel booking page
When User enter all the mandatory details
Then navigate to confirmation page

Scenario: Prompt user to enter the valid data when user leaves the hotel booking page
Given User is on hotel booking page
When user does not enter all the madatory fields
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the first name
Given User is on hotel booking page
When user enters all the mandatory fields
But does not enter first name
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the last name
Given User is on hotel booking page
When user does not enter last name
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the email
Given User is on hotel booking page
When user does not enter email
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the mobile no
Given User is on hotel booking page
When user does not enter mobile no
And clicks the confirm booking button 
Then display the appropriate message

Scenario: prompt user when user enters the invalid mobile no format
Given when user is on hotel booking page
When user enters the invalid valid mobile no
|1236547890|
|96521300145|
|2668926124|
|96582 |
| |
Then display the appropriate error message

Scenario: Prompt user to enter the valid data when user leaves the city
Given User is on hotel booking page
When user does not enter city
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the state
Given User is on hotel booking page
When user does not enter state
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the number of guests staying
Given User is on hotel booking page
When user does not enter number of guests staying
And clicks the confirm booking button 
Then display the appropriate message

Scenario Outline: validate the number of rooms alloted
Given User is on hotel booking page
When user enters <numberofGuests>
Then allocate rooms such that 1 room for minimum 3 guests
Examples:
|numberOfGuests|
|3|
|8|
|7|

Scenario: Prompt user to enter the valid data when user leaves the card holder name
Given User is on hotel booking page
When user does not enter card holder name
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the debit card number
Given User is on hotel booking page
When user does not enter debit card number
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the cvv
Given User is on hotel booking page
When user does not enter cvv
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the expiration month
Given User is on hotel booking page
When user does not enter expiration month
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the expiration year
Given User is on hotel booking page
When user does not enter expiration year
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the first name and last name
Given User is on hotel booking page
When user does not enter first name and last name
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the first name and email
Given User is on hotel booking page
When user does not enter first name and email
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the first name and mobile no
Given User is on hotel booking page
When user does not enter first name and mobile no
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the first name and city
Given User is on hotel booking page
When user does not enter first name and city
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the first name and state
Given User is on hotel booking page
When user does not enter first name and state
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the first name and number of guests staying
Given User is on hotel booking page
When user does not enter first name and number of guests staying
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the first name and card holder name
Given User is on hotel booking page
When user does not enter first name and card holder name
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the first name and debit card number
Given User is on hotel booking page
When user does not enter first name and debit card number
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the first name and cvv
Given User is on hotel booking page
When user does not enter first name and cvv
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the first name and expiration month
Given User is on hotel booking page
When user does not enter first name and expiration month
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the first name and expiration year
Given User is on hotel booking page
When user does not enter first name and expiration year
And clicks the confirm booking button 
Then display the appropriate message



Scenario: Prompt user to enter the valid data when user leaves the last name and email
Given User is on hotel booking page
When user does not enter last name and email
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the last name and mobile no
Given User is on hotel booking page
When user does not enter last name and mobile no
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the last name and city
Given User is on hotel booking page
When user does not enter last name and city
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the last name and state
Given User is on hotel booking page
When user does not enter last name and state
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the last name and number of guests staying
Given User is on hotel booking page
When user does not enter last name and number of guests staying
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the last name and card holder name
Given User is on hotel booking page
When user does not enter last name and card holder name
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the last name and debit card number
Given User is on hotel booking page
When user does not enter last name and debit card number
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the last name and cvv
Given User is on hotel booking page
When user does not enter first name and cvv
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the last name and expiration month
Given User is on hotel booking page
When user does not enter first name and expiration month
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the last name and expiration year
Given User is on hotel booking page
When user does not enter first name and expiration year
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the email and mobile no
Given User is on hotel booking page
When user does not enter email and mobile no
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the email and city
Given User is on hotel booking page
When user does not enter email and city
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the email and state
Given User is on hotel booking page
When user does not enter email and state
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the email and number of guests staying
Given User is on hotel booking page
When user does not enter email and number of guests staying
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the email and card holder name
Given User is on hotel booking page
When user does not enter email and card holder name
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the email and debit card number
Given User is on hotel booking page
When user does not enter email and debit card number
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the email and cvv
Given User is on hotel booking page
When user does not enter email and cvv
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the email and expiration month
Given User is on hotel booking page
When user does not enter email and expiration month
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the email and expiration year
Given User is on hotel booking page
When user does not enter email and expiration year
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the mobile no and city
Given User is on hotel booking page
When user does not enter mobile no and city
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the mobile no and state
Given User is on hotel booking page
When user does not enter mobile no and state
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the mobile no and number of guests staying
Given User is on hotel booking page
When user does not enter mobile no and number of guests staying
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the mobile no and card holder name
Given User is on hotel booking page
When user does not enter mobile no and card holder name
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the mobile no and debit card number
Given User is on hotel booking page
When user does not enter mobile no and debit card number
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the mobile no and cvv
Given User is on hotel booking page
When user does not enter mobile no and cvv
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the mobile no and expiration month
Given User is on hotel booking page
When user does not enter mobile no and expiration month
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the mobile no and expiration year
Given User is on hotel booking page
When user does not enter mobile no and expiration year
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the city and state
Given User is on hotel booking page
When user does not enter city and state
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the city  and number of guests staying
Given User is on hotel booking page
When user does not enter city and number of guests staying
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the city  and card holder name
Given User is on hotel booking page
When user does not enter city  and card holder name
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the city  and debit card number
Given User is on hotel booking page
When user does not enter city  and debit card number
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the city  and cvv
Given User is on hotel booking page
When user does not enter city  and cvv
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the city and expiration month
Given User is on hotel booking page
When user does not enter city  and expiration month
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the city and expiration year
Given User is on hotel booking page
When user does not enter city and expiration year
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the state and number of guests staying
Given User is on hotel booking page
When user does not enter state and number of guests staying
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the state  and card holder name
Given User is on hotel booking page
When user does not enter state  and card holder name
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the state  and debit card number
Given User is on hotel booking page
When user does not enter state  and debit card number
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the state  and cvv
Given User is on hotel booking page
When user does not enter state  and cvv
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the state and expiration month
Given User is on hotel booking page
When user does not enter state  and expiration month
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the state and expiration year
Given User is on hotel booking page
When user does not enter state and expiration year
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the number of guests staying  and card holder name
Given User is on hotel booking page
When user does not enter number of guests staying and card holder name
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the number of guests staying  and debit card number
Given User is on hotel booking page
When user does not enter number of guests staying  and debit card number
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the number of guests staying  and cvv
Given User is on hotel booking page
When user does not enter number of guests staying  and cvv
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the number of guests staying and expiration month
Given User is on hotel booking page
When user does not enter number of guests staying  and expiration month
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the number of guests staying and expiration year
Given User is on hotel booking page
When user does not enter number of guests staying and expiration year
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the card holder name  and debit card number
Given User is on hotel booking page
When user does not enter card holder name  and debit card number
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the card holder name  and cvv
Given User is on hotel booking page
When user does not enter card holder name and cvv
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the card holder name and expiration month
Given User is on hotel booking page
When user does not enter card holder name  and expiration month
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the card holder name and expiration year
Given User is on hotel booking page
When user does not enter card holder name and expiration year
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the debit card number  and cvv
Given User is on hotel booking page
When user does not enter debit card number and cvv
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the debit card number and expiration month
Given User is on hotel booking page
When user does not enter debit card number  and expiration month
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the debit card number and expiration year
Given User is on hotel booking page
When user does not enter debit card number and expiration year
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the cvv and expiration month
Given User is on hotel booking page
When user does not enter cvv  and expiration month
And clicks the confirm booking button 
Then display the appropriate message


Scenario: Prompt user to enter the valid data when user leaves the cvv and expiration year
Given User is on hotel booking page
When user does not enter cvv and expiration year
And clicks the confirm booking button 
Then display the appropriate message

Scenario: Prompt user to enter the valid data when user leaves the expiration month and expiration year
Given User is on hotel booking page
When user does not enter expiration month and expiration year
And clicks the confirm booking button 
Then display the appropriate message

