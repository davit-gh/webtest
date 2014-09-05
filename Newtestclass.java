package org.firstsite.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by hero on 9/5/2014.
 */
public class Newtestclass {
    @Test
    public void setWebDriver(){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://seleniumsimplified.com");
        Assert.assertTrue("Should be different",
                driver.getTitle().startsWith("Selenium Simplified"));
        driver.close();

    }
}
