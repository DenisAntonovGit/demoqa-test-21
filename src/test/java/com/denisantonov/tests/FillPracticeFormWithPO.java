package com.denisantonov.tests;

import com.denisantonov.TestBase;
import com.denisantonov.pages.RegistrationFormPage;
import org.junit.jupiter.api.Test;

public class FillPracticeFormWithPO extends TestBase {

    RegistrationFormPage registrationPage = new RegistrationFormPage();

    @Test
    void fillPracticeFormWithPageObjects() {
        registrationPage
                .openPage()
                .removeFixedBan()
                .removeFooterBanner()
                .setFirstName("Denis")
                .setLastName("Antonov")
                .setEmail("examples@mail.com")
                .setGender("Male")
                .setUserNumber("9111111111")
                .setBirthDay("1989", "January")
                .setSubject("Math")
                .setHobbie("Reading")
                .uploadPicture("picture.png")
                .setAdress("Some adress")
                .setState("NCR")
                .setCity("Delhi")
                .submitFilledForm();
    }
}
