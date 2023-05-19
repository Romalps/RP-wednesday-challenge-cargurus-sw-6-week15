package com.carsguide.pages;

import com.carsguide.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NewAndUsedCarPage extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarPage.class.getName());

    public NewAndUsedCarPage() {
        PageFactory.initElements(driver, this);
    }

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

@CacheLookup
@FindBy(xpath = "//h1[normalize-space()='New & Used Car Search - carsguide']")
WebElement newCarAndUsedCarSearchText;
    // navigate to ‘new and used car search’ page
    public void verifyUserNavigateToNewAndUsedCarSearchPage(String expectedMessage) {
//        String actualResult = driver.getCurrentUrl();
//        String expectedResult = "https://www.carsguide.com.au/buy-a-car/new-and-used-car-search";
//        Assert.assertEquals(actualResult, expectedResult);

Assert.assertTrue(getTextFromElement(newCarAndUsedCarSearchText).contains(expectedMessage));
    }

    // select make
    public void selectMake(String make) {
        selectByVisibleTextFromDropDown(selectMake, make);
        log.info("Select Make from dropdown "+selectMake.toString());
    }

    // select model
    public void selectModel(String model) {
        selectByVisibleTextFromDropDown(selectModel, model);
        log.info("Select Model from dropdown "+ selectModel.toString());
    }

    // select location
    public void selectLocation(String location) {
        selectByVisibleTextFromDropDown(selectLocation, location);
        log.info("Select Location from Dropdown "+selectLocation.toString());
    }

    // select price
    public void selectPrice(String price) {
        selectByVisibleTextFromDropDown(selectPrice, price);
        log.info("Select Price from DropDown "+ selectPrice.toString());
    }


    // click on Find My Next Car tab
    public void clickOnFindMyNextCarTab() {
        clickOnElement(findMyNextCarTab);
        log.info("Click on Find My NextCar Tab "+ findMyNextCarTab.toString());
    }


}
