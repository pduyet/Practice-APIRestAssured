package test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.Listener;
import utilities.JsonUtilities;

import static io.restassured.RestAssured.given;

@Listeners(Listener.class)
public class JsonPlaceHolderTests {

    @BeforeMethod
    public void setUp() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
        RestAssured.basePath = "/todos";
    }

    @Test (description = "lay danh sach viec can lam theo id")
    public void getListTodos() {
        int i;
        for (i = 1; i <= 3; i++) {
            Response response = given()
                    .when()
                    .get("/" + i);
            String title = JsonUtilities.jsonValue(response.prettyPrint(), "title");
            System.out.println(title);
            System.out.println("-----");
            Assert.assertEquals(response.statusCode(), 200);

        }
    }




}