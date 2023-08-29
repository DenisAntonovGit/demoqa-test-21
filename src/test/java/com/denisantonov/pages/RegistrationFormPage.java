package com.denisantonov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPage {

    SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderChoice = $("#genterWrapper"),
            userNumberInput = $("#userNumber"),
            birthDateArea = $(".react-datepicker-wrapper"),
            calendarYearPick = $(".react-datepicker__year-select"),
            calendarMonthPick = $(".react-datepicker__month-select"),
            calendarDayPick = $(".react-datepicker__day--021"),
            subjectArea = $("#subjectsWrapper"),
            subjectInput = $("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            adressInput = $("#currentAddress"),
            stateField = $("#state"),
            stateInput = $("#stateCity-wrapper"),
            cityField = $("#city"),
            cityInput = $("#stateCity-wrapper"),
            submitButton = $("#submit");

    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        return this;
    }

    public RegistrationFormPage removeFixedBan() {
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    public RegistrationFormPage removeFooterBanner() {
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationFormPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;
    }

    public RegistrationFormPage setLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;
    }
    public RegistrationFormPage setEmail(String email) {
        userEmailInput.setValue(email);
        return this;
    }

    public RegistrationFormPage setGender(String gender) {
        genderChoice.find(byText(gender)).click();
        return this;
    }

    public RegistrationFormPage setUserNumber(String number) {
        userNumberInput.setValue(number);
        return this;
    }

    public RegistrationFormPage setBirthDay(String year, String month) {
        birthDateArea.click();
        calendarYearPick.selectOption(year);
        calendarMonthPick.selectOption(month);
        calendarDayPick.click();
        return this;
    }

    public RegistrationFormPage setSubject(String subject) {
        subjectArea.click();
        subjectInput.setValue(subject).pressEnter();
        return this;
    }

    public RegistrationFormPage setHobbie(String hobbie) {
        hobbiesInput.find(byText(hobbie)).click();
        return this;
    }

    public RegistrationFormPage uploadPicture(String fileName) {
        uploadPicture.uploadFromClasspath(fileName);
        return this;
    }

    public RegistrationFormPage setAdress(String adress) {
        adressInput.setValue(adress);
        return this;
    }

    public RegistrationFormPage setState(String state) {
        stateField.click();
        stateInput.$(byText(state)).click();
        return this;
    }

    public RegistrationFormPage setCity(String city) {
        cityField.click();
        cityInput.$(byText(city)).click();
        return this;
    }

    public void submitFilledForm() {
        submitButton.click();
    }


}
