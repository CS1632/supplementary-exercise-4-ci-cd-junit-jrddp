Feature: Add stress to pitcher

  Background: 
    Given a new pitcher

  Rule: On first call to addStress(int), getStress() returns the amount of stress added.

    Scenario: After adding 10 stress to pitcher, getStress returns 10.
      When I add 10 stress to the pitcher
      Then the pitcher has 10 stress

  Rule: On subsequent calls to addStress(int), stress is accumulated.

    Scenario: After adding 20 stress and then 30 stress to pitcher, getStress returns 50.
      When I add 20 stress to the pitcher
      When I add 30 stress to the pitcher
      Then the pitcher has 50 stress
