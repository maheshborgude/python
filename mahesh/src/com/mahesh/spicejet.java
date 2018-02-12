package com.mahesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejet {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://MAHESH//Selenium//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.spicejet.com");
        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        s.selectByValue("2");
        Thread.sleep(2000);
        s.selectByIndex(6); // value is need to select as 7
        Thread.sleep(2000);
        s.selectByVisibleText("8");
        /*driver.findElement(By.cssSelector("div.maincontainer:nth-child(14) div.home:nth-child(2) div.staticHomeContentFullpage.position-relative:nth-child(18) div.home_flight_search div.book div:nth-child(1) div:nth-child(3) div.row1 div.left1 > input.select_CTXT:nth-child(4)")).click();
        driver.findElement(By.xpath("//a[@value='GOI']")).click();
        driver.findElement(By.xpath("(//*[@value='DEL'])[2]")).click(); // for second drop down we need to write like it.*/
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click(); //check box to click it.
        //isselected()
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected()); //check box to click it.


    }
}