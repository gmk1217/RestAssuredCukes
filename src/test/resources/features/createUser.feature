Feature: create user using Post

  Scenario: Create user using post method with JsonFile body content

    When i post in to the url
    Then i should get success response 201
