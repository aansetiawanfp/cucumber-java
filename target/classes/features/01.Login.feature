#Author: aanfaspay2022@gmail.com

Feature: Login User

  Scenario: User valid login
    When User go to Website
    And User enter username
    And User enter password
    And User click remember me
    And User click button login
    Then User valid credentials
    