
Feature: Bounty project
  

  Scenario: Check whether results for paper is present
    Given Navigate to Bounty website 
    When seerched for <name>
    Then Result for paper is present

 
    Examples: 
      | name  |
      |paper	|
