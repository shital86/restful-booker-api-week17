package com.herokuapp.bookerinfo;

import com.herokuapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteBooking extends TestBase {
    @Test
    public void updateBookingByID() {
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer 0474d697c0f327f")
                .auth().preemptive().basic("admin","password123")
                .pathParam("id",1193)
                .when()
                .delete("/booking/{id}");
        response.prettyPrint();
        response.then().statusCode(201);
    }
}
