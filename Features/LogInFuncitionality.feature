@Regression @User1
Feature: Testing Logins

  @Smoke
  Scenario Outline:testing gmail logins
    When go to "https://www.gmail.com" website.
    And User Enters '<UserName>' and '<PassWord>'
    Then title should contain"ra"


    Examples:
      | UserName             | PassWord  |
      | ramile1115@gmail.com | 6789ghjk9 |
      | ramile1115@gmail.com | wery34756 |
      | ramile1115@gmail.com | wert12344|


