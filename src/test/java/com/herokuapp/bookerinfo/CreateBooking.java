package com.herokuapp.bookerinfo;

import com.herokuapp.model.HerokuAppPojo;
import com.herokuapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CreateBooking extends TestBase {

    @Test
    public void createAnewBooking() {
        HashMap<Object, Object> bookingsDatesData = new HashMap<>();
        bookingsDatesData.put("checkin", "2018-01-01");
        bookingsDatesData.put("checkout", "2019-01-01");

        HerokuAppPojo herokuappPojo = new HerokuAppPojo();
        herokuappPojo.setFirstname("Jim");
        herokuappPojo.setLastname("Brown");
        herokuappPojo.setTotalprice(111);
        herokuappPojo.setDepositpaid(true);
        herokuappPojo.setBookingdates(bookingsDatesData);
        herokuappPojo.setAdditionalneeds("Breakfast");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(herokuappPojo)
                .when()
                .post("/booking");
        response.prettyPrint();
        response.then().statusCode(200);

    }

}
