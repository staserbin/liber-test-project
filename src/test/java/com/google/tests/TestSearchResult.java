package com.google.tests;

import org.testng.annotations.Test;

import static com.google.pages.GoogleSearchPage.*;
import static com.google.utils.LoggerExtension.LOGGER;
import static org.assertj.core.api.Assertions.assertThat;

public class TestSearchResult extends BaseTest {

    private static final String SEARCH_QUERY = "Will Smith";

    @Test(description = "Valid search result is displayed according to search query")
    public void testSearchResult() {
        LOGGER.info("Search for");
        googleHomePage.search(SEARCH_QUERY);

        LOGGER.info("Validate search result");
        assertThat(googleSearchPage.getHeaderSearchResult()).isEqualTo(SEARCH_QUERY);
        assertThat(googleSearchPage.getFirstResultLink()).contains(SEARCH_QUERY.split(" ")[0]);
    }
}
