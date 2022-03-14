Feature: This is background concept

  Background: A User is logged in
    Given a user is on login page
    When a user enter name and password
    And a clicks on login button
    Then a user is navigated o the homepage

  Scenario: Filling user details
    When B user clicks on logout button
    Then B user back lo sign in page
