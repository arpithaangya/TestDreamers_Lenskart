
Feature: feature of lenskart
 
  @EyeGlassescategory
  Scenario: checking the eyeglasses category of lenskart
    Given User opens the lenskart webpage
    When User clicks the eyeglasses
    And User clicks the view range
    And User sorts the product by price:low to high
    And Filter the frame type by full rim
    Then Asserting the frame type to full rim
    
 