Feature: sunglass feature of lenskart
 
  @EyeGlassescategory
  Scenario: checking the sunglass category of lenskart
    Given launch the webpage of lenskart
    When Hover the mouse to sunglasses
    When Hover the mouse to the men section
    And hover the mouse to the classic sunglasses option and click
    And check the variety of sunglasss
    And click the range
    And Sort the product by price:low to high
    And Filter the frame type by full rim
    
     And chose the sunglass
     And switch to another tab
     And click the power
     And choose the color for sunglass
     And click the continue
     And user given the checkout
     Then asserting the bill details
