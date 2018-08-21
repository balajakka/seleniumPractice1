Feature: Browser Navifation
  Scenario: Able to user browser backward functionality
    Given I am a chrome user
    When I access google search site
    And I access amazon site
    And I click on backward broswer button
    Then I will see google search site

  Scenario: Able to user browser forward functionality
    Given I am a chrome user
    When I access google search site
    And I access amazon site
    And I click on backward broswer button
    And I click on forward browser button
    Then I will see Amazon site