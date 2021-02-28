package com.BDDPractice.StepDefination;

import com.BDDPractice.PageObject.CategoryProductSearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class CategoryProductSearchSteps {

    CategoryProductSearch categoryProductSearch = new CategoryProductSearch();

    @Given("user is on nike products result page")
    public void user_is_on_nike_products_result_page() {
       categoryProductSearch.getNikeResultPageUrl();
    }

    @When("user do select one of the category product")
    public void user_do_select_one_of_the_category_product() {
    categoryProductSearch.category();
    }

    @Then("user should be able to see selected category list of products")
    public void user_should_be_able_to_see_selected_category_list_of_products() {
        String actualCategoryProductTitle = categoryProductSearch.categoryProductTitle();
        Assert.assertThat(actualCategoryProductTitle, Matchers.containsString("Travel"));
    }

}
