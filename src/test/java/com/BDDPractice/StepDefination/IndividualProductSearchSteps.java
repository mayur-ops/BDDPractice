package com.BDDPractice.StepDefination;

import com.BDDPractice.PageObject.IndividualProductSearch;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndividualProductSearchSteps {

    IndividualProductSearch individualProductSearch = new IndividualProductSearch();


    @Given("user is on argos home page website")
    public void user_is_on_argos_home_page_website() {
        individualProductSearch.getCurrentUrl();
    }

    @When("user type nike on search box for the nike product")
    public void user_type_nike_on_search_box_for_the_nike_product() {
        individualProductSearch.doSearch("nike");
    }

    @When("user click on search button")
    public void user_click_on_search_button() {
        individualProductSearch.searchButtonClick();
    }

    @Then("user should be able to see nike products")
    public void userShouldBeAbleToSeeNikeProducts() {
        individualProductSearch.getNikeProductTitle();
    }

}
