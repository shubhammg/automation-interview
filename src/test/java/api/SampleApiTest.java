package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleApiTest {

    @Test
    public void getUserTest() {
        Response response = RestAssured.given()
                .baseUri("https://reqres.in")
                .header("Content-Type", "application/json")
                .get("/api/users/2");

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
