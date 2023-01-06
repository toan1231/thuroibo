
Feature:
#  @toan
#  Scenario:
#    Given I login with correct Credentials

  @toan
  Scenario Outline: hrmOrange login functionalities verification

    Then I login with incorrect Credentials"<username>""<password>""<incorrectCredential>"
  Examples:
  | username|password|incorrectCredential|
  |         |abcd|Username cannot be empty|
  |jfkdkfjkj|        |Password cannot be empty|
  |dfjdjfk|Bootcamp5#|Invalid credentials|
  |yoll-student|jdjfjdfkj|Invalid credentials|
  |kfjkdjfk|jjwhewhnr|Invalid credentials|



































#  Background:
#    Given I’m logged in with Admin Account
#  @toan
#  Scenario:
#
#    Given I’m logged in with Admin Account
#    And I click on PIM → Add Employee
#    Then I fill out Username, First Name, Middle Name, Last Name
#    Then I click on the checkbox “Create Login Details”
#    Then I see additional fields displayed
#    When I click on the checkbox again
#    And The fields are no longer displayed


