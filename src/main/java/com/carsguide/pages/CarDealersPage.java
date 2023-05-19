package com.carsguide.pages;

import com.carsguide.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class CarDealersPage extends Utility {

    private static final Logger log = LogManager.getLogger(CarDealersPage.class.getName());

    public CarDealersPage() {
        PageFactory.initElements(driver, this);
    }

//    @CacheLookup
//    @FindBy()
//    WebElement ;

    @CacheLookup
    @FindBy(xpath = "//div[@class='container dealer-result-container']//div[@class='dealerListing--name']//a")
    List<WebElement> dealersNameList;
    @CacheLookup
    @FindBy(xpath = "//div[@class='listing-pagination']//li[contains(@class,'listing-pagination-next')]//a")
    WebElement nextButton;

    // navigate to ‘car-dealers’ page
    public void verifyUserShouldNavigateToCarDealersPage() {
        String expectedResult = "https://www.carsguide.com.au/car-dealers";
        Assert.assertEquals(driver.getCurrentUrl(), expectedResult, "Expected to navigate to car-dealers page");
    }

    // I should see the dealer names <dealersName> are display on page
//    public void verifyThatUserShouldSeeTheDealerNamesAreDisplayOnPage(String expectedMessage) {
//        String dealerName = "";
//
//        for (WebElement dealer : dealersNameList) {
//
//            if (dealer.getText().equals(expectedMessage)) {
//                dealerName = dealer.getText();
//                System.out.println(dealer.getText());
//                break;
//            }
//        }
//    }


}
