package test;

import collection.POSTMethod;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.Listener;

import static io.restassured.RestAssured.given;

@Listeners(Listener.class)
public class SimpleTest {

    @BeforeMethod
    public void setUp() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        RestAssured.basePath = "/todos";
    }

    @Test (description = "lay danh sach viec can lam theo id")
    public void getListTodos() {
        int i;
        for (i = 1; i <= 10; i++) {
            Response response = given()
                    .when()
                    .get("/" + i);
            response.prettyPrint();
            Assert.assertEquals(response.statusCode(), 200);
        }
    }

    @Test
    public void postPost() {
        Assert.assertEquals(POSTMethod.postToDo().statusCode(), 201, "sai statusCode");
    }
}