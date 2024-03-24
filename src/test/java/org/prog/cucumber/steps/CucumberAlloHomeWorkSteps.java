package org.prog.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class CucumberAlloHomeWorkSteps {
    public static WebDriver driver;

    @Given("I load allo page")
    public void loadAlloPage() {
        driver.get("https://allo.ua/");
    }

    @When("I search iPhone")
    public void searchForGoods() {
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("iPhone");
        searchInput.sendKeys(Keys.ENTER);
    }

    @When ("Get search results")
    public List<WebElement> getSearchResults() {
        return new WebDriverWait(driver, Duration.ofSeconds(30L))
                .until(
                        ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("div.product-card"),
                                1)
                );
    }

    @When ("Search results contain")
    public boolean searchResultsContain() {
        List<WebElement> searchResults = getSearchResults();
        Assert.assertFalse(searchResults.isEmpty(), "Search results must not be empty!");
        boolean valueIsPresent = false;
        for (WebElement e : searchResults) {
            if (e.findElement(By.xpath("div/a")).getText().contains("iPhone")) {
                valueIsPresent = true;
                break;
            }
        }
        return valueIsPresent;
    }

    @Then("Print first product")
    public void print() {
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15L));
                wait1.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.
                                xpath("//div[@class='products-layout__item']"),
                        0));
        WebElement s = driver.findElement(By.xpath("//div[@class='products-layout__item'][1]/div/div/a"));
        System.out.println(s.getText());
    }

    @Then ("Switch to search page by number")
    public void switchToSearchPageByNumber() {
        new WebDriverWait(driver, Duration.ofSeconds(20L))
                .until(ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//li[@class='pagination__item']/a[contains(text(), '2')]")))
                .click();
        waitForLoadingToFinish();
    }

    @Then ("Switch to prev page")
    public void switchToPrevPage() {
        new WebDriverWait(driver, Duration.ofSeconds(20L))
                .until(ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//*[@aria-label='prevision page']")))
                .click();
        waitForLoadingToFinish();
    }

    @Then ("Switch to next page")
    public void switchToNextPage() {
        new WebDriverWait(driver, Duration.ofSeconds(20L))
                .until(ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//*[@class='pagination__next']/a")))
                .click();
        waitForLoadingToFinish();
    }

    private void waitForLoadingToFinish() {
        new WebDriverWait(driver, Duration.ofSeconds(20L))
                .until(ExpectedConditions.invisibilityOfElementLocated(By.className("loading-block-gif")));
    }
}
