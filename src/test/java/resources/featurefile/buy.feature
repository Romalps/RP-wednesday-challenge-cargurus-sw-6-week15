Feature: Search functionality
  As a user I want to buy a car from CarsGuide website

  @sanity
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on buy+sell tab
    And I click Search Cars link
    Then I navigate to "New & Used Car Search" page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make | model | location  | price   |
      | Audi | A8    | NSW - All | $35,000 |
#      | BMW           | 840I              | NSW - New England  | $45,000 |
#      | Honda         | CRX               | NSW - Hunter       | $7,500  |
#      | Land Rover    | Range Rover Velar | QLD - Brisbane     | $20,000 |
#      | Mercedes-Benz | Ml 350            | SA - South East    | $25,000 |
#      | Toyota        | Yaris Cross       | NSW - Central West | $10,000 |

  @smoke
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on buy+sell tab
    And I click Used link
    Then I navigate to used cars for sale "Used Cars For Sale" page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make | model  | location  | price   |
      | Ford | Fiesta | ACT - All | $10,000 |



