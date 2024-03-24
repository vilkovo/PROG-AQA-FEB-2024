Feature: Allo search tests

#  TODO: write tests for ${your.site.name} as cucumber scenarios

  Scenario: Simple Cucumber Scenario
    Given I load allo page
    When I search iPhone
    When Get search results
    When Search results contain
    Then Print first product
    Then Switch to search page by number
    Then Switch to prev page
    Then Switch to next page