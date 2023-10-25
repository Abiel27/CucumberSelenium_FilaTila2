Feature: demoQA practice find elements
  as a user I should be able to find the UI demoQA elements
@zxc
  Scenario: DemoQA default title verification
    Given user is on the demoQA landing page
  When user check the header
    Then user should see webElements as expected