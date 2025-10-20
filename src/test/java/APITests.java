import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class APITests {

    @Test
    void test1() {
        Response response = RestAssured.given().header("User-Agent", "Java RestAssured").get("https://reqres.in/api/users?page=2");

        System.out.println("Response:" + response.asString());
        System.out.println("Status Code : " + response.getStatusCode());
        System.out.println("Body : " + response.getBody());
        System.out.println("Header :" + response.getHeader("content-type"));
    }

    @Test
    void test2() {
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.given()
                .header("User-Agent", "Java RestAssured")
                .get("https://reqres.in/api/users?page=2").then().statusCode(200);
    }
}
