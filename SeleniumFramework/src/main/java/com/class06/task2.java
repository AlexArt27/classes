package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        // IMPLICIT Selenium versio < 4 SYNTAX:
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        // IMPLICIT Selenium versio >= 4 SYNTAX:

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        //EXPLICIT Selenium version < 4 SYNTAX:

//        WebDriverWait wait = new WebDriverWait(driver, 60);

        //EXPLICIT Selenium version > 4 SYNTAX:

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        driver.get("https://www.minted.com/");

        driver.manage().window().maximize();

        WebElement inputEmail = driver.findElement(By.id("bx-element-1303201-Gu64MsV-input"));

        wait.until(ExpectedConditions.visibilityOf(inputEmail));

        inputEmail.sendKeys("email@fsdsd.sdd");



    }
}
