@javaTwo
  Feature: Java Two Feature

    @javaTwo1
    Scenario: Java Two Scenario - Hello World
      Given I write java step
      When I print the variables "my var" and "my VAR" into console using regexp
      And I print the variables "my var" and "my Var" into console in reverse order
      And I write another java step with argument "my message"