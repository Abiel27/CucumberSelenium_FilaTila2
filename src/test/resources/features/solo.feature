Feature: Simple examples of how dataTable works

  @dataTable
  Scenario: user should be able to login with correct credentials
    Given user is on log in page of soloLearn
    When user enters below info
    |username|abielmenghistu@gmail.com|
    |password|PageObjectModel@27|
    Then user should see title changed to Abiel Menghistu