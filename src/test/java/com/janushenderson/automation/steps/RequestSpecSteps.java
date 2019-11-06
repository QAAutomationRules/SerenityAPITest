package com.janushenderson.automation.steps;

import com.janushenderson.automation.Utilities;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class RequestSpecSteps {


    @Step
    public static RequestSpecification createSpec(AuthenticationScheme auth) throws IOException {

        Utilities utils = new Utilities();

        RequestSpecification requestSpec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri(utils.getProperty("GitHubBaseURL"))
                .setAuth(auth)
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new RequestLoggingFilter())
                .build();

        return requestSpec;
    }

    @Step
    public static PreemptiveBasicAuthScheme setBasicAuth() throws IOException {

        Utilities utils = new Utilities();

        PreemptiveBasicAuthScheme auth = new PreemptiveBasicAuthScheme();
        auth.setUserName(utils.getProperty("BasicAuthUserName"));
        auth.setPassword(utils.getProperty("BasicAuthPassword"));

        return auth;
    }

}
