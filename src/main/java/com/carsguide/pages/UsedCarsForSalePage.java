package com.carsguide.pages;

import com.carsguide.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UsedCarsForSalePage extends Utility {


    private static final Logger log = LogManager.getLogger(UsedCarsForSalePage.class.getName());

    public UsedCarsForSalePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Used Cars For Sale']")
    WebElement usedCarsForSaleText;
    @CacheLookup
    @FindBy(id = "makes")
    WebElement selectMake;

    @CacheLookup
    @FindBy(id = "models")
    WebElement selectModel;
    @CacheLookup
    @FindBy(id = "locations")
    WebElement selectLocation;
    @CacheLookup
    @FindBy(id = "priceTo")
    WebElement selectPrice;
    @CacheLookup
    @FindBy(id = "search-submit")
    WebElement findMyNextCarTab;

    public void verifyUserNavigateTOUsedCarForSalePage(String expectedMessage) {
        Assert.assertEquals(getTextFromElement(usedCarsForSaleText), expectedMessage);
    }

    public void selectMake(String make) {
        selectByVisibleTextFromDropDown(selectMake, make);
        log.info("Select make " + make.toString());
    }

    public void selectModel(String model) {
        selectByVisibleTextFromDropDown(selectModel, model);
        log.info("Select model " + model.toString());
    }

    public void selectLocation(String location) {
        selectByVisibleTextFromDropDown(selectLocation, location);
        log.info("Select location " + location.toString());
    }

    public void selectPrice(String price) {
        selectByVisibleTextFromDropDown(selectPrice, price.toString());
        log.info("Select Price " + price.toString());
    }

}
