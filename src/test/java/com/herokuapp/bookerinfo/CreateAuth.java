package com.herokuapp.bookerinfo;

import com.herokuapp.model.HerokuAppPojo;
import com.herokuapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreateAuth extends TestBase {
    @Test
    public void createAuth() {
        HerokuAppPojo herokuAppPojo = new HerokuAppPojo();
herokuAppPojo.setUsername("admin");
herokuAppPojo.setPassword("password123");

        Response response =given()
                .header("Content-Type","application/json")
                .body(herokuAppPojo)
                .when()
                .post("/auth");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
