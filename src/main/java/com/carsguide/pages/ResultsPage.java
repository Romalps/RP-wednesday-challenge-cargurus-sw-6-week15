package com.carsguide.pages;

import com.carsguide.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultsPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement makeInResultsText;


    public ResultsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='no-results-filters-val']")
    WebElement makeZeroResultText;

    //String makeIsDisplay;
    public void verifyUserShouldSeeTheMakeInResults(String make) {

        // Assert.assertTrue(getTextFromElement(makeInResultsText).contains(make));
        if (makeInResultsText.isDisplayed()) {
            Assert.assertTrue(getTextFromElement(makeInResultsText).contains(make));
            //System.out.println("I should see the " +make + " in results ");
            log.info("Verify user should see the " + make + " in results " + make.toString());
        } else {
           // Assert.assertTrue(getTextFromElement(makeZeroResultText).contains(make));
            log.info("Verify user should see the " + make + " in results " + make.toString());
               System.out.println("There doesn't seem to be any " +make + "cars that exactly match your criteria.");
        }
    }

}
