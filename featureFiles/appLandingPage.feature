@Smoke
Feature: AppLandingPage feature
  I want to use this template for my feature file

  @LandingPage
  Scenario: Validate application landing page
    Given I open application url
    Then I validate the user is on app landing page

  @Login
  Scenario: Validate application login with valid username and password
    Given I open application url
    When I login with user id r.singh@prowareness.nl and password Nov@2017
    Then I validate user is successfully login to application
