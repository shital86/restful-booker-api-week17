package com.herokuapp.bookerinfo;

import com.herokuapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetBookingId extends TestBase {
    @Test
    public void getBookingId() {
        Response response = given()
                .pathParam("id", 642)
                .when()
                .get("/booking/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}