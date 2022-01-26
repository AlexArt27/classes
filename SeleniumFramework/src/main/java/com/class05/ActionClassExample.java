package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionClassExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        driver.manage().window().maximize();

        WebElement signLink = driver.findElement(By.xpath("//span[@id='gh-ug']/a"));

        Actions action = new Actions(driver);
        action.keyDown(Keys.COMMAND).click(signLink).keyUp(Keys.COMMAND).build().perform();
    }
}
