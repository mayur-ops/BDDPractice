package com.BDDPractice.StepDefination;

import com.BDDPractice.PageObject.PriceRangeProduct;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PriceRangeProductSteps {

    PriceRangeProduct priceRangeProduct = new PriceRangeProduct();

    @When("user do select the price range ten and fifteen pounds of the products")
    public void userDoSelectThePriceRangeTenAndFifteenPoundsOfTheProducts() {
        priceRangeProduct.selectPriceRange();
    }

    @Then("user should be able to see related price range products")
    public void user_should_be_able_to_see_related_price_range_products() {
        priceRangeProduct.priceRangeProductResult();
    }

}
