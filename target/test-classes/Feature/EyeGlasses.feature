
Feature: feature of lenskart
 
  @EyeGlassescategory
  Scenario: checking the eyeglasses category of lenskart
    Given User opens the lenskart webpage
    When User clicks the eyeglasses
    And User sorts the product by price:high to low
    And Filter the frame type by full rim
    And Filter the frame shape by aviator
    And User add the product to the wishlist
    And user clicking the product in the wishlist
    And user clicking buy now option
    Then Asserting the Total payable
    
 