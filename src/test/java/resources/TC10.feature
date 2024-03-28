
  Feature: Edit collection
    Scenario: Edit collection
      Given user goes to base url
      And user clicks to sign in button
      And user clicks email area and enters valid email address
      And user enters valid password
      And user clicks sign in
      And user clicks favorites button
      And user clicks collection
      And user clicks edit menu
      And user clicks delete collection button
      Then user verifies that collection is deleted