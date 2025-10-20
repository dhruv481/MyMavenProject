import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;


public class APIDemo1 {

    @Test
    void demo_test(){
        given()
                .get("http://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data[4].first_name", equalTo("George"))
                .log().all();
    }
}
