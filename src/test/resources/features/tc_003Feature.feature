Feature: Document Upload Validation

  Scenario: Validate large document upload
    Given I access the document upload module
    When I select a large PDF file over 50MB
    Then the system should verify file size and display a warning
    When I try to upload the large file
    Then the system should deny the upload and inform the user about the limit