import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class APITests {

    @Test
    void test1(){
        Response response = RestAssured.get("http://reqres.in/api/users?page=2");

        System.out.println("Response:" + response.asString());
        System.out.println("Status Code : "+ response.getStatusCode());
        System.out.println("Body : "+ response.getBody());
        System.out.println("Header :"+ response.getHeader("content-type"));
    }

    @Test
    void test2() {
        RestAssured.get("http://reqres.in/api/users?page=2").then().statusCode(200);
    }
}
