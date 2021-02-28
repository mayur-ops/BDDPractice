package com.BDDPractice.PageObject;

import com.BDDPractice.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndividualProductSearch extends DriverFactory {

    @FindBy(id = "searchTerm")
    WebElement SearchTextBox;

    @FindBy(className = "_2mKaC")
    WebElement searchButton;

    public void doSearch(String item){
        SearchTextBox.sendKeys(item);
    }

    public void searchButtonClick (){
        searchButton.click();
    }

    public void getCurrentUrl(){
       String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertThat(actualUrl, Matchers.containsString("https://www.argos.co.uk/"));
    }

    public void getNikeProductTitle(){
      String nikeTitle =  driver.getTitle();
        System.out.println(nikeTitle);
        Assert.assertThat(nikeTitle,Matchers.containsString("Results for nike"));
    }
}
