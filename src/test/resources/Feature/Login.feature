Feature: Login page 

@ValidCredentials
Scenario: Checking credentials on Login

Given  Login page URL of Lenskart
When User enters username 

				|email  	                 | 
				| arpi.angya@gmail.com  	 | 
				

And user clicks next
And User enters password
												 |password	       |
												 | Sunflower123	   |
						
And User clicks login and goes to home
Then User will logout

#
#
#
#@ForgotPassword
#Scenario: Checking Forgot password
#
#Given goes to Lenskart URL
#When User enters email1 or phone number
#And clicks next
#And clicks on forgot password
#Then User clicks to send link for reset



