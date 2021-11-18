
Feature: tide project
  

 
  Scenario: checkproduct
    Given Load website
    When Hover on Shop Products from top navigation
    And Choose powder from the drop-down
    Then Verify if the Tide Free and Gentle powder is listed in 5 products list
   
 