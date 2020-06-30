package pl.dzon.uuidgenerator;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasLength;

@QuarkusTest
public class UUIDControllerTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/generator/uuid")
          .then()
             .statusCode(200)
             .body(hasLength(36));
    }

}