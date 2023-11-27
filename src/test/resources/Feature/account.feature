Feature: My account of lenskart

@MyAccount
Scenario Outline: Checking the MyAccount of lenskart

Given  Launching the lenskart webpage
When User enters valid username sheetname  "<sheetname>" and rownumber <rownumber>

			
				

And user clicks the next for login
And User enters valid password sheetname  "<sheetname>" and rownumber <rownumber>
												
						
And User clicks the login button

And user clicks the user account 
And user clicks the My orders
And again clicks the user account
And user clicks the my prescription
And user clicks the store credit

And user clicks the account information
Then asserting the value of first name


  Examples:
      | sheetname | rownumber |
      | sheet1    |         0 |



