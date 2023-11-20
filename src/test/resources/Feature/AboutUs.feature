Feature: Check AboutUs in lenskart application

@AboutUs
Scenario: Checking AboutUs features in lenskart application

Given User goes to lenskart webpage
When User goes to about us and clicks We are hiring
Then User should be able to see the we are hiring page
When User clicks Refer and Earn
Then User should be able to see the Refer and Earn page
When User clicks About us
Then User should be able to see the About us page
When User clicks lenskart coupons
Then User should be able to see the lenskart coupons page