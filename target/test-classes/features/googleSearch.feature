


Feature:Google search functionality
  Agile story: As a user, when I am on the google search page, I should be able to search whatever I want , and see relevant information


@abc
  Scenario: Google home page footer links verification
     Given user is on google home page

    Then user should see following list
      | Advertising      |
      | Business         |
      | How Search works |
      | Privacy          |
      | Terms            |

