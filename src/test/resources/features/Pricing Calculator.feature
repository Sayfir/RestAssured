Feature:

  Scenario:
    Given I open Calculation page
    And I fill in calculation form
    When I press Add to Estimate
    Then USD 1,187.77 per 1 month is displayed

  Scenario:
    Given I open Calculation page
    And I fill in calculation form
    When I press Add to Estimate
    Then Instance type: n1-standard-8 is displayed

  Scenario:
    Given I open Calculation page
    And I fill in calculation form
    When I press Add to Estimate
    Then Region: Frankfurt is displayed

  Scenario:
    Given I open Calculation page
    And I fill in calculation form
    When I press Add to Estimate
    Then Total available local SSD space 2x375 GB is displayed
