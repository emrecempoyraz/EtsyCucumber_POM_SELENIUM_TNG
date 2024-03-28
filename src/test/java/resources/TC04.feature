@all
  Feature: Sorting Test
    Scenario: user can sort products
      Given user goes to base url
      And clicks search text area and sends "samsung" for searching
      And user selects "Lowest Price" sort filter ascending by product listed
      Then user verifies that products aren't listed in ascending order