package com.example;

import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
    WebDriver driver;
    String url = "http://iamneo.ai";

    @Test
    public void FirstTC() {
        WebDriverManager.firefoxdriver().setup();

        driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get(url);
    }

    @Test
    public void navigate() {

        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();

        String urlwebpage = driver.getCurrentUrl();

        System.out.println(urlwebpage);

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.close();
    }

}
