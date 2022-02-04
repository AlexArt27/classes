package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class GetListWebElmText {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

        driver.manage().window().maximize();

        //Login to WS

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");

        driver.findElement(By.id("btnLogin")).click();

        Thread.sleep(5000);

        WebElement adminMenu = driver.findElement(By.id("menu_admin_viewAdminModule"));

        WebElement jobbMenu = driver.findElement(By.id("menu_admin_Job"));

        Actions action = new Actions(driver);
        action.moveToElement(adminMenu).moveToElement(jobbMenu).build().perform();

        List<WebElement> listOfMenu = driver.findElements(By.xpath("//a[@id = 'menu_admin_Job']/../ul/li"));

        for (WebElement jobMenu: listOfMenu
             ) {
            System.out.println(jobMenu.getText());
        }


        }
    }

