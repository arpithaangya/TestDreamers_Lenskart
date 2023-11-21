Feature: Buy an item in lenskart application

@ComputerGlassesCategory
Scenario: Buying a computerglass item

Given User goes to the lenskart webpage
When User clicks the computerglasses
And User clicks sortby
And User clicks the product
And User clicks the buy now
Then User should be able to buy the product successfully
When User clicks the remove
And User clicks yes,remove
Then User should be able to see the cart is empty