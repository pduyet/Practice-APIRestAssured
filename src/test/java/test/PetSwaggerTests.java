package test;

import collection.GETMethod;
import collection.POSTMethod;
import collection.PUTMethod;
import constant.Element;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.JsonUtilities;
import utilities.Listener;
import utilities.Utilities;

import java.util.ArrayList;
import java.util.List;

@Listeners(Listener.class)
public class PetSwaggerTests {
    @BeforeMethod
    public void setUp() {
        RestAssured.baseURI = Element.BaseSwaggerURI;
    }

    List<String> listIDPet = new ArrayList<>();

    @Epic("create pet")
    @Test(priority = 1)
    public void postPet() {
        System.out.println("Create Pet");
        String res = POSTMethod.creatYourPet().asPrettyString();
        String idPet = JsonUtilities.jsonValue(res, "id");
        listIDPet.add(idPet);
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.TRIVIAL)
    public void getIDPet() {
        System.out.println("Get Pet");
        int id = Utilities.randomNumber(listIDPet.size());
        GETMethod.getPetID(listIDPet.get(1)).prettyPrint();
    }

    @Test(priority = 3)
    @Severity(SeverityLevel.BLOCKER)
    public void updateNamePet() {
        System.out.println("Update Pet's information");
        Response res = PUTMethod.updateInformationPet();
        res.prettyPrint();
    }
}
