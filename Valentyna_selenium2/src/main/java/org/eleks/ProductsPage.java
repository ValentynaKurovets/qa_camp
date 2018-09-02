package org.eleks;

import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    private WebDriver driver;

    public ProductsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
}

