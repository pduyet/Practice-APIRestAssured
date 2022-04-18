package test;

import collection.GETMethod;
import collection.POSTMethod;
import collection.PUTMethod;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utilities.JsonUtilities;
import utilities.Utilities;

import java.util.ArrayList;
import java.util.List;

public class PetSwaggerTests {
    List<String> listIDPet = new ArrayList<>();

    @Test(priority = 1)
    public void postPet() {
        System.out.println("Create ");
        String res = POSTMethod.creatYourPet().asPrettyString();
        String idPet = JsonUtilities.jsonValue(res, "id");
        listIDPet.add(idPet);
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.TRIVIAL)
    public void getIDPet() {
        int id = Utilities.randomNumber(listIDPet.size());
        GETMethod.getPetID(listIDPet.get(id));
//        JsonObject jsonObject = new Gson().fromJson(GETMethod.getPetID(listIDPet.get(id)).prettyPrint(), JsonObject.class);
    }

    @Test(priority = 3)
    public void updateNamePet() {
        Response res = PUTMethod.updateInformationPet();
        res.prettyPrint();
        String payload = res.asPrettyString();
        System.out.println("-------");
        String idPet = JsonUtilities.jsonValue(payload, "id");
        GETMethod.getPetID(idPet).prettyPrint();
    }
}
