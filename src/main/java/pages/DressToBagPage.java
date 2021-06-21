package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class DressToBagPage {
    @FindBy(xpath = "//select[@data-id='sizeSelect']")
    WebElement dressSizeSelection;

    @FindBy(xpath = "//select[@data-id=\"sizeSelect\"]/option[text()='M - UK 12-14']")
    WebElement dressSize;

    @FindBy(xpath = "//button[@data-testid='miniBagIcon']/span[text()='1']")
    WebElement filledBagIcon;

    @FindBy(xpath = "//button[@data-test-id='add-button']")
    WebElement addToBagButton;

}
