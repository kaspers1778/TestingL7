package steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ResultingSearchingPage;
import utils.Driver;

public class ResultingSearchSteps {
    private WebDriver driver= Driver.getDriver();

    private ResultingSearchingPage resultingSearchingPage=PageFactory.initElements(driver,ResultingSearchingPage.class);

    public String checkIfResultingPageContainsSearchWord(String searchingWord){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(resultingSearchingPage.getSearchWordThatExist()));
        return resultingSearchingPage.getSearchWordThatExist().getText();
    }
}
