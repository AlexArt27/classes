package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

//Open Ebay.com
//Search with keyword TV
//click on first search result
//print seller name into console
//close the new window
//close the first window as well

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        driver.manage().window().maximize();

        String currWinId = driver.getWindowHandle();

        WebElement searchInput = driver.findElement(By.id("gh-ac"));

        searchInput.sendKeys("tv");

        WebElement searchButton = driver.findElement(By.id("gh-btn"));

        searchButton.click();

        WebElement firstFound = driver.findElement(By.xpath("//div[@id='srp-river-results']/ul/div[@class='srp-river-answer srp-river-answer--NAVIGATION_ANSWER_COLLAPSIBLE_CAROUSEL ']/following-sibling::li[1]//div[@class='s-item__image-wrapper']"));

        firstFound.click();

        Set<String> listOfWindow = driver.getWindowHandles();

        for (String eachWindow:listOfWindow) {
            if(!eachWindow.equals(currWinId)){
                driver.switchTo().window(eachWindow);
            }
        }

        WebElement sellerName = driver.findElement(By.xpath("//div[@class='ux-seller-section__item--seller']/a[1]/span"));

        System.out.println(sellerName.getText());

        driver.close();
        Thread.sleep(5000);

        driver.switchTo().window(currWinId);

        driver.close();


    }
}
