package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class MultiWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();

        String currWinId = driver.getWindowHandle();
        System.out.println(currWinId);





        WebElement linkOrange = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
        linkOrange.click();

        Set<String> listOfWindow = driver.getWindowHandles();

        System.out.println(listOfWindow);

        //switch to new window
        for (String eachWindow:listOfWindow) {
            if(!eachWindow.equals(currWinId)){
                driver.switchTo().window(eachWindow);
            }
        }

        WebElement emailBox = driver.findElement(By.id("myText"));
        emailBox.sendKeys("test@gmail.com");

        WebElement tryButton = driver.findElement(By.id("linkadd"));
        tryButton.click();

        driver.close();

        driver.switchTo().window(currWinId);

        driver.quit();


    }
}
