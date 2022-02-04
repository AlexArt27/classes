package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(className = "app_logo")
    WebElement homePageLogo;

    @FindBy(css = ".title")
    WebElement homePageTitle;

    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerMenu;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutLink;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    List<WebElement> listOfProduct;

    @FindBy(xpath = "//img[@class='inventory_details_img']")
    WebElement productImage;

    @FindBy(xpath = "//div[@class='inventory_details_price']")
    WebElement productPrice;

    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    WebElement product;

    public List<WebElement> getListOfProduct(){
        return listOfProduct;
    }

    public void verifyHomePage(){
        Assert.assertTrue(homePageLogo.isDisplayed(), "Logo is missing from homepage");
        Assert.assertTrue(homePageTitle.isDisplayed(), "Title is missing from homepage");
    }

    public void clickOnBurgerMenu(){
        burgerMenu.click();
    }

    public void clickOnLogoutLink(){
        logoutLink.click();
    }

    public void clickOnProduct(){
        product.click();
    }

    //inventory_details_img

    public void verifyEachProductNavigation(){
        for(WebElement product : listOfProduct){
            product.click();
            Assert.assertTrue(productImage.isDisplayed(), "Product image is not displayed");
            Assert.assertTrue(productPrice.isDisplayed(), "Price is not displayed");
            driver.navigate().back();
        }
    }
}
