package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

        driver.manage().window().maximize();

        WebElement iframeEle = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

        driver.switchTo().frame(iframeEle);

//        WebElement pic = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
//        WebElement trashArea = driver.findElement(By.id("trash"));
//
//        Actions action = new Actions(driver);
//
//        action.dragAndDrop(pic,trashArea).build().perform();


        List<WebElement> elms = driver.findElements(By.xpath("//ul[@id='gallery']/li"));

        WebElement trashArea = driver.findElement(By.id("trash"));
        Actions action = new Actions(driver);
        for (WebElement elm:elms) {
            action.dragAndDrop(elm,trashArea).pause(500).build().perform();
//            Thread.sleep(500);
        }

    }
}
