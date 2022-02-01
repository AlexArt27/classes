package com.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        // IMPLICIT Selenium version < 4 SYNTAX:
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        // IMPLICIT Selenium version >= 4 SYNTAX:

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        //EXPLICIT Selenium version < 4 SYNTAX:

//        WebDriverWait wait = new WebDriverWait(driver, 60);

        //EXPLICIT Selenium version > 4 SYNTAX:

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));



        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//div[@id='start']/button"));


        button.click();

//        Thread.sleep(6000);

        WebElement text = driver.findElement(By.xpath("//div[@id='finish']/h4"));

        wait.until(ExpectedConditions.visibilityOf(text));

        System.out.println(text.getText());


    }
}
