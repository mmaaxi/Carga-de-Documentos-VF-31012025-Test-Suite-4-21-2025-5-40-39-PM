Feature: Validate logout and access to protected section

  Scenario: Validate successful logout and prevention of access to protected section
    Given the user is logged in and has loaded a document
    When the user logs out using the corresponding option
    Then the system should log out the user and redirect to the login page
    When the user attempts to access a protected section without logging in
    Then the system should automatically redirect the user to the login screen