
Feature: features of lenskart
 
  @Searchproduct
  Scenario: checking the search product of lenskart
    Given launching the lenskart
    And given the product name to search
    And given the enter
    And given the filter for frame shape
    And given the filter for frame size
    And given the filter for frame type
    And given the sort for result high to low
    And user selects the eyeglass 
    And switch to newly opened tab
    And user clicks the select lens
    And user clicks the select lens type
    And user clicks the select premium lens
    And user clicks the select lens coating.
    And user click the continue
    And user click the checkout glass
    Then asserting the product user selected with details