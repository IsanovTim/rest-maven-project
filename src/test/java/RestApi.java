import api.CreateUserRequest;
import api.CreateUserResponse;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertThat;

public class RestApi {

    @Test
    public void CreateUser(){

        CreateUserRequest rq = new CreateUserRequest();
        rq.setName("morpheus");
        rq.setJob("leader");

        CreateUserResponse rs = given()
                .baseUri("https://reqres.in")
                .basePath("/api/users")
                .contentType(ContentType.JSON)
                .body(rq)
                .when().post()
                .then().extract().as(CreateUserResponse.class);

    }
    @Test
    public void test(){
        given().post("https://reqres.in//api/users").then().statusCode(201);
    }

}
