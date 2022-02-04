package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage{

    @FindBy(id = "user-name")
    WebElement userNameElm;
    @FindBy(id = "password")
    WebElement passwordElm;
    @FindBy(id = "login-button")
    WebElement loginBtn;

    WebDriver driver;

    public void doLogin(){
        userNameElm.sendKeys("standard_user");
        passwordElm.sendKeys("secret_sauce");
        loginBtn.click();
    }

    public void verifyLoginPage(){
        Assert.assertTrue(userNameElm.isDisplayed(), "Username input is missing from login page");
        Assert.assertTrue(passwordElm.isDisplayed(), "Password input is missing from login page");
    }
}
