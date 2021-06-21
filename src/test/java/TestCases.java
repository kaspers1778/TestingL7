import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.*;
import utils.Driver;
import net.serenitybdd.junit.*;

public class TestCases {
    private WebDriver driver;

    private void setUpSteps(){
        joinSteps = new JoinSteps();

        basicSteps = new BasicSteps();

        accountLoginSteps = new AccountLoginSteps();

        resultingSearchSteps=new ResultingSearchSteps();

        monkiBrandSteps= new MonkiBrandSteps();

        dressesSteps= new DressesSteps();

        dressToBagSteps= new DressToBagSteps();
    }

    @Before
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        Driver.setDriver(driver);
        setUpSteps();
    }
    @Steps
    JoinSteps joinSteps ;

    @Steps
    BasicSteps basicSteps ;

    @Steps
    AccountLoginSteps accountLoginSteps ;

    @Steps
    ResultingSearchSteps resultingSearchSteps;

    @Steps
    MonkiBrandSteps monkiBrandSteps;

    @Steps
    DressesSteps dressesSteps;

    @Steps
    DressToBagSteps dressToBagSteps;


    @Test
    public void checkRegistrationInvalidEmail(){
        basicSteps.openURL("https://www.asos.com/women/");
        basicSteps.clickOnJoin();
        joinSteps.setLoginEmail("email");
        joinSteps.setFirstName("Petro");
        joinSteps.setLastName("Balachin");
        joinSteps.setBirthYear("2000");
        joinSteps.setBirthDay("15");
        joinSteps.setBirthMonth("J");
        joinSteps.setLoginPassword("password");
        joinSteps.clickJoinAsos();
        Assert.assertTrue(joinSteps.checkInvalidEmailMessageBox());
    }

    @Test
    public void checkRegistrationInvalidPassword(){
        basicSteps.openURL("https://www.asos.com/women/");
        basicSteps.clickOnJoin();
        joinSteps.setLoginEmail("email@gmail.com");
        joinSteps.setFirstName("Petro");
        joinSteps.setLastName("Balachin");
        joinSteps.setBirthYear("2000");
        joinSteps.setBirthDay("15");
        joinSteps.setBirthMonth("J");
        joinSteps.setLoginPassword("p");
        joinSteps.clickJoinAsos();
        Assert.assertTrue(basicSteps.checkIfFilledIconDisplayed());
    }

    @Test
    public void checkSuccessfulRegistration(){
        basicSteps.openURL("https://www.asos.com/women/");
        basicSteps.clickOnJoin();
        joinSteps.setLoginEmail("email2005@gmail.com");
        joinSteps.setFirstName("Petro");
        joinSteps.setLastName("Balachin");
        joinSteps.setBirthYear("2000");
        joinSteps.setBirthDay("15");
        joinSteps.setBirthMonth("J");
        joinSteps.setLoginPassword("password2000");
        joinSteps.clickJoinAsos();
        Assert.assertTrue(joinSteps.checkRegistrationMessageBox());
    }

    @Test
    public void checkSuccessfulSignIn(){
        basicSteps.openURL("https://www.asos.com/women/");
        basicSteps.clickOnSignIn();
        accountLoginSteps.setLogin("anna_melnychuk@gmail.com");
        accountLoginSteps.setPassword("46c_JFdVhH!R3tS");
        accountLoginSteps.loginInAccount();
        Assert.assertTrue(basicSteps.checkIfFilledIconDisplayed());

    }

    @Test
    public void checkNegativeSignIn(){
        basicSteps.openURL("https://www.asos.com/women/");
        basicSteps.clickOnSignIn();
        accountLoginSteps.setLogin("email2005@gmail.com");
        accountLoginSteps.setPassword("46c_JFdVhH!R3tS");
        accountLoginSteps.loginInAccount();
        Assert.assertTrue(accountLoginSteps.messageWrongSignIn());
    }

    @Test
    public void checkSearchingByWord(){
        basicSteps.openURL("https://www.asos.com/women/");
        basicSteps.clickOnSearchingBar();
        basicSteps.enterSearchWord("Scirt");
        resultingSearchSteps.checkIfResultingPageContainsSearchWord("'Scirt'");
    }

    @Test
    public void checkSearchingByWordFail(){
        basicSteps.openURL("https://www.asos.com/women/");
        basicSteps.clickOnSearchingBar();
        basicSteps.enterSearchWord("6tygyjgj7tyjf");
        resultingSearchSteps.checkIfResultingPageContainsSearchWord("'6tygyjgj7tyjf'");
    }

    @Test
    public void checkSearchingByBrand(){
        basicSteps.openURL("https://www.asos.com/women/");
        basicSteps.clickOnBrands();
        basicSteps.clickOnMonkisBrand();
        monkiBrandSteps.checkIfBrandIsCorrect();
    }

    @Test
    public void checkAddingDressToBag(){
        basicSteps.openURL("https://www.asos.com/women/");
        basicSteps.clickOnDress();
        dressesSteps.clickOnDressToGetRoBag();
        dressToBagSteps.selectDressSize();
        dressToBagSteps.addToBagDress();
        dressToBagSteps.checkAdditionDressToBag();
    }

    @After
    public void afterHook() {
        Driver.getDriver().quit();
    }
}
