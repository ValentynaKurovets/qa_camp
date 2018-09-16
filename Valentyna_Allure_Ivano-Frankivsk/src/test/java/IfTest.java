import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IfTest {

    WebDriver driver;

    @BeforeSuite
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "c:\\QC_Valia\\ELEX\\Java\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    @Test
    @Feature("Feature Ivano-Frankivsk in Google")
    public void test1() {

        driver.get("https://google.com");

        HomePage homePage = new HomePage(driver);
        homePage.fillInSearch("Ivano-Frankivsk");

        ResultPage resultPage = homePage.goToResultPage();

        String compare = resultPage.compareText();

        Assert.assertTrue(compare.contains("Ivano-Frankivsk"));
    }
    @Test
    @Feature("Feature Ivano-Frankivsk in Google")
    public void test2() {

        driver.get("https://google.com");

        HomePage homePage = new HomePage(driver);
        homePage.fillInSearch("Ivano-Frankivsk");

        ResultPage resultPage = homePage.goToResultPage();

        String compare = resultPage.compareText();

        Assert.assertTrue(compare.contains("Ivano-Frankivsksss"));
    }
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
