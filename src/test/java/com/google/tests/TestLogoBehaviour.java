package com.google.tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import static com.google.pages.GoogleSearchPage.logo;
import static com.google.utils.LoggerExtension.LOGGER;
import static org.assertj.core.api.Assertions.assertThat;

public class TestLogoBehaviour extends BaseTest {

    @Test(description = "Google homepage is open after logo click from search results page")
    public void testLogoBehaviour() {
        LOGGER.info("Search for random query");
        googleHomePage.search(RandomStringUtils.randomAlphabetic(7));

        LOGGER.info("Validate Google homepage is opened");
        logo.click();
        assertThat(googleHomePage.isOpened()).isTrue();
    }
}
