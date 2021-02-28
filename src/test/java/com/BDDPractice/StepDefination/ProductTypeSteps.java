package com.BDDPractice.StepDefination;

import com.BDDPractice.PageObject.ProductType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductTypeSteps {

    ProductType productType = new ProductType();

    @When("user select holdalls product from lists of types")
    public void user_select_holdalls_product_from_lists_of_types() {
        productType.selectProductByType();
    }

    @Then("user should be able to see holdalls related products")
    public void user_should_be_able_to_see_holdalls_related_products() {
    productType.holdallsProductAssertion();
    }
}
