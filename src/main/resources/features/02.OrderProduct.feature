#Author: aanfaspay2022@gmail.com

Feature: Order Product

  Scenario: User create order success
    When User go to Website Shop
    And User select the product
    And User select the color and size
    And User add quantity
    And User click ADD TO CART button
    And User click VIEW CART button
    And User click PROCCED TO CHECKOUT button
    And User input name
    And User input address
    And User input contact
    And User click TnC checkbox
    And User click PLACE ORDER
    Then The order is succeed