package SLProject;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class DeleteDemo {
    @Test
    public void deleteResource() {
        // Setting the base URI and base path for the API
        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.basePath = "/api/users/694";

        // Using RestAssured to send a DELETE request
        RestAssured
            .when()
            .delete()
            .then()
            .statusCode(204);  // Asserting that the HTTP response code is 204 (No Content)
    }
}
