Feature: Get the user detail

  Scenario: Get user details for the api
    When i use get method for the API to get user information
    Then i should get success response 200
