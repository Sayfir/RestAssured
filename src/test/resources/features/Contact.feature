Feature:

  Background:
    Given I open Home page
    And I click on Contact sales link

  Scenario Outline:
    And I fill in contact form
    When I press Submit
    Then Thank you page is displayed

    Examples:
      |  |