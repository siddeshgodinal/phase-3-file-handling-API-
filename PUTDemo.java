package SLProject;

import java.util.HashMap;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class PUTDemo {
    HashMap<String, String> map = new HashMap<String, String>();

    @BeforeMethod
    public void createPayLoad() {
        // Creating a HashMap to represent the payload (data to be sent in the request body)
        map.put("name", "morpheus");
        map.put("job", "programmer");

        // Setting the base URI and base path for the API
        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.basePath = "/api/users/694";
    }

    @Test
    public void createResource() {
        // Using RestAssured to send a PUT request
        RestAssured
            .given()
            .contentType("application/json")  // Setting the content type of the request body
            .body(map)  // Setting the request body with the payload
            .when()
            .put()  // Making a PUT request
            .then()
            .statusCode(200)  // Asserting that the HTTP response code is 200 (OK
