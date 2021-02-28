package com.BDDPractice.StepDefination;

import com.BDDPractice.PageObject.AutoDropDownOptions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AutoDropDownOptionsSteps {

    AutoDropDownOptions autoDropDownOptions = new AutoDropDownOptions();

    @When("user do select product from auto drop down options")
    public void user_do_select_product_from_auto_drop_down_options() {
    autoDropDownOptions.doSearch("nike");
    }

    @Then("user should be able to see selected drop down options product")
    public void user_should_be_able_to_see_selected_drop_down_options_product() {
    autoDropDownOptions.nikonPageTitle();

    }

}
