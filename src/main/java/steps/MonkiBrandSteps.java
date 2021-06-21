package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MonkiBrandPage;
import utils.Driver;

public class MonkiBrandSteps {
    private WebDriver driver = Driver.getDriver();

    private MonkiBrandPage monkiBrandPage = PageFactory.initElements(driver, MonkiBrandPage.class);

    public String checkIfBrandIsCorrect(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(monkiBrandPage.getMonkisPageBanner()));
        return monkiBrandPage.getMonkisPageBanner().getText();
    }
}
