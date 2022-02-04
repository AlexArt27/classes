package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDisabledElems {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/sch/ebayadvsearch");

        driver.manage().window().maximize();

        WebElement checkBx1 = driver.findElement(By.id("LH_TitleDesc"));
        WebElement checkBx2 = driver.findElement(By.id("LH_Complete"));
        WebElement checkBx3 = driver.findElement(By.id("LH_Sold"));

        checkBx1.click();

        System.out.println(checkBx1.isEnabled());
        System.out.println(checkBx2.isEnabled());
        System.out.println(checkBx3.isEnabled());

        System.out.println(checkBx1.isDisplayed());
        System.out.println(checkBx2.isDisplayed());
        System.out.println(checkBx3.isDisplayed());

        System.out.println(checkBx1.isSelected());
        System.out.println(checkBx2.isSelected());
        System.out.println(checkBx3.isSelected());


        }
    }

