package com.mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Javaalerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://MAHESH//Selenium//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.xpath("//input[@type='button']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();  //yes, ok, done then accept method else
        //driver.switchTo().alert().sendKeys();  // to enter the text in it
        //driver.switchTo().alert().dismiss();  //cancel, no , reject this method call
    }
}
