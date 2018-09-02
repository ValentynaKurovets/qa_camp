package org.eleks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

    private WebDriver driver;

    @FindBy(how = How.ID, using = "email")
    public WebElement imputEmail;

    @FindBy(how = How.ID, using = "userPassword")
    public WebElement imputUserPassword;

    @FindBy(how = How.XPATH, using = "//div[@class='col-xs-12']/button[@class='btn login-button']")
    public WebElement buttonSignIn;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void fillInForm(String email, String userPassword) {
        imputEmail.sendKeys(email);
        imputUserPassword.sendKeys(userPassword);
    }

    public ProductsPage goToProductsPage() {
        buttonSignIn.click();
        return new ProductsPage(driver);
    }
}
