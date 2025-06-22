package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleHomePage;
import utils.ScreenshotUtil;

public class SampleWebTest extends BaseTest {

    @Test
    public void validateTitle() {
        driver.get(config.getProperty("base.url"));

        GoogleHomePage googlePage = new GoogleHomePage(driver);
        String actualTitle = googlePage.getPageTitle();
        ScreenshotUtil.captureScreenshot(driver, "GoogleHomePage");

        Assert.assertEquals(actualTitle, "Google");
    }
}
