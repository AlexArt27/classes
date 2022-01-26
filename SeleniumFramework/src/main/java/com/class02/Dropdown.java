package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        WebElement catDDown = driver.findElement(By.id("gh-cat"));

        Select catDDownSelect = new Select(catDDown);

        Thread.sleep(5000);
        catDDownSelect.selectByIndex(3);
        Thread.sleep(5000);
        catDDownSelect.selectByValue("267");
        Thread.sleep(5000);
        catDDownSelect.selectByVisibleText("Art");

        List<WebElement> listOfOption = catDDownSelect.getOptions();

        for(WebElement option : listOfOption){
            System.out.println(option.getText());
        }
        for (int i = 0; i<listOfOption.size(); i++){
            System.out.println(listOfOption.get(i).getText()
            );
        }
    }

}
