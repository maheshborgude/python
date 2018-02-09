package com.mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class google {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://MAHESH//Selenium//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.co.in");
        driver.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input")).sendKeys("where is my home?");
        driver.close();
        WebDriver driver1 = new ChromeDriver();
        driver1.get("http://www.qaclickacademy.com");
        driver1.findElement(By.xpath("//a[@href='interview.php']")).click();
        driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver1.findElement(By.xpath("//li[@id='tablist1-tab1']")).click();
        //driver1.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver1.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[1]")).click();
    }
}
