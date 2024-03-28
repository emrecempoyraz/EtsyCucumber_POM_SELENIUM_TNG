@all

  Feature: Search testing
    Scenario: search
      Given user goes to base url
      And clicks search text area and sends "samsung" for searching
      Then user verifies that all listed records contain the "samsung"