# Autor: Leyder Rodriguez
# Lenguage: EN

Feature: Date selection in the Datepicker

  @Case1
  Scenario: Select day 15 of the current month
    Given I open the Datepicker page
    When I select day 15 of the current month
    Then the selected date should contain 15

  @Case2
  Scenario: Select day 10 of the next month
    Given I open the Datepicker page
    When I select day 10 of the next month
    Then the selected date should contain 10

  @Case3
  Scenario: Validate that manual input is not allowed
    Given I open the Datepicker page
    When I try to enter the date "12/25/2025" manually
    Then the input field should remain empty
