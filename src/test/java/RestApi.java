import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestApi {
    @Test

    public void CreateUser(){
        given()
                .baseUri("https://reqres.in")
                .basePath("/api/users")
                .contentType(ContentType.JSON)
                .when().post()
                .then().statusCode(201);
    }

}
