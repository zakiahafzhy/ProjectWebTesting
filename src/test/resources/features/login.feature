Feature: Login feature in demoqa.com
  As a user
  I want to login on BookStore Application
  So that I can see list my BookStore


  Scenario: Login with valid username and valid password
    Given I am on the Login page
    When I enter my username and Password correctly
    When I click 'Login' button Success
    Then I am taken to the dashboard

#  Scenario: Login with valid username and invalid password
#    Given I am on the Login page
#    When I enter my valid username and invalid password
#    And I click 'Login' button Invalid Password
#    Then I am failed to login and I can see error message invalid password
#
#  Scenario: Login with invalid username and valid password
#    Given I am on the Login page
#    When I enter my invalid username and valid password
#    And I click 'Login' button Invalid Username
#    Then I am failed to login and I can see error message that format username is invalid
#
#  Scenario: Login with invalid username and invalid password
#    Given I am on the Login page
#    When I enter my invalid username and invalid password
#    And I click 'Login' button Invalid All
#    Then I am failed to login and I can see error message that username and password incorrect
#
#  Scenario: Login with empty username and valid password
#    Given I am on the Login page
#    When I enter my valid password only
#    And I click 'Login' button Empty Username
#    Then I am failed to login and I can see alert field username should be filled
#
#  Scenario: Login with valid username and empty password
#    Given I am on the Login page
#    When I enter my valid username only
#    And I click 'Login' button Empty Password
#    Then I am failed to login and  I can see alert field password should be filled
#
#  Scenario: Login with empty username and empty password
#    Given I am on the Login page
#    When I don't fill field username and field password
#    And I click 'Login' button Empty All
#    Then I am failed to login and I can see error message that username and password should be filled

