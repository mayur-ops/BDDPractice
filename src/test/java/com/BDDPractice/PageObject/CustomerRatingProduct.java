package com.BDDPractice.PageObject;

import com.BDDPractice.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CustomerRatingProduct extends DriverFactory {

    @FindBy(css = ".RadioListstyles__Label-sc-1atiffa-5.iGLFTd")
    List<WebElement> starRatings;

    @FindBy(xpath = "//*[@id=\"4 or more-label\"]")
    WebElement fourOrMoreStar;

    public void customerRatings(){
        for (WebElement starRating: starRatings){
            System.out.println(starRating.getAttribute("id"));
            if (starRating.getAttribute("id").contains("4 or more-label")){
                starRating.click();
                break;
            }
        }
    }

    public void customerRatingAssertion(){
        for (WebElement starRating: starRatings){
            System.out.println(starRating.getAttribute("id"));
            if (starRating.getAttribute("id").contains("4 or more-label")){
                starRating.click();
                String actualRatings = fourOrMoreStar.getAttribute("id");
                Assert.assertThat(actualRatings, Matchers.containsString("4 or more-label"));
                break;
            }
        }
    }
}
