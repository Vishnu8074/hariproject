
Feature: tide project
 
  Scenario: serach antibacterial
    Given load google and website
    When click search and send <name>
    Then check if it is present
    And close the driver
    Examples:
    name					|
    AntiBacterial	|

