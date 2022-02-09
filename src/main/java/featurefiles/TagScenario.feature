Feature: Checking Login functionality of the Orange HRM
  @SmokeTest
  Scenario: Checking Login functionality with the valid login credentials
    Given user is on the Login page
    When user enters username and password in respective textfields
      | username | password |
      | ad      | admin    |
      | Admin   | admin123 |
    When user clicks on the demo OrangeHRM Login button
    Then user is on the demo OrangeHRM Homepage