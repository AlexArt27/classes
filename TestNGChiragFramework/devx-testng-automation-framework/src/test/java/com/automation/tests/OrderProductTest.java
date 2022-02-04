package com.automation.tests;

import org.testng.annotations.Test;

public class OrderProductTest extends BaseTest {

    @Test
    public void userCanOrderProduct() {

        loginPage.doLogin();

        homePage.verifyHomePage();

        homePage.clickOnProduct();

        productPage.verifyProductPage();

        productPage.clickOnAddToCartButton();

        productPage.clickOnCartButton();

        cartPage.verifyCartPage();

        cartPage.clickOnCheckoutButton();

        cartPage.fillOutForm();

        cartPage.verifyOverviewPage();

        cartPage.clickOnFinishButton();

        cartPage.verifyCompleteOrderPage();



    }


}
