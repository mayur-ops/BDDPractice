package com.BDDPractice.PageObject;

import com.BDDPractice.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PriceRangeProduct extends DriverFactory {

    @FindBy(xpath = "//*[@id=\"filter-price-£10 - £15-label\"]/div/div")
    WebElement priceRange;

    @FindBy(css = ".ProductCardstyles__PriceContainer-gm8lcq-13.iEqjTz")
    List<WebElement> PriceRangeProductResults;

    public void selectPriceRange(){
    priceRange.click();
}

    public void priceRangeProductResult(){
        for (WebElement pricrRangeProduct: PriceRangeProductResults){
            System.out.println(pricrRangeProduct.getText());

           String priceWithoutPound = pricrRangeProduct.getText().replace("£","");
           double priceInDouble = Double.parseDouble(priceWithoutPound);
           System.out.println(priceInDouble);

            Assert.assertThat(priceInDouble, Matchers.greaterThanOrEqualTo(10.00));
            Assert.assertThat(priceInDouble,Matchers.lessThanOrEqualTo(15.00));

        }
}


}
