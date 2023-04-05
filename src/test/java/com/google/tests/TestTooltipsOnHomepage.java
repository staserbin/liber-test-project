package com.google.tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.google.pages.GoogleHomePage.*;
import static com.google.utils.LoggerExtension.LOGGER;
import static org.assertj.core.api.Assertions.*;

public class TestTooltipsOnHomepage extends BaseTest {

    private static final String TOOLTIP_SEARCH = "Search";
    private static final String TOOLTIP_VOICE = "Search by voice";

    @Test(description = "Attributes tooltips on Google homepage have correct values")
    public void testTooltipsOnHomepage() {
        LOGGER.info("Validate 'Search' field tooltip");
        String searchFieldTTP = searchField.getAttribute("title");
        assertThat(searchFieldTTP).isEqualTo(TOOLTIP_SEARCH);

        LOGGER.info("Validate 'Search by voice' button tooltip");
        actions().clickAndHold().moveToElement(searchByVoice).build().perform();
//        String toolTipText = searchByVoiceToolTip.getText();
//        assertThat(toolTipText).isEqualTo(TOOLTIP_VOICE);
        searchByVoiceToolTip.shouldHave(text(TOOLTIP_VOICE));
    }
}
