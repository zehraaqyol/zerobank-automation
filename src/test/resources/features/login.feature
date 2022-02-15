@login
Feature: Online Banking Login Feature

  Background:
    Given the user is on the login page


  Scenario: Authorize users should be able to login to the application
    And Users logins with user name "username" and password "password"
    Then the "Account Summary" page should be displayed
    And  user selects "Account Activity" page
    Then the "Account Activity" page should be displayed
@negative
  Scenario: Unauthorized users should NOT be able to login to the application
    And Users logins with user name "" and password ""
    Then user gets "Login and/or password are wrong." error message

  @negative
  Scenario Outline:Unauthorized users should NOT be able to login to the application
    And Users logins with user name "<username>" and password "<password>"
    Then user gets "Login and/or password are wrong." error message
    Examples:
      | username | password |
      | username | wrong    |
      | wrong    | password |
      | username |          |
      |          | password |



