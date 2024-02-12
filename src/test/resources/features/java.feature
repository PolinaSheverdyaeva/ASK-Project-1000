@java
  Feature: Java steps

    @java1
    Scenario: Hello world
      Given I say hello world
      When I say "hello to all"
      When I say "my message"

    Scenario: Java variables comparison
#      Given I perform actions with variables "my var" and "my VAR"
#      When I print the variables "my var" and "my VAR" into console using regexp
#      When I print the variables "my var" and "my VAR" into console using printf
#      And I print the variables "my var" and "my VAR" uppercase into console
#      And I compare length of "my var" and "my VAR" into console
#      And I print length of the variables "my var" and "my VAR" into console
#      And I print result of exact comparison of the variables "my var" and "my VAR" into console
#      And I print result of exact comparison ignoring cases of the variables "my var" and "my VAR" into console
#      And I print result of partial comparison of the variables "my var" and "my VAR" into console
#      And I print the variables "my var" and "my VAR" into console in reverse order
      And I print url for "Google"
      And I print url for "bing"
      And I print url for "quote"
      And I print url for "Yahoo"


