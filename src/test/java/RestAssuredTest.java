import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

//import static org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Test;

public class RestAssuredTest {

    String url = "http://demo.guru99.com/V4/sinkministatement.php";

    @Test
    public void testApiFirst() {
//        String url = "http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";
//
//        url = "http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=BADBAD!&Account_No=1";
//
////        given().when().get();
////        given().
//                when().get(url)
//                .then()
//                .log()
////                .all();
//                .body();

        int statusCode =

        given()
                .queryParam("CUSTOMER_ID", 68195)
                .queryParam("PASSWORD", "BADBAD")
                .queryParam("Account_No", "1")
                .when()
                .get(url)
//                .then()
//                .log()
//                .body();
                .getStatusCode();

        System.out.println(statusCode);

        assertEquals(200, statusCode);


    }

    @Test
    public void TestApiShort() {

        String password = "1234!";

        given()
                .queryParam("CUSTOMER_ID", 68195)
                .queryParam("PASSWORD", password)
                .queryParam("Account_No", "1")
                .when().get(url).then().assertThat().statusCode(200);

    }

//    @Test
//    public void TestApiDownload() {
//
//        String password = "1234!";
//
//        given()
//                .queryParam("CUSTOMER_ID", 68195)
//                .queryParam("PASSWORD", password)
//                .queryParam("Account_No", "1")
//        when().get(url).then().
//
//    }

}
