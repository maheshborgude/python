package com.mahesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {
       public static void main (String[] args) {

           System.setProperty("webdriver.gecko.driver", "C://MAHESH//Selenium//geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get("http://qaclickacademy.com");
           System.out.println("-------///------");
           System.out.println(driver.getTitle());
           System.out.println("-------///--------------------");
           System.out.println(driver.getPageSource());
           System.out.println(driver.getCurrentUrl());
           driver.close();
        }
    }
