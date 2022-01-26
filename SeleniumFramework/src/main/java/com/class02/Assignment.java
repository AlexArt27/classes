package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement clickLogin = driver.findElement(By.id("login-button"));
        clickLogin.click();

        ////select[@class='product_sort_container']

        WebElement dDown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select catDDownSelect = new Select(dDown);

        catDDownSelect.selectByValue("lohi");


    }
}
