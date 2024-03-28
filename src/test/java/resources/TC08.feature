@parallel2

  Feature: Location Test
    Scenario: user should be able to change region and language settings
      Given user goes to base url
      And user click to region settings
      And user selects region "Turkey"
      And user selects language "English (US)"
      And user selects currency "TRY"
      Then user verifies that the page is loaded with the correct region option "TL"