package com.BDDPractice.PageObject;

import com.BDDPractice.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductType extends DriverFactory {

    @FindBy(css = ".Checkboxstyles__Label-b61uwr-4.kmdVAM.font-standard")
    List<WebElement> checkBoxLists;

    @FindBy(xpath = "//*[@id=\"filter-type-holdalls-label\"]")
    WebElement holdallsCheckBox;

    public void selectProductByType(){
        for (WebElement checkBoxList: checkBoxLists){
            System.out.println(checkBoxList.getAttribute("id"));
            if (checkBoxList.getAttribute("id").contains("filter-type-holdalls-label")){
                checkBoxList.click();
                break;
            }
        }
    }

    public void holdallsProductAssertion(){
        for (WebElement checkBoxList: checkBoxLists){
            System.out.println(checkBoxList.getAttribute("id"));
            if (checkBoxList.getAttribute("id").contains("filter-type-holdalls-label")){
                checkBoxList.click();
                String selectedholdallsProducts = holdallsCheckBox.getAttribute("id");
                Assert.assertThat(selectedholdallsProducts, Matchers.containsString("filter-type-holdalls-label"));
                break;
            }
        }
    }

}
