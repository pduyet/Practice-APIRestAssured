package utilities;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadJson {
    public static String getJsonValue(String filePath, String node) {
        File input = new File(filePath);

        JsonElement fileElement = null;
        try {
            fileElement = JsonParser.parseReader(new FileReader(input));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert fileElement != null;
        JsonObject fileObject = fileElement.getAsJsonObject();
        return fileObject.get(node).getAsString();
    }
}
