package SLProject;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class GETDemo {
    @Test
    public void getServerResponse() {
        // Using RestAssured to make a GET request
        RestAssured
            .when()
            .get("https://restcountries.com/v3.1/all")
            .then()
            .assertThat()
            .statusCode(200)  // Asserting that the HTTP response code is 200 (OK)
            .log().all();  // Logging the response details
    }
}
