@parallel1

  Feature: Select the product
    Scenario: user can see the product properties
      Given user goes to base url
      And clicks search text area and sends "samsung" for searching
      And user chooses a random product listed
      Then user confirms that has seen the features of the product