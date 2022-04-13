package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class test {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String pPath = System.getProperty("user.dir");
        String proPath = "/Practice-APIRestAssured/src/test/resources/data.properties";
        FileInputStream fIn = new FileInputStream(pPath + proPath);
        properties.load(fIn);
        String value;
        try {
            value = properties.getProperty("email");
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
