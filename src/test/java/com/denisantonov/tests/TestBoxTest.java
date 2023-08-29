package com.denisantonov.tests;

import com.denisantonov.TestBase;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestBoxTest extends TestBase {

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

        $("#output").shouldHave(
                text("Antonov Denis"),
                text("example@email.com"),
                text("Georgia, Tbilisi"),
                text("Georgia, Tbilisi"));
    }
}
