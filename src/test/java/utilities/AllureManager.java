package utilities;

import io.qameta.allure.Attachment;

public class AllureManager {
    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String message) {
        return message;
    }
}
