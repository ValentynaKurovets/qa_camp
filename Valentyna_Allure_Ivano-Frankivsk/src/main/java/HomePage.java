import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    @FindBy(how = How.ID, using = "lst-ib")
    public WebElement inputSearch;


    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driverWait.until(ExpectedConditions.visibilityOf(inputSearch));    }

    public void fillInSearch(String search) {
        inputSearch.sendKeys(search);
    }

    public ResultPage goToResultPage() {
        inputSearch.sendKeys(Keys.ENTER);
        return new ResultPage(driver);
    }
}
