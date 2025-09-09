
Feature: Date selection in the Datepicker

  Scenario: Select day 15 of the current month
    Given I open the Datepicker page
    When I select day 15 of the current month
    Then the selected date should appear in the input field
