package com.kodilla.selenium.ebay.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleExample {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");


            WebElement inputField = driver.findElement(By.name("q"));
        inputField.sendKeys("Kodilla");



    }
}
