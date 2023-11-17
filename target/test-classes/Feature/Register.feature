Feature: Register to Lenskart web application

@RegisterPage
Scenario: Registering the application with valid credentials

Given User opens the Lenskart register page
When User clicks the signup
When User enters the valid credentials
And User clicks the createAccount
Then User should be able to register successfully