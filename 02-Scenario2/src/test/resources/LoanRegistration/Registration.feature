Feature: Loan Registration page


Scenario: check the heading of login page
Given User is on login page
Then check the heading of the page

Scenario: successful login with data
Description: to confirm booking, user should enter all the mandatory details 
Given User is on login page
When User enter all the mandatory details
Then navigate to confirmation page

Scenario: Prompt user to enter the data when user leaves the login page
Given User is on login page
When user does not enter all the madatory fields
And clicks the submit button 
Then display the appropriate message

Scenario: Prompt user to enter the data when user leaves the first name
Given User is on login page
When user enters all the mandatory fields
But does not enter first name
And clicks the submit button 
Then display the appropriate message


Scenario: prompt user when user enters the invalid pan number format
Given User is on login page
When user enters the invalid valid pan number
|AEfsf012|
|1aDEFDa00145|
|puja|
| |
Then display the appropriate error message

Scenario: Prompt user to enter the data when user leaves the last name
Given User is on login page
When user does not enter last name
And clicks the submit button 
Then display the appropriate message

Scenario: Prompt user to enter the data when user leaves the mobile no
Given User is on login page
When user does not enter mobile no
And clicks the submit button 
Then display the appropriate message

Scenario: prompt user when user enters the invalid mobile no format
Given User is on login page
When user enters the invalid valid mobile no
|1236547890|
|96521300145|
|2668926124|
|96582 |
| |
Then display the appropriate error message

Scenario: Prompt user to enter the data when user leaves the account number blank
Given User is on login page
When user does not enter account number
And clicks the submit button 
Then display the appropriate message

Scenario: prompt user when user enters the invalid account number format
Given User is on login page
When user enters the invalid valid account number
|1236547890|
|96521300145|
|2668926124|
|96582 |
| |
Then display the appropriate error message

Scenario: Prompt user to enter the data when user leaves the pan number blank
Given User is on login page
When user does not enter pan number
And clicks the submit button 
Then display the appropriate message

Scenario: prompt user when user enters the invalid pan number format
Given User is on login page
When user enters the invalid valid pan number
|AEfsf0|
|ADEFDa00145|
|ASEFCDG12512|
|Afasj12 |
| |

Scenario: Prompt user to enter the data when user leaves the credit card number blank
Given User is on login page
When user does not enter credit card number
And clicks the submit button 
Then display the appropriate message


Scenario: Prompt user to enter the data when user leaves the number of years for loan blank
Given User is on login page
When user does not enter number of years for loan 
And clicks the submit button 
Then display the appropriate message


Scenario: Prompt user to enter the data when user leaves the rate of interest blank
Given User is on login page
When user does not enter rate of interest 
And clicks the submit button 
Then display the appropriate message

Scenario: Prompt user to enter the data when user leaves the loan amount blank
Given User is on login page
When user does not enter loan amount
And clicks the submit button 
Then display the appropriate message

Scenario: Prompt user to enter the data when user leaves the mail id blank
Given User is on login page
When user does not enter mail id
And clicks the submit button 
Then display the appropriate message


Scenario: prompt user when user enters the invalid account number format
Given User is on login page
When user enters the invalid valid account number
|@gmail.com|
|.@gmail|
|@.@gmail.com|
| |
Then display the appropriate error message


