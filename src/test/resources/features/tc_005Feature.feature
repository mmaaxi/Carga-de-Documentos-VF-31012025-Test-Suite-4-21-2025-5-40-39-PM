Feature: Document preview validation

  Scenario: Validate preview of uploaded document
    Given the user uploads a valid PDF document in the upload module
    When the user selects the preview option for the uploaded document
    Then the system displays a readable preview of the document
    And the preview shows the PDF content correctly, divided into pages without rendering errors