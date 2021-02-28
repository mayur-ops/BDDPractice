package com.BDDPractice.PageObject;

import com.BDDPractice.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPageProductSelect extends DriverFactory {

@FindBy(xpath = "//*[@id=\"findability\"]/div/div[6]/div/div[5]/div[3]/div[2]/div[1]/div[2]/a")
    WebElement selectedProduct;

@FindBy(xpath = "//*[@id=\"content\"]/div/div/div[1]/div[3]/div[1]/section[2]/section/div[15]/div/div[2]/button")
    WebElement addToTrolley;
@FindBy(xpath = "//*[@id=\"content\"]/div/div/div[1]/div[3]/div[1]/section[2]/section/div[13]/div/div/div[1]/footer/div/div[2]/a")
WebElement goToTrolley;

@FindBy(xpath = "//*[@id=\"basket-content\"]/main/div[2]/section[1]/div[1]/ul/li/div/section/div/div[2]/div[2]/div/div[1]/p/a/span")
    WebElement trolleyProduct;

public void selectProduct(){
    selectedProduct.click();
}
public void addToTrolleyButton(){
    addToTrolley.click();
}
public void goToTrolleyButton(){
    goToTrolley.click();
}
public void trolleyProductAssertion(){
    String actualProduct = trolleyProduct.getText();
    System.out.println(actualProduct);
    Assert.assertThat(actualProduct, Matchers.containsString("Nike Dominate All Court Size 7 Basketball"));
}
}
