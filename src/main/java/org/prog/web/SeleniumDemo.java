package org.prog.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://google.com/");
        } finally {
            driver.quit();
        }
    }
}