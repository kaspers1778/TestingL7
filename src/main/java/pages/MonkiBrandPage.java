package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@Getter
public class MonkiBrandPage {
    @FindBy(xpath = "//section[@id='category-banner-wrapper']//h1")
    WebElement monkisPageBanner;
}
