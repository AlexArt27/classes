package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EbayTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        driver.manage().window().maximize();

        WebElement electroLink = driver.findElement(By.xpath("//li/a[text()='Electronics']"));
        WebElement iphoneLink = driver.findElement(By.xpath("//li/a[text()='iPhones']"));

        Actions action = new Actions(driver);
        action.moveToElement(electroLink).pause(1000).click(iphoneLink).build().perform();
    }
}
