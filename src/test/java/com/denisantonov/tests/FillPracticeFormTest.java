package com.denisantonov.tests;

import com.denisantonov.TestBase;
import com.denisantonov.pages.RegistrationFormPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FillPracticeFormTest extends TestBase{

    @Test
    void fillPracticeForm() {

        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $("#firstName").setValue("Denis");
        $("#lastName").setValue("Antonov");
        $("#userEmail").setValue("examples@mail.com");
        $("#genterWrapper").find(byText("Male")).click();
        $("#userNumber").setValue("9111111111");
        // Работа с календарем
        $(".react-datepicker-wrapper").click();
        $(".react-datepicker__year-select").selectOption("1989");
        $(".react-datepicker__month-select").selectOption("January");
        $(".react-datepicker__day--021").click();

        $("#subjectsWrapper").click();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("#hobbiesWrapper").find(byText("Reading")).click();
        $("#uploadPicture").uploadFromClasspath("picture.png");
        $("#currentAddress").setValue("Some adress");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(
                text("Denis Antonov"),
                text("examples@mail.com"),
                text("Male"),
                text("9111111111"),
                text("21 January,1989"),
                text("Maths"),
                text("Reading"),
                text("picture.png"),
                text("Some adress"),
                text("NCR Delhi"));
    }
}