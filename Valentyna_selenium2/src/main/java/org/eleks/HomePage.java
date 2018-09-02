package org.eleks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//button[@class='btn login-button']")
    public WebElement loginButton;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public LoginPage goToLoginPage() {
        loginButton.click();
        return new LoginPage(driver);
    }
}
