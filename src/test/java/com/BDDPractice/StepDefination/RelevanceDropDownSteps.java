package com.BDDPractice.StepDefination;

import com.BDDPractice.PageObject.RelevanceDropDown;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RelevanceDropDownSteps {

    RelevanceDropDown relevanceDropDown = new RelevanceDropDown();

    @When("user click on the relevance drop down options")
    public void user_click_on_the_relevance_drop_down_options() {
    relevanceDropDown.relevanceDropDown();
    }

    @When("user select high to low relevance option")
    public void user_select_high_to_low_relevance_option() {
    relevanceDropDown.selectHighToLow();
    }

    @Then("user should be able to see high to low relevance products")
    public void user_should_be_able_to_see_high_to_low_relevance_products() {
    relevanceDropDown.HighToLowResultPage();
    }

}
