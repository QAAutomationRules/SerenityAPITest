package com.janushenderson.automation.steps;

import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class RequestSteps {

    @Step
    public static <T> T getRequest(RequestSpecification requestSpec, String path, Class<T> responseClass) {
        return SerenityRest
                .given()
                .spec(requestSpec)
                .when()
                .get(path)
                .then()
                .statusCode(200)
                .extract().as(responseClass);
    }

    @Step
    public static <T> T postRequest(RequestSpecification requestSpec, String path, Object bodyPayload, Class<T> responseClass) {
        return SerenityRest
                .given()
                .spec(requestSpec)
                .body(bodyPayload)
                .when()
                .post(path)
                .then()
                .statusCode(201)
                .extract().as(responseClass);
    }

    @Step
    public static <T> T putRequest(RequestSpecification requestSpec, String path, Object bodyPayload, Class<T> responseClass) {
        return SerenityRest
                .given()
                .spec(requestSpec)
                .body(bodyPayload)
                .when()
                .put(path)
                .then()
                .statusCode(200)
                .extract().as(responseClass);
    }

    @Step
    public static <T> T deleteRequest(RequestSpecification requestSpec, String path, Class<T> responseClass) {
        return SerenityRest
                .given()
                .spec(requestSpec)
                .when()
                .delete(path)
                .then()
                .statusCode(200)
                .extract().as(responseClass);
    }


    @Step
    public void ValidateStatusCode(int statusCode)
    {
        SerenityRest.then().statusCode(statusCode);
    }


    @Step
    public void PrettyPrintResponse()
    {
        SerenityRest.then().extract().response().body().prettyPrint();
    }

}
