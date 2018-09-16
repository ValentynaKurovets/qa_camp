import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResultPage extends BasePage {

    @FindBy(how = How.XPATH, using = "(//h3)[2]")
    public WebElement resultText;

    public ResultPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String compareText(){
        return resultText.getText();
    }
}
