package test;

import constant.Element;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.JsonUtilities;
import utilities.Listener;

import static steps.Supports.sendGet;

@Listeners(Listener.class)
public class JsonPlaceHolderTests {

    @BeforeTest
    public void setUp() {
        RestAssured.baseURI = Element.BaseURIJsonPlaceHolder;
    }

    @Test (description = "lay danh sach viec can lam theo id")
    public void getListTodos() {
        for (int i = 1; i <= 3; i++) {
            Response res = sendGet(Element.Todos + "/" + i);
            String title = JsonUtilities.jsonValue(res.prettyPrint(), "title");
            System.out.println(title);
            System.out.println("-----");
            Assert.assertEquals(res.statusCode(), 200);
        }

    }




}