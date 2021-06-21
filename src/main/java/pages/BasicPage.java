package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class BasicPage {
    @FindBy(xpath = "//input[@type='search']")
    WebElement searchBar;

    @FindBy(xpath = "//div[@id='myAccountDropdown']/button")
    WebElement accountItem;

    @FindBy(xpath = "//a[@data-testid='myaccount-link']")
    WebElement myAccountLink;

    @FindBy(xpath = "//button[@data-testid='myAccountIcon']/span[@type='accountFilled']")
    WebElement myAccountIconFilled;

    @FindBy(xpath = "//a[@data-testid='miniBagIcon']")
    WebElement shoppingBag;

    @FindBy(xpath = "//a[@data-testid='signup-link']")
    WebElement joinLink;

    @FindBy(xpath = "//a[@data-testid='signin-link']")
    WebElement signInLink;

    @FindBy(xpath = "//a[@data-analytics-id='row-wwgblsalenewlinesadded80off-dresses']")
    WebElement dressesLink;

    @FindBy(xpath = "//button[@data-id='796c1478-6471-4acf-a952-049a9154b668']")
    WebElement brandsButton;

    @FindBy(xpath = "//a[@data-testid='text-link'][text()='Monki']")
    WebElement brandMonkiLink;


}
