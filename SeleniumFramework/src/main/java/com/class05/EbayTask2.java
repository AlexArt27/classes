package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Set;

public class EbayTask2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.co.uk/");

        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("dog"+ Keys.ENTER);

        Thread.sleep(3000);


        List<WebElement> elms = driver.findElements(By.xpath("//h3[@class='s-item__title']"));

        int count = 1;

        for (WebElement elm: elms) {
            elm.click();



            String originalWindow = switchToNewWindow(driver);

            try {


                WebElement ciLink = driver.findElement(By.xpath("//div[@id='bsi-ec']//a[text()='Complete information']"));

                if (ciLink.isDisplayed()) {
                    ciLink.click();
                }
                WebElement phoneVal = driver.findElement(By.xpath("//span[text()='Phone:']/following-sibling::span"));
                WebElement emailVal = driver.findElement(By.xpath("//span[text()='Email:']/following-sibling::span"));

                System.out.println("================Seller"+count+" INFO=====================");
                if (phoneVal.isDisplayed()) {
                    System.out.println(phoneVal.getText());
                }
                if (emailVal.isDisplayed()) {
                    System.out.println(emailVal.getText());
                }

                System.out.println("==================================================");
            }catch (Exception e){
                System.out.println("NODATA - SELLER" +count);
            }
            driver.close();

            driver.switchTo().window(originalWindow);
            count++;
        }
    }

    public static String switchToNewWindow(WebDriver driver){
        String currWinId = driver.getWindowHandle();
        Set<String> listOfWindow = driver.getWindowHandles();

        for (String eachWindow:listOfWindow) {
            if(!eachWindow.equals(currWinId)){
                driver.switchTo().window(eachWindow);
            }
        }
        return currWinId;
    }
}
