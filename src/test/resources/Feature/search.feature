
Feature: features of lenskart
 
  @Searchproduct
  Scenario: checking the search product of lenskart
    Given launching the lenskart
    When given the valid credentials for login
    And click the search
    And given the product name to search
    Then asserting the product user searched


