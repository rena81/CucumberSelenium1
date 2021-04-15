Feature: Ebay Advanced Search page

  @test2
  Scenario: Ebay Logo on Advanced Search Page
    Given I am on Advanced Search Page
    When I click on Ebay Logo
    Then I am navigated to Ebay Home Page

  @test6
  Scenario: Advanced search an item
    Given I am on Advanced Search Page
    When I Advanced search an item
      | keyword   | exclude     | min | max |
      | iPhone 11 | refurbished | 300 | 900 |