@regression
Feature: Sauce demo cucumber test

  Scenario: login, sort, add product, checkout and logout
    Given I navigate to sauce demo web site
    When I enter user name and password
    And I click on the login button
    Then I sort the products from low to high
    Then I added first product
    Then I open the shopping cart page
    Then I check the added item is correct
    Then I click on checkout button
    Then I enter contact details
    Then I click on continue button
    Then I click on finish button
    And I logout