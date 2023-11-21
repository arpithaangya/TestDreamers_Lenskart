Feature: sunglass feature of lenskart
 
  @EyeGlassescategory
  Scenario: checking the sunglass category of lenskart
    Given launch the webpage of lenskart
    When Hover the mouse to sunglasses and click
    And check the variety of sunglasss
    And click the range
    And Sort the product by price:low to high
    And Filtering  frame type by half rim
    
     And chose the sunglass
     And switch to another tab
     And click the power
     And choose the lens for sunglass
      And choose the lens color for sunglass
      And choose the color coating for sunglass
     And click the continue
     And user given the checkout
     Then asserting the bill details
