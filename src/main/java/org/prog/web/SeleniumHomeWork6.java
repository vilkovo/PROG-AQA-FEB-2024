package org.prog.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SeleniumHomeWork6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://allo.ua/");

            WebElement searchInput = driver.findElement(By.name("searchp"));
            searchInput.sendKeys("iPhone");
            searchInput.sendKeys(Keys.ENTER);

            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15L));

            List<WebElement> iphone =
                    wait1.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.
                                    xpath("//div[@class='products-layout__item']"),
                            0));

            WebElement s = driver.findElement(By.xpath("//div[@class='products-layout__item'][1]/div/div/a"));
            System.out.println(s.getText());

        } finally {
            driver.quit();
        }
    }
}
