Feature: A user interacts with elements on the homepage

  Background: Necessary steps for each scenario
    Given the home page is accessed

  Scenario: the user clicks hide contents button
    When the user clicks on the hide button
    Then the contents should be hidden

  Scenario: the user opens an image then closes it
    When the user clicks on image
    Then the user closes image

  Scenario: the user clicks on play button
    When the user clicks on the play button
    Then the video should start playing

  Scenario: the user accesses the contents of the article
    When the user clicks on a title from the contents
    Then the subtitles are extended

  Scenario: the user wants to see more content by scrolling down
    When the user scrolls down the page
    Then the user should be able to see more content

  Scenario: the user selects a different language
      When the user clicks on languages
      Then the foreign language page is displayed

  Scenario: the user searches for a topic on Wikipedia
    When the user enters "Mihai Eminescu" into the search bar
    And the user clicks on the search button
    Then the search results page for "Mihai Eminescu" should be displayed