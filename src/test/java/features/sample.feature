Feature: Google Test

  Scenario: Open Google
    Given user opens google
    Then title should contain "Google"
