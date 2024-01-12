@smoke
Feature: Login Page

  Background: 
    Given User is on the retail website homepage
    When User click on the login link

  @loginpage
  Scenario: User is able to login to tek retail website
    And User enter email 'guardiantekstudent2@gmail.com' and password 'Tekschool123@'
    And User click on login button
    And Verify user is logged in

  @register
  Scenario Outline: Verify user is able to create account with tek retail website
    And User click on create an new account
    And User enter '<name>' and '<email>' and '<password>' and '<confpassword>'
    And User click on signup button

    Examples: 
      | name | email                   | password      | confpassword  |
      | Dave | tekschool23@gmail.com | tekschool@12 | tekschool@12 |
