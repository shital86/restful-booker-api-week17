package com.herokuapp.bookerinfo;

import com.herokuapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetBooking extends TestBase {
    @Test

        public void getAllRecord() {
            Response response = given()
                    .when()
                    .get("/booking");
            response.then().statusCode(200);
            response.prettyPrint();
        }

}
