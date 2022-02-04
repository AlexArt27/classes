package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class ProductPage extends BasePage{

    @FindBy(className = "inventory_details_img")
    WebElement productImage;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartButton;

    @FindBy(id = "shopping_cart_container")
    WebElement cartButton;

    @FindBy(id = "checkout")
    WebElement checkoutButton;

    public void verifyProductPage(){
        Assert.assertTrue(productImage.isDisplayed(), "Product image is missing on homepage");
    }

    public void clickOnAddToCartButton(){
        addToCartButton.click();
    }

    public void clickOnCartButton(){
        cartButton.click();
    }
}
