package com.BDDPractice.StepDefination;

import com.BDDPractice.PageObject.CustomerRatingProduct;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerRatingProductSteps {

    CustomerRatingProduct customerRatingProduct = new CustomerRatingProduct();

    @When("user select the four star rating products")
    public void user_select_the_four_star_rating_products() {
       customerRatingProduct.customerRatings();
    }

    @Then("user should be able to see the four star rating products")
    public void user_should_be_able_to_see_the_four_star_rating_products() {
    customerRatingProduct.customerRatingAssertion();
    }

}
