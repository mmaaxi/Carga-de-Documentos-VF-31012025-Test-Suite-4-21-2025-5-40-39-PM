Feature: Validate document upload retry on network interruption

  Scenario: Validate upload retry on network interruption
    Given I access the upload module
    When I start the upload process of a PDF document
    Then The upload process starts and progress is displayed on the screen
    When I simulate a network interruption during the upload
    Then The upload process is abruptly interrupted and an error message is displayed
    When I retry uploading the same document after the connection is restored
    Then The system allows the resumption or restart of the upload process without duplicating records