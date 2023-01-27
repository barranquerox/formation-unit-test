import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RestAssuredTests {

  String url = "https://demo.guru99.com/V4/sinkministatement.php";

  @Test
  void testAPI() {

    int statusCode = given().
        queryParam("CUSTOMER_ID", "68195").
        queryParam("PASSWORD", "1234!").
        queryParam("Account_No", "1").
    when()
        .get(url).getStatusCode();

    System.out.println("Status code est: " + statusCode);
    assertEquals(200, statusCode, "The status code is not 200");
  }

  @Test
  void testApi2() {
    when().get(url).then().assertThat().statusCode(200);
  }
}
