package com.BDDPractice.StepDefination;

import com.BDDPractice.PageObject.ResultPageProductSelect;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ResultPageProductSelectSteps {

    ResultPageProductSelect resultPageProductSelect = new ResultPageProductSelect();

    @When("user do select one of the result page product")
    public void user_do_select_one_of_the_result_page_product() {
    resultPageProductSelect.selectProduct();
    }

    @When("user do selected product add in to trolley")
    public void user_do_selected_product_add_in_to_trolley() {
    resultPageProductSelect.addToTrolleyButton();
    }

    @When("user do selected product go to trolley")
    public void user_do_selected_product_go_to_trolley() {
    resultPageProductSelect.goToTrolleyButton();
    }

    @Then("user should be able to see the selected product in his trolley")
    public void user_should_be_able_to_see_the_selected_product_in_his_trolley() {
    resultPageProductSelect.trolleyProductAssertion();
    }


}
