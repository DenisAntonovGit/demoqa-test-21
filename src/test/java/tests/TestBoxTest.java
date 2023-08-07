package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestBoxTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void testBoxTest() {

        open("/text-box");
        executeJavaScript("$('#fixedban').remove()");
        $("#userName").setValue("Antonov Denis");
        $("#userEmail").setValue("example@email.com");
        $("#currentAddress").setValue("Georgia, Tbilisi");
        $("#permanentAddress").setValue("Georgia, Tbilisi");
        $("#submit").scrollTo();
        $("#submit").click();

        $("#output").shouldHave(text("Antonov Denis"));
        $("#output").shouldHave(text("example@email.com"));
        $("#output").shouldHave(text("Georgia, Tbilisi"));
        $("#output").shouldHave(text("Georgia, Tbilisi"));
    }
}
