package com.carsguide.cucumber.steps;

import com.carsguide.pages.HomePage;
import com.carsguide.pages.NewAndUsedCarPage;
import com.carsguide.pages.ResultsPage;
import com.carsguide.pages.UsedCarsForSalePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuySteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I mouse hover on buy\\+sell tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverOnBuyAndSellTab();
    }

    @And("^I click Search Cars link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCarsLink();

    }

    @Then("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String expected) {
        new NewAndUsedCarPage().verifyUserNavigateToNewAndUsedCarSearchPage(expected);
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {
        new NewAndUsedCarPage().selectMake(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new NewAndUsedCarPage().selectModel(model);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new NewAndUsedCarPage().selectLocation(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
        new NewAndUsedCarPage().selectPrice(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarPage().clickOnFindMyNextCarTab();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make) {
        new ResultsPage().verifyUserShouldSeeTheMakeInResults(make);
    }


    @And("^I click Used link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedLink();
    }


    @Then("^I navigate to used cars for sale \"([^\"]*)\" page$")
    public void iNavigateToUsedCarsForSalePage(String expected)  {
        new UsedCarsForSalePage().verifyUserNavigateTOUsedCarForSalePage(expected);
    }
}
