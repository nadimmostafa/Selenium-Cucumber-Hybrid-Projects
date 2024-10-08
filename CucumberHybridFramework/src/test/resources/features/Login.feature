#Author: nadimmostafa26@gmail.com#
#Keywords Summary: This feature file contains all test scenarios for Login functionality
@login
Feature: Login Functionality

  @loginForValidCredentials
  Scenario: Login with valid Credentials
    Given user should navigate to login page
    When user has to entered valid email-address "dpython26@gmail.com"
    And entered valid password "12345"
    And Click on login button
    Then Navigate to Account Page

  @LoginWithInvalidEmail
  Scenario: Login with Invalid Email Address
    Given user should navigate to login page
    When user has to entered invalid email-address "dpython426@gmail.com"
    And entered valid password "12345"
    And Click on login button
    Then user should get Wranning message

  @LoginWithInvalidPass
  Scenario: Login with Invalid Password
    Given user should navigate to login page
    When user has to entered valid email-address "dpython426@gmail.com"
    And entered invalid password "1234871"
    And Click on login button
    Then user should get Wranning message

  @LoginWithoutCredentials
  Scenario: Login without credentials
    Given user should navigate to login page
   	When Click on login button
    Then user should get Wranning message
