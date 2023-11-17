Feature: feature of lenskart

@Wishlist
 Scenario: Selecting and Buying Glasses
    Given User opens the lenskart Webpage
    When User clicks the eyeglasses category
    And User clicks the product
    And User adds to wish list
    And User Clears the WishList
    Then Asserting the WishList
    
 