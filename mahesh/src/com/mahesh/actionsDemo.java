package com.mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class actionsDemo {

    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver", "C://MAHESH//Selenium//geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C://MAHESH//Selenium//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        Actions a=new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
        WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        //a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).sendKeys("HELLO");
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        a.moveToElement(move).contextClick().build().perform();
    }
}
