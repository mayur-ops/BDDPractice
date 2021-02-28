package com.BDDPractice.PageObject;

import com.BDDPractice.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AutoDropDownOptions extends DriverFactory {

    @FindBy(css = "._3a8zN")
    List<WebElement> autoDropDownList;

    @FindBy(className = "_2mKaC")
    WebElement searchButton;

    public void doSearch(String item){
        for (WebElement autoDropDown: autoDropDownList){
            System.out.println(autoDropDown.getText());
            if (autoDropDown.getText().contains("nikon")){
                autoDropDown.click();
                break;
            }
        }
    }

    public void nikonPageTitle(){
       String actualNikonPageTitle = driver.getTitle();
        System.out.println(actualNikonPageTitle);
        Assert.assertThat(actualNikonPageTitle, Matchers.containsString("Results for nikon camera in Technology, Cameras"));
    }
}
