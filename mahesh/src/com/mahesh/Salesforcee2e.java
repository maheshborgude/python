package com.mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforcee2e {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://MAHESH//Selenium//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.rediff.com");
        //driver.findElement(By.xpath("//*[@id=\'signin_info\']/a[1]")).click();
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
        driver.findElement(By.cssSelector("input#login1")).sendKeys("myuser");
        driver.findElement(By.cssSelector("input#password")).sendKeys("passworddd");
        //writing xpath is = //tagName[@attribute='value']
        driver.findElement(By.xpath("//*[@name='proceed']")).click();
    }
}
