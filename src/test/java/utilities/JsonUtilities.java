package utilities;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class JsonUtilities {
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

    public static String jsonValue(String fileName, String node) {
        JsonObject jsonObject = new Gson().fromJson(fileName, JsonObject.class);
        return jsonObject.get(node).getAsString();
    }

    public static String jsonValue(JsonObject json, String node) {
        return json.get(node).getAsString();
    }

    public static String updateValue(String jsonPath, String node, String newValue) {
        Gson gson = new Gson();
        try {
            Reader reader = Files.newBufferedReader(Paths.get(jsonPath));
            Map<String, String> map = gson.fromJson(reader, Map.class);
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
            map.put(node, newValue);
            System.out.println("---------");
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
            return new Gson().toJson(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
