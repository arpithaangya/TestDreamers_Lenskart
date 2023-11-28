Feature: feature of lenskart

@Wishlist
 Scenario: Selecting and Buying Glasses
    Given User opens the lenskart Webpage
    When User clicks the eyeglasses category
    And User adds the first product to wish list
    And User adds the second product to wish list
    And User clicks the product1 in the wish list
    And User removing the product1
    Then Asserting the WishList
    
 