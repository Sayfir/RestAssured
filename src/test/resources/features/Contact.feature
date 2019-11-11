Feature:

  Background:
    Given I open Contact page

  Scenario Outline:
    And I fill "<firstName>"
    And I fill "<lastName>"
    And I fill "<jobTitle>"
    And I fill "<email>"
    And I fill "<phoneNumber>"
    And I fill "<companyName>"
    And I choose "<industry>"
    And I choose "<signUp>"
    When I press Submit
    Then Thank you page is displayed
    Examples:
      |firstName|lastName|jobTitle  |email           |phoneNumber|companyName|industry|signUp|
      |Tom      |Jones   |Tester    |test@gmail.com  |234567890  |Epam       |2       |Yes   |
      |Andrew   |Prok    |Developer |test23@gmail.com|345678654  |Epam       |3       |No    |

