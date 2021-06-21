package steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DressesPage;

import utils.Driver;

public class DressesSteps {
    private WebDriver driver = Driver.getDriver();

    private DressesPage dressesPage = PageFactory.initElements(driver, DressesPage.class);

    private void scrollTo(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void clickOnDressToGetRoBag(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(dressesPage.getDressToGetToBag()));
        scrollTo(dressesPage.getDressToGetToBag());
        dressesPage.getDressToGetToBag().click();
    }

    public void clickToAddToFavourite(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dressesPage.getDressToFavouriteButton()));
        scrollTo(dressesPage.getDressToFavouriteButton());
        dressesPage.getDressToFavouriteButton().click();
    }

}
