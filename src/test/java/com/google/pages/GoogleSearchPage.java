package com.google.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchPage {

    public static final SelenideElement headerSearchResult = $(By.xpath("//div[@data-attrid='title']//span[@role='heading']"));
    public static final SelenideElement firstResult = $("div.yuRUbf a");
    public static final SelenideElement logo = $(By.xpath("//a[@id='logo']"));

    public String getHeaderSearchResult() {
        return headerSearchResult.getText();
    }

    public String getFirstResultLink() {
        return firstResult.attr("href");
    }
}
