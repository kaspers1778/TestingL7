package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class DressesPage {

    @FindBy(xpath = "//a[@data-testid='savedItemsIcon']")
    WebElement savedItems;

    @FindBy(xpath = "//article[@id='product-21390993']")
    WebElement dressToGetToBag;

    @FindBy(xpath = "//article[@id='product-22716706']/button")
    WebElement dressToFavouriteButton;



}
