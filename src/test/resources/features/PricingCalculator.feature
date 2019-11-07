Feature:

  Background:
    Given I open Calculation page
    And I fill in calculation form
    When I press Add to Estimate

  Scenario:
    Then USD 1,187.77 per 1 month is displayed

  Scenario:
    Then Instance type: n1-standard-8 is displayed

  Scenario:
    Then Region: Frankfurt is displayed

  Scenario:
    Then Total available local SSD space 2x375 GB is displayed
