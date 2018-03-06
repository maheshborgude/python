package com.mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class multiwindows {
    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver", "C://MAHESH//Selenium//geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C://MAHESH//Selenium//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/footer[1]/ul[1]/li[1]/a[1]")).click();
        System.out.println(driver.getTitle());
        //driver.switchTo().window()
        Set<String>ids=driver.getWindowHandles();
        Iterator<String> it= ids.iterator();
        String Parentid = it.next();
        String Childid = it.next();
        driver.switchTo().window(Childid);
        System.out.println(driver.getTitle());
        //Switch back to parent window
        driver.switchTo().window(Parentid);
        System.out.println(driver.getTitle());
    }
}
