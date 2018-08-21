Feature: Login actions
  Scenario: Gmail login test.
    Given I am a existing Gmail user
    When I enter username and password
    And I click login button
    Then I will see Gmail Inbox screen