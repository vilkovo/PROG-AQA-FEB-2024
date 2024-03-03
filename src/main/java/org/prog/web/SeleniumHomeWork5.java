package org.prog.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class SeleniumHomeWork5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://allo.ua/");

            List<WebElement> findSiteLogo =
                    driver.findElements(By.xpath(
                            "//img[contains(@src,'https://i.allo.ua/media/theme/default/Logo_Allo_white_2.svg')]"));
            if (!findSiteLogo.isEmpty()) {
                findSiteLogo.get(0).click();
                System.out.println("\n True");
            } else {
                System.out.println("\n False");
            }
        } finally {
            driver.quit();
        }
    }
}
