@ui
Feature: Partners

  @logo
  Scenario: Partners logo, name and description validation
    Given  open "https://www.achieve3000.com/"
    When click hamburger menu in top right corner
    Then open Our Partners from the list
    And List all partners logo
    And check all presented partners has logo, header and text description
