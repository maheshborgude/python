package com.mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://MAHESH//Selenium//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.co.in");
        driver.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input")).sendKeys("where is my home?");
    }
}
