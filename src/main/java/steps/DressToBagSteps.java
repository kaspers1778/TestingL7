package steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DressToBagPage;
import utils.Driver;

public class DressToBagSteps {
    private WebDriver driver = Driver.getDriver();

    private DressToBagPage dressesPage = PageFactory.initElements(driver, DressToBagPage.class);

    public void selectDressSize(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dressesPage.getDressSizeSelection()));
        dressesPage.getDressSizeSelection().click();
        wait.until(ExpectedConditions.elementToBeClickable(dressesPage.getDressSize()));
        dressesPage.getDressSize().click();
    }

    public void addToBagDress(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dressesPage.getAddToBagButton()));
        dressesPage.getAddToBagButton().click();
    }


    public boolean checkAdditionDressToBag(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(dressesPage.getFilledBagIcon()));
        return dressesPage.getFilledBagIcon().isDisplayed();
    }

}
