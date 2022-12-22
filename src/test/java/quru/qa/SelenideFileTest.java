package quru.qa;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class SelenideFileTest {

    @Test
    void selenideFileDownloadTest() throws Exception {
        open("https://github.com/selenide/selenide/blob/master/README.md");
        File downloadedFile = $("#raw-url").download();

        try (InputStream is = new FileInputStream(downloadedFile)) {
            byte[] fileSource = is.readAllBytes();
            String fileContent = new String(fileSource, StandardCharsets.UTF_8);
            assertThat(fileContent).contains("Selenide = UI Testing Framework powered by Selenium WebDriver");
        }
    }

    @Test
    void uploadFile() throws Exception {
        open("https://fineuploader.com/demos.html");
        $("input[type='file']").uploadFromClasspath("img/r&m.png");
        $("div.qq-file-info").shouldHave(text("r&m.png"));
    }
}
