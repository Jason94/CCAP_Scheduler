Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday
    Given today is "Sunday"
    When I ask whether it's Friday yet
    Then I should be told "Nope"

  Scenario: Friday is Friday
    Given today is "Friday"
    When I ask whether it's Friday yet
    Then I should be told "Yep"

  Scenario: I see Friday on the home page
    Given I am on the home page
    Then I should see "Friday"

  Scenario: I see Friday on the home page
    Given I am on the index page
    Then the title should be "Test Title"
