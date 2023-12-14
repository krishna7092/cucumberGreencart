#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Greencarthomepage
  I want to shop the vegetables

  @greencart
  Scenario: add vegetables to your cart 
    When user is on home page
    Then able to see lot of veggies and fruits
    When user want to add one <vegetables> to cart with count <quantity>
    Then user able to add to cart and checkout
    When user able to see <vegetables> and <quantity> at place order page
    Then user able to apply code "rahulshettyacademy" and place the order
    When user is on add a country "India" and accepted it
    Then user is able to see the confirmation page "Thank you, your order has been placed successfully"
    And routed to home page successfully
    
    Examples:
    |vegetables |  quantity |
  #  | "potato"       |   4       |
    | "onion"       |   2      |
  
   @invalid
  Scenario: invalid search
    When user is on home page
    Then able to see lot of veggies and fruits
    When user typing invalid <vegatables> 
    Then user able to see "Sorry, no products matched your search!"
   
    
    Examples:
    |vegetables          |  
    | "shredf1234"       |
   # | 12243243           |
  