package com.BDDPractice.PageObject;

import com.BDDPractice.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RelevanceDropDown extends DriverFactory {

        @FindBy(id = "sort-select")
        WebElement relevanceDropDownOptions;

        public void relevanceDropDown(){
        relevanceDropDownOptions.click();
        }

        public void selectHighToLow(){
            Select sel = new Select(relevanceDropDownOptions);
            sel.selectByVisibleText("Price: High - Low");
        }

        public void HighToLowResultPage(){
           String actualUrl = driver.getCurrentUrl();
           System.out.println(actualUrl);
           Assert.assertThat(actualUrl, Matchers.containsString("https://www.argos.co.uk/search/nike/opt/sort:price:desc/"));
        }
}
