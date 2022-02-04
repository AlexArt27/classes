package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        // Open the browser
        driver = new ChromeDriver();
        // 1. To open url in browser
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
    }

    @Test
    public void fileUpload(){
        WebElement fileUploadInput = driver.findElement(By.id("uploadPicture"));
        fileUploadInput.sendKeys("/Users/oleksandrartamoshkin/IdeaProjects/SeleniumFramework/src/main/resources/data/textSome.txt");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)", "");


        WebElement fileUploadBtn = driver.findElement(By.id("submit"));
        fileUploadBtn.click();
    }
}
