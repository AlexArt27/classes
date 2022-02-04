package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/iframe");

        driver.manage().window().maximize();

        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));

        driver.switchTo().frame(iframe);

        WebElement inpBox = driver.findElement(By.xpath("//body[@id='tinymce']/p"));

        inpBox.sendKeys("Alex");

        driver.switchTo().defaultContent();

        WebElement titleText = driver.findElement(By.xpath("//div[@class='example']/h3"));
        System.out.println(titleText.getText());



        }
    }

