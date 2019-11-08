Feature:

  Background:
    Given I open Contact page

  Scenario:
    And I fill in contact form
    When I press Submit
    Then Thank you page is displayed
