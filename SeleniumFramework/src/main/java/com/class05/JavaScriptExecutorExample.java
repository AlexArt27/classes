package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        driver.manage().window().maximize();

        WebElement electroLink = driver.findElement(By.xpath("//span[@id='gh-ug']/a"));


        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].style.border = '1px solid green';", electroLink);

        js.executeScript("arguments[0].style.display = 'none';",electroLink);
    }
}
