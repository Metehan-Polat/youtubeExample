Feature: Youtube


  Scenario Outline: Test case 1:Search Youtube
    Given Navigate to "<Browser>"
    When Navigate to Url
    Then Click to search
    And Type most watched video in the search button
    And Click to enter
    And click the first video in the options
    And come to comments
    And Close

    Examples:
      | Browser |
      | Chrome |
