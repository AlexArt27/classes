package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumBasicCommandIE {
    public static void main(String[] args) {
        System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
        SafariDriver driver = new SafariDriver();
        driver.get("http://www.ebay.com");

        WebElement searchBox = driver.findElement(By.id("gh-ac"));

        String text = searchBox.getAttribute("placeholder");

        System.out.println(searchBox.getTagName());

        WebElement footerText = driver.findElement(By.xpath("//td[@class='gf-legal']"));

        System.out.println(footerText.getText());

        WebElement searchButton = driver.findElement(By.id("gh-btn"));

        searchBox.sendKeys("tv");

        searchButton.click();





//        driver.manage().window().maximize();
//
//        driver.manage().deleteAllCookies();
//
//
//        driver.close();


    }
}
