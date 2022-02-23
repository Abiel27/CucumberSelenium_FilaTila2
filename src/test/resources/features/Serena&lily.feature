#noinspection CucumberUndefinedStep
Feature: Serena & Lily


  Scenario: Serena & Lily default title verification
    Given user is on the Serena & Lily landing page
    Then user should see Serena & Lily title as expected

    #expected: Serena and Lily | A Fresh Approach to Bedding, Furniture, and Home

  @sl
  Scenario: Serena & lily title verification
    Given user is on the Serena & Lily landing page
    And use has entered "abielmenghistu@gmail.com" and sumited
    When user searches for "pillow"
    Then user should see "pillow" in the Serena & Lily title
    Then user sees "Serena & Lily9876" in the main header


