@parallel1

  Feature: Create collection
    Scenario: Create new collection
      Given user goes to base url
      And user clicks to sign in button
      And user clicks email area and enters valid email address
      And user enters valid password
      And user clicks sign in
      And user clicks favorites button
      And user clicks create collection button
      And user sends collection name "new" and clicks create button
      Then user verifies that the collection of "new" exists
