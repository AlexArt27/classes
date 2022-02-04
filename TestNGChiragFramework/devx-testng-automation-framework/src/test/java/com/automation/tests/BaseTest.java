package com.automation.tests;

import com.automation.pages.CartPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.ProductPage;
import com.automation.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    LoginPage loginPage;
    HomePage homePage;
    ProductPage productPage;
    CartPage cartPage;

    @BeforeMethod
    public void setUp(){
        DriverUtils.createDriver();
        loginPage = new LoginPage();
        homePage = new HomePage();
        productPage = new ProductPage();
        cartPage = new CartPage();
    }

    @AfterMethod
    public void cleanUp(){

        DriverUtils.getDriver().quit();
        System.out.println("Test finished!");
    }

}
