package com.se.testing.java.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeleniumConfiguration {

    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
