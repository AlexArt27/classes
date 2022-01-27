package com.class06;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenshotExample {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/disappearing_elements");
        driver.manage().window().maximize();
    }

    @Test
    public void exampleTest1() throws IOException {
        TakesScreenshot ts = (TakesScreenshot)driver;

        File scrFile = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("target//screenshot//screenshot.png"));
    }
}
