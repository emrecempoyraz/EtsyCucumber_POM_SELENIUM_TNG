@parallel1

  Feature: Categories
    Scenario: user selects the categories and sub categories
      Given user goes to base url
      Then user selects Jewelry & Accessories menu
      And user selects Bags & Purses sub menu
      Then user assert that sub categories contain "Handbags" , "Backpacks" , "Diaper Bags"