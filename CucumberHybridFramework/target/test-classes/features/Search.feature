#Author: nadimmostafa26@gmail.com
#Keywords Summary: This Feature file contains all Test Scenarios for Search functionality
@search
Feature: Search Functionality

  @searchWithValidPName
  Scenario: Searching with Valid product Name
    Given open an Application
    When user entered Valid Product Name "HP" into search box
    And click on search button
    Then product display on search page

  @searchWithInvalidPName
  Scenario: Searching with invalid Product Name
    Given open an Application
    When user entered invalid Product Name "Honda" into search box
    And click on search button
    Then Get warnning message on search page 
