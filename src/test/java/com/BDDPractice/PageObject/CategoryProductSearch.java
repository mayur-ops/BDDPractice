package com.BDDPractice.PageObject;

import com.BDDPractice.BaseClassPackage.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryProductSearch extends DriverFactory {

    @FindBy(xpath = "//*[@id=\"accordion-controls-filter-799634\"]/div/span")
    WebElement travel;

    @FindBy(xpath = "//h1[contains(text(),'Travel')]")
    WebElement titleOfTheSelctedProduct;

    public void getNikeResultPageUrl(){
    String nikeResultUrl = driver.getCurrentUrl();
    System.out.println(nikeResultUrl);
    }

    public void category(){
        travel.click();
    }

    public String categoryProductTitle(){
       String actualCategoryProductTitle =  titleOfTheSelctedProduct.getText();
       System.out.println(actualCategoryProductTitle);
       return actualCategoryProductTitle;
    }
}
