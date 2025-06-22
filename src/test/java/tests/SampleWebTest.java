package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.ScreenshotUtil;

public class SampleWebTest extends BaseTest {
    @Test
    public void validateTitle() {
        driver.get("https://facebook.com");
        ScreenshotUtil.captureScreenshot(driver, "FacebookHomePage");
        Assert.assertEquals(driver.getTitle(), "facebook");
    }
}
