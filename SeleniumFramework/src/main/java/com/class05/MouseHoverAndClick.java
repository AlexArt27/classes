package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAndClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");

        driver.findElement(By.id("btnLogin")).click();

        WebElement adminTab = driver.findElement(By.id("menu_admin_viewAdminModule"));
        WebElement jobTab = driver.findElement(By.id("menu_admin_Job"));
        WebElement jobListTab = driver.findElement(By.id("menu_admin_viewJobTitleList"));



        Actions action = new Actions(driver);

        action.moveToElement(adminTab).moveToElement(jobTab).click(jobListTab).build().perform();

    }
}
