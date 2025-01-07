package com.mtn.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MyStepdefs {

    private HttpRequest request;
    HttpResponse<String> response;
    @Given("loading the swagger Ui")
    public void loadingTheSwaggerUi() {
        this.request=HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8084/v1/user"))
                .method("POST", HttpRequest.BodyPublishers.noBody())
                .build();
    }
    @When("click on the try button")
    public void clickOnTheTryButton() throws IOException, InterruptedException {
        this.response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    }
    @Then("verify the output")
    public void verifyTheOutput() throws IOException, InterruptedException {

        Assert.assertEquals(response.statusCode(),200);
    }

    @Given(": when the processor layer is up")
    public void whenTheProcessorLayerIsUp() {
    }
}
