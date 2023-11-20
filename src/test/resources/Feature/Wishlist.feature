Feature: feature of lenskart

@Wishlist
 Scenario: Selecting and Buying Glasses
    Given User opens the lenskart Webpage
    When User clicks the eyeglasses category
    And User clicks product
    And User adds to wish list
    And User clicks the second product
    And User adding the second product in wishlist
    And User Clears the WishList
    Then Asserting the WishList
    
 