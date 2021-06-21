package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ResultingSearchingPage {
    @FindBy(xpath = "//div[@id='search-term-banner']/p[@class='vp-JnyG']")
    WebElement searchWordThatExist;
}
