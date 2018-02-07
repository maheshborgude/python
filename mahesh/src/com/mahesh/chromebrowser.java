package com.mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {


    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver", "C://MAHESH//Selenium//geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C://MAHESH//Selenium//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getCurrentUrl());
        driver.get("http://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("mahesh.borgude@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("1312129");
        driver.findElement(By.xpath("//*[@value='Log In']")).click();
    }
}


