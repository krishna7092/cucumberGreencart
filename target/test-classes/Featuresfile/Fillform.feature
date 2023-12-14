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
@tag
Feature: Fillupthe form
  I want to use driven data for fill up the form
  
  Background:
    Given: user should able to login on protocommerce webpage

  @tag1
  Scenario: Filluptheform
    When user is on the fill up form with below details
    |      "krishnakumar"                      |
    |      "krishnakumar7092@gmail.com"        |
    |       "krishna7092"                      |
    |           "Male"                         |
    |           "employee"                     |
    |            "20-03-2000"                  |
  
    And successfully able to submit
   
