$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("createUser.feature");
formatter.feature({
  "line": 1,
  "name": "create user using Post",
  "description": "",
  "id": "create-user-using-post",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create user using post method with JsonFile body content",
  "description": "",
  "id": "create-user-using-post;create-user-using-post-method-with-jsonfile-body-content",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "i post in to the url",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "i should get success response 201",
  "keyword": "Then "
});
formatter.match({
  "location": "createUserSteps.i_post_in_to_the_url()"
});
formatter.result({
  "duration": 3462940832,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 30
    }
  ],
  "location": "createUserSteps.i_should_get_success_response(int)"
});
formatter.result({
  "duration": 2879366,
  "status": "passed"
});
formatter.uri("getUser.feature");
formatter.feature({
  "line": 1,
  "name": "Get the user detail",
  "description": "",
  "id": "get-the-user-detail",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Get user details for the api",
  "description": "",
  "id": "get-the-user-detail;get-user-details-for-the-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "i use get method for the API to get user information",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "i should get success response 200",
  "keyword": "Then "
});
formatter.match({
  "location": "GetUser.i_use_get_method_for_the_API_to_get_user_information()"
});
formatter.result({
  "duration": 165830642,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 30
    }
  ],
  "location": "createUserSteps.i_should_get_success_response(int)"
});
formatter.result({
  "duration": 122709,
  "status": "passed"
});
});