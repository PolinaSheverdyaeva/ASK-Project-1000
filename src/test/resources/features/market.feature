@market
  Feature: Market app test suite

    @market1
    Scenario: Market basic test
      Given I go to "quote" page
      When I print page details in console
      When I fill out required fields
      And I submit the form

    @market2
    Scenario: Navigation steps
      Given I go to "google" page
      When I go to "quote" page
      And I go back and forward, then refresh the page

    @market3
    Scenario: Different devices
      Given I go to "quote" page
      When I change resolution to "phone"
      And I wait for 3 sec
      And I change resolution to "desktop"
      And I wait for 3 sec

    @market4
    Scenario: Verify email field - invalid email provided
      Given I go to "quote" page
      When I type email "text" into email field
      And I submit the form
      Then error message "Please enter a valid email address." should be shown
      Then I wait for 5 sec

    @market5
    Scenario: Verify email field - valid email provided
      Given I go to "quote" page
      When I type email "text@gmail.com" into email field
      And I submit the form
      Then error message "Please enter a valid email address." is not shown

    @market6
    Scenario: Verify the required fields
      Given I go to "quote" page
      When I fill out required fields
      And I submit the form
      Then I verify that submitted fields saved correctly

    @market7
    Scenario: Verify optional fields
      Given I go to "quote" page
      When I fill out required fields
      And I fill out optional fields
      And I submit the form
      Then I verify that optional submitted fields saved correctly

