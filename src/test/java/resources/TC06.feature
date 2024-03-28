
  Feature: Subcategories
    Scenario: Add to cart
      Given user goes to base url
      And user clicks to sign in button
      And user clicks email area and enters valid email address
      And user enters valid password
      And user clicks sign in
      And clicks search text area and sends "samsung" for searching
      And user selects first item listed
      And user verifies that the properties of the selected item are displayed
      And user clicks add to cart button
      Then user confirms that the product is in the cart