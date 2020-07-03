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
  "name": "i should get success response 200",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});