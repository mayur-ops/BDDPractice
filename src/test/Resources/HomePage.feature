Feature: Argos home page functionality

  @search
  Scenario: search for the individual product
    Given user is on argos home page website
    When user type nike on search box for the nike product
    And user click on search button
    Then user should be able to see nike products

  @dropdown
    Scenario: search for auto drop down options
      Given user is on argos home page website
      When user type nike on search box for the nike product
      And user do select product from auto drop down options
      Then user should be able to see selected drop down options product