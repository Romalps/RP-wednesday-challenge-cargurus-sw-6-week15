package com.carsguide.pages;

import com.carsguide.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='buy + sell']")
    WebElement buyAndSellTab;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement searchCarsLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement usedLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement findADealerLink;

    // mouse hover on “buy+sell” tab
    public void mouseHoverOnBuyAndSellTab() {
        mouseHoverToElement(buyAndSellTab);
        log.info("Mouse hover on buy and sell tab " + buyAndSellTab.toString());
    }

    // click ‘Search Cars’ link
    public void clickOnSearchCarsLink() {
        clickOnElement(searchCarsLink);
        log.info("Click on search cars link " + searchCarsLink.toString());
    }

    // click ‘Used’ link
    public void clickOnUsedLink() {
        clickOnElement(usedLink);
        log.info("Click on Used link " + usedLink.toString());
    }

    // click ‘Find a Dealer’
    public void clickOnFinDADealerLink() {
        clickOnElement(findADealerLink);
        log.info("Click on Find a Dealer link " + findADealerLink.toString());
    }

}
