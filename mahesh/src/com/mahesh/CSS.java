package com.mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://MAHESH//Selenium//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com");
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("this is username");
        driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("this is password");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
}
