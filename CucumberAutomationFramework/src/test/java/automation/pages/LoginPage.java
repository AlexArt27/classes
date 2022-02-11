package automation.pages;

import automation.utils.PropertyReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

public class LoginPage extends  BasePage{

    @FindBy(id = "username")
    WebElement userNameEle;

    @FindBy(id = "password")
    WebElement passwordEle;

    @FindBy(id = "submit")
    WebElement signInBtn;

    public void doLogin(){
        userNameEle.sendKeys(PropertyReader.getProperty("login.username"));
        passwordEle.sendKeys(PropertyReader.getProperty("login.password"));
        signInBtn.click();
    }

    public void verifyPage(){
        Assert.assertTrue("Username input is missing from login page", userNameEle.isDisplayed());
        Assert.assertTrue("Password input is missing from login page", passwordEle.isDisplayed());
    }
}
