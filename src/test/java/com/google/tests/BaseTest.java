package com.google.tests;

import com.google.pages.GoogleHomePage;
import com.google.pages.GoogleSearchPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;
import static com.google.config.PropertyLoader.loadProperty;
import static com.google.utils.Constants.URL_PROPERTY;

public class BaseTest {
    GoogleHomePage googleHomePage = new GoogleHomePage();
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @BeforeMethod
    public void appSetup() {
        open(loadProperty(URL_PROPERTY));
    }

    @AfterMethod
    public void closeApp() {
        closeWebDriver();
    }
}
