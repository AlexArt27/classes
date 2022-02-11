package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

public class HomePage extends BasePage{

    @FindBy(className = "app_logo")
    WebElement homePageLogo;

    @FindBy(css = ".title")
    WebElement homePageTitle;

    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerMenu;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutLink;

    @FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
    WebElement itemLink;

    @FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
    WebElement itemOne;

    @FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")
    WebElement itemTwo;

    public void verifyPage(){
        Assert.assertTrue("Logo is missing from homepage", homePageLogo.isDisplayed());
        Assert.assertTrue("Title is missing from homepage", homePageTitle.isDisplayed());
    }

    public void clickOnBurgerMenu(){
        burgerMenu.click();
    }

    public void clickOnLogoutLink(){
        logoutLink.click();
    }

    public void clickOnItem() {
        itemLink.click();
    }

    public void clickOnItemOne() {
        itemOne.click();
    }

    public void clickOnItemTwo() {
        itemTwo.click();
    }
}
