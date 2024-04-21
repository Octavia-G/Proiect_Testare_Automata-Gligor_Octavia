Feature: A user should be able to access sign in page and create its credentials and the user should use those credentials to login.

  Background: Necessary steps for each scenario
    Given the home page is accessed
    When the create account button is clicked

  Scenario: Access create account page
    Then the create account page should be displayed

  Scenario: Access create account page and create a use
    Then the fields are filled with values
      |#wpName2|NumeUtilizator|
      |#wpPassword2|Password|
      |#wpRetype|ConfirmPassword|
      |#wpEmail|Email              |






