Feature: LoginFeature
    This feature deals with the login functionality of the application

  @TestngScenario
  Scenario: Login with correct username and password
    Given I navigate to the main page
    And I enter the username utopia.cosmica@yandex.ru and password Inever44ty45tyh
    And I click submit button
    Then I should see the mail page
