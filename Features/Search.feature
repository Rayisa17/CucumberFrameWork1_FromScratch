@Regression @user2
Feature: Testing Searches


  @Smoke @google
  Scenario Template: Google Search
    When go to 'https://www.google.com' website
    Then Enter '<Products>' in search box

    Examples:
      | Products |
      | apple    |
      | yagyu    |
      | iphone   |


    @amazon
  Scenario Outline: amazon search
    When go to 'https://www.amazon.com' website
    And enter "<Products>" in the new search box

    #if the step definitions and glues's package step definitons would be apply
    Examples:
      | Products |
      | apple    |
      | yagyu    |
      | iphone   |
