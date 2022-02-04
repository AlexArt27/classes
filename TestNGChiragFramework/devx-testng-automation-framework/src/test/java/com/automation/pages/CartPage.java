package com.automation.pages;

import com.automation.utils.PropertyReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage extends BasePage{

    @FindBy(xpath = "//span[text()='Your Cart']")
    WebElement cartTitle;

    @FindBy(xpath = "//span[text()='Checkout: Overview']")
    WebElement overviewTitle;

    @FindBy(xpath = "//h2[text()='THANK YOU FOR YOUR ORDER']")
    WebElement completeOrderPage;

    @FindBy(id = "checkout")
    WebElement checkoutButton;

    @FindBy(id = "first-name")
    WebElement firstNameInp;

    @FindBy(id = "last-name")
    WebElement lastNameInp;

    @FindBy(id = "postal-code")
    WebElement zipCodeInp;

    @FindBy(id = "continue")
    WebElement continueButton;

    @FindBy(id = "finish")
    WebElement finishButton;

    @FindBy(className = "inventory_item_desc")
    WebElement productInCart;

    public void verifyCartPage(){
        Assert.assertTrue(cartTitle.isDisplayed(), "Cart title is missing on cart page");
        Assert.assertTrue(productInCart.isDisplayed(), "Product is missing on cart page"); //check if product added
    }

    public void verifyOverviewPage(){
        Assert.assertTrue(overviewTitle.isDisplayed(), "Overview title is missing on overview page");
    }

    public void verifyCompleteOrderPage(){
        Assert.assertTrue(completeOrderPage.isDisplayed(), "Complete title is missing on finish page");
    }

    public void clickOnCheckoutButton(){
        checkoutButton.click();
    }

    public void clickOnFinishButton(){
        finishButton.click();
    }

    public void fillOutForm(){
        firstNameInp.sendKeys(PropertyReader.getProperty("checkout.firstname"));
        lastNameInp.sendKeys(PropertyReader.getProperty("checkout.lastname"));
        zipCodeInp.sendKeys(PropertyReader.getProperty("checkout.zipcode"));
        continueButton.click();
    }
}
