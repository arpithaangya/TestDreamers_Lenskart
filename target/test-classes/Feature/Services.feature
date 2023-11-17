Feature: feature of lenskart

@Wishlist
 Scenario: Clicking the services option
    Given User opens the lenskart Webpage and scroll and find the services 
    When User clicks the store locator option
    And User clicks the search option and giving location
    And User clicks the buying guide option
    And Asserting the Buying guide page 
    And User clicks the frame size option
    And Asserting the frame size page
    Then Asserting the feature
    
 