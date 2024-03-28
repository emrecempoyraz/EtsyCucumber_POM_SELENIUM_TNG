@all

  Feature: Sign in

    Scenario: positive sign in
      Given user goes to base url
      And user clicks to sign in button
      And user clicks email area and enters valid email address
      And user enters valid password
      And user clicks sign in
      Then user verifies that sees your profile
      Then user signs out


    Scenario: negative sign in
      Given user goes to base url
      And user clicks to sign in button
      And user clicks email area and enters valid email address
      And user enters invalid password
      And user clicks sign in
      Then user verifies that sees fail message