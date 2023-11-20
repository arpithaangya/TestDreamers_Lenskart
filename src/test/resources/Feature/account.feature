Feature: My account of lenskart

@MyAccount
Scenario: Checking the MyAccount of lenskart

Given  Launching the lenskart webpage
When User enters valid username 

				|email  	                 | 
				| arpi.angya@gmail.com  	 | 
				

And user clicks the next for login
And User enters valid password
												 |password	       |
												 | Sunflower123	   |
						
And User clicks the login button
