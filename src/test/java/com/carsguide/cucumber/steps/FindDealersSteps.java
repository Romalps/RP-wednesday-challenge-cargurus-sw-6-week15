package com.carsguide.cucumber.steps;

import com.carsguide.pages.CarDealersPage;
import com.carsguide.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class FindDealersSteps {
    @And("^I click Find a Dealer$")
    public void iClickFindADealer() {
        new HomePage().clickOnFinDADealerLink();
    }

    @Then("^I navigate to car-dealers page$")
    public void iNavigateToCarDealersPage() {
        new CarDealersPage().verifyUserShouldNavigateToCarDealersPage();
    }

//    @And("^I should see the dealer names \"([^\"]*)\" are display on page$")
//    public void iShouldSeeTheDealerNamesAreDisplayOnPage(String dealersName) {
//        new CarDealersPage().verifyThatUserShouldSeeTheDealerNamesAreDisplayOnPage(dealersName);
//    }
}
