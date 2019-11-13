Feature:

  Background:
    Given I open Contact page

  @test
  Scenario: Send contact data
    And I fill Contact page with data:
      | firstName | lastName | jobTitle  | email          | phoneNumber | companyName |
      | Tom       | Jones    | Tester    | test@gmail.com | 234567890   | Epam        |
      | Andrew    | Prok     | Developer | tod@gmail.com  | 234567345   | Epam        |
    And  I choose Industry
    And I choose googleSignUp:
      | option |
      | Yes    |
      | No     |
    When I press Submit
    Then Thank you page is displayed

