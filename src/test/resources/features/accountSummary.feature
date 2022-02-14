Feature: Account Summary Types in the Account Summary Page

  Background:
    Given the user is on the login page
    And Users logins with user name "username" and password "password"
    Then the "Account Summary" page should be displayed


  Scenario: Account Summary verification
    Then    Account summary	page should	have to	following account types:
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |
  @wip
    Scenario: Credit Accounts verification
      Then Credit Account should have to following titles:
    |Account   |
    |Credit Card |
    |Balance     |

