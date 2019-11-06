$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/GithubAPI.feature");
formatter.feature({
  "name": "GitHub API",
  "description": "  As a github user\n  I want to be able to call the Github API to find out more information on github projects",
  "keyword": "Feature"
});
formatter.background({
  "name": "Build a Base Request Specification",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user Builds a Base Request Specification",
  "keyword": "Given "
});
formatter.match({
  "location": "GitHubAPIStepDefinition.the_user_Builds_a_Base_Request_Specification()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "GET User details from Github",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "the user has a Github account",
  "keyword": "Given "
});
formatter.match({
  "location": "GitHubAPIStepDefinition.the_user_has_a_Github_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user executes a GET User call",
  "keyword": "When "
});
formatter.match({
  "location": "GitHubAPIStepDefinition.the_user_executes_a_GET_User_call()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user receives a response with the correct github project details",
  "keyword": "Then "
});
formatter.match({
  "location": "GitHubAPIStepDefinition.the_user_receives_a_response_with_the_correct_github_project_details()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Build a Base Request Specification",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user Builds a Base Request Specification",
  "keyword": "Given "
});
formatter.match({
  "location": "GitHubAPIStepDefinition.the_user_Builds_a_Base_Request_Specification()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create a new Repository in Github",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "the user has a Github account",
  "keyword": "Given "
});
formatter.match({
  "location": "GitHubAPIStepDefinition.the_user_has_a_Github_account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user Creates a new GitHub Repository",
  "keyword": "When "
});
formatter.match({
  "location": "GitHubAPIStepDefinition.the_user_Creates_a_new_GitHub_Repository()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the github repository is created in the system",
  "keyword": "Then "
});
formatter.match({
  "location": "GitHubAPIStepDefinition.the_github_repository_is_created_in_the_system()"
});
formatter.result({
  "status": "passed"
});
});