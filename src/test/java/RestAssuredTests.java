import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.junit.jupiter.api.Test;

class RestAssuredTests {
  @Test
  public void testAPI() {
    when()
        .get("https://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1")
    .then()
        .log().body();
  }
}
