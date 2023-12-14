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

Feature: Greencartdealspage
  I want to shop the vegetables

  @deals
  Scenario: add vegetables to your cart 
    When user is on home page
    Then able to see lot of veggies and fruits
    When user want to check <vegatables> whether they are offer
    |    "Mango"        |
    |    "Brinjal"      |
    Then user selected few veggies and click deals links
    When user instead of searching he is checking all the pages in dealpage
    Then able to see those vegies
    
    