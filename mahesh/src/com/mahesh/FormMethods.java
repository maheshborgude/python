package com.mahesh;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
//import org.apache.commons.io.FileUnits;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FormMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://MAHESH//Selenium//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com");
        System.out.println("Before Click on multicity radio button");
        driver.findElement(By.xpath("//label[@for='switch__input_2']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());
        driver.findElement(By.xpath("//label[@for='switch__input_3']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed()); // if this is something present but hidden OR not visible
        System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isEnabled()); // if this code OR button or not
    }

}
