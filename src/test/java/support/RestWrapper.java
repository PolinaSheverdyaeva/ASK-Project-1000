package support;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class RestWrapper {
    private String baseUrl = "https://skryabin.com/recruit/api/v1/";
    private String loginToken;

    public void login(Map<String, String> user){
        //prepare
        RequestSpecification request = RestAssured
                .given()
                .baseUri(baseUrl)
                .basePath("/login")
                .header("Content-Type", "application/json")
                .body(user);
        // execute
        Response response = request
                .when()
                .post();
        //verify and extract
        Map <String, Object> result = response
                .then()
                .statusCode(200)
                .extract()
                .jsonPath()
                .getMap("");
        System.out.println(result);
    }
}
