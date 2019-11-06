package com.janushenderson.automation.stepdefinitions;

import com.janushenderson.automation.Utilities;
import com.janushenderson.automation.builders.*;
import com.janushenderson.automation.steps.GitHubAPISteps;
import com.janushenderson.automation.steps.RequestSpecSteps;
import com.janushenderson.automation.steps.RequestSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class GitHubAPIStepDefinition {

    @Steps
    UserDTO userDTO;
    RepositoryResponseDTO repositoryResponseDTO;
    RequestSpecification requestSpec;
    RepositoryDTO repositoryDTO;
    Utilities utils;
    GitHubAPISteps gitHubAPISteps;
    RequestSpecSteps requestSpecSteps;


    @Given("^the user Builds a Base Request Specification$")
    public void the_user_Builds_a_Base_Request_Specification() throws Exception {
        requestSpec = requestSpecSteps.createSpec(requestSpecSteps.setBasicAuth());
    }

    @Given("the user has a Github account")
    public void the_user_has_a_Github_account() {

    }

    @When("the user executes a GET User call")
    public void the_user_executes_a_GET_User_call() throws IOException{
        utils = new Utilities();

        userDTO = RequestSteps.getRequest(requestSpec, utils.getProperty("UserResource"), UserDTO.class);
    }

    @Then("the user receives a response with the correct github project details")
    public void the_user_receives_a_response_with_the_correct_github_project_details() {
        gitHubAPISteps = new GitHubAPISteps();
        gitHubAPISteps.AssertEqualUser(userDTO, UserBuilder.BuildUserJSON());
    }

    @When("the user Creates a new GitHub Repository")
    public void the_user_Creates_a_new_GitHub_Repository() throws IOException {

        utils = new Utilities();

        repositoryDTO = RepositoryBuilder.BuildRepositoryDTO();

        repositoryResponseDTO = RequestSteps.postRequest(requestSpec, utils.getProperty("RepositoryResource"),
                repositoryDTO, RepositoryResponseDTO.class);
    }

    @Then("^the github repository is created in the system$")
    public void the_github_repository_is_created_in_the_system() {
        gitHubAPISteps = new GitHubAPISteps();
        gitHubAPISteps.AssertRepositoryCreated(repositoryDTO, repositoryResponseDTO);
    }

}
