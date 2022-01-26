package com.class04;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().window().maximize();

//        WebElement button1 = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
//
//        button1.click();
//
//        Alert alert = driver.switchTo().alert();
//
//        Thread.sleep(5000);
//
//        alert.accept(); //click OK

//        WebElement button2 = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
//
//        button2.click();
//
//        Alert alert = driver.switchTo().alert();
//
//        Thread.sleep(5000);

//        alert.accept(); //click OK

//        alert.dismiss(); //click CANCEL

//        System.out.println(alert.getText());



        WebElement button3 = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));

        button3.click();

        Alert alert = driver.switchTo().alert();

        alert.getText();
        alert.sendKeys("Test Aisha Input");
        Thread.sleep(5000);
        alert.accept();
//        alert.dismiss();


        }
    }

