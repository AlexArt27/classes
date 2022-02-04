Feature: This feature is to test the login functionality

  Developer - Fenton
  Tester - Tetiana
  Reviewed by - Daniel

#  Background:
#    Given user opens website
#    And user us on login page
#    When user enters username "admin" and password "admin123"
#    And click on login button
#    Then verify user is navigated to homepage
#    When user hover mouse on PIM menu
#    And click on Add Employee link
#    Then verify user is navigated to add employee page

  @Smoke @Alex
  Scenario: Verify user is able to login with valid credentials
    When user enters valid details on add employee page
    And click on save button
    Then verify user is navigated to personal details page

  @Critical
  Scenario: Verify error message for missing first and last names
    And click on save button
    Then verify the error message for missing first and last is displayed

  @Smoke @Inv @datadriven
  Scenario Outline: Verify user is unable to login with invalid credentials
    When user enters username "<username>" and password "<password>"
    And click on login button
    Then verify invalid login error message is displayed

    Examples:
    |username     |password  |
    |invalidEmail | 12345678 |
    |Admin        | 12345678 |
    |invalidEmail | admin123 |
    |             |          |
    |admin        | Admin123 |

  @Smoke @datatable
  Scenario: Verify user is can able to see web table data
    When user enters username "admin" and password "admin123"
    And click on login button
    Then verify user is navigated to homepage
    Then verify table has below data
      | Airi Satou         | Accountant                    | Tokyo         | 33 | 2008/11/28 |
      | Angelica Ramos     | Chief Executive Officer (CEO) | London        | 47 | 2009/10/09 |
      | Ashton Cox         | Junior Technical Author       | San Francisco | 66 | 2009/01/12 |
      | Bradley Greer      | Software Engineer             | London        | 41 | 2012/10/13 |
      | Brenden Wagner     | Software Engineer             | San Francisco | 28 | 2011/06/07 |
      | Brielle Williamson | Integration Specialist        | New York      | 61 | 2012/12/02 |
    When user clicks on user badge icon
    And select on logout option
    Then user is on login page