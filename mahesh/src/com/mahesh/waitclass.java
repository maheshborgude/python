package com.mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class waitclass {

    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver", "C://MAHESH//Selenium//geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C://MAHESH//Selenium//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.alaskaair.com");
        driver.findElement(By.xpath("//input[@id='oneWay']")).click();
        driver.findElement(By.xpath("//*[@id='fromCity1']")).sendKeys("NYC");
        driver.findElement(By.xpath("//*[@id='toCity1']")).sendKeys("DEN");
        //driver.findElement(By.xpath("//*[@id='fromCity1']")).sendKeys(Keys.TAB);
        //driver.findElement(By.xpath("//input[@id='departureDate1']")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("findFlights")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
