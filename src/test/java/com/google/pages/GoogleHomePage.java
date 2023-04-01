package com.google.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class GoogleHomePage {
    public static final SelenideElement searchField = $(byName("q"));
    public static final SelenideElement searchByVoice = $(By.xpath("//div[@aria-label='Search by voice']"));
    public static final SelenideElement searchByVoiceToolTip = $(By.xpath("//div[contains(text(), 'Search by voice')]"));

    public boolean isOpened() {
        return $(byName("q")).isDisplayed();
    }

    public void search(String text) {
        searchField.val(text).pressEnter();
    }
}
