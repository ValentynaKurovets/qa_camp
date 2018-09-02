package org.eleks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Test
    public static void test1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://eds_university.eleks.com/login");

        WebElement elementButton = driver.findElement(By.xpath("//button[@class=\"btn login-button\"]"));
        elementButton.click();

        WebElement elementEmail = driver.findElement(By.id("email"));
        elementEmail.sendKeys("valya.kurovec@gmail.com");

        WebElement elementPassword = driver.findElement(By.id("userPassword"));
        elementPassword.sendKeys("dX$dSEPwVxc");

        WebElement elementSignIn = driver.findElement(By.xpath("//div[@class=\"col-xs-12\"]/button[@class=\"btn login-button\"]"));
        elementSignIn.click();

//        driver.quit();
//        driver.close();
    }

    @Test
    public static void test2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://eds_university.eleks.com/login");

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.goToLoginPage();

        loginPage.fillInForm("valya.kurovec@gmail.com", "dX$dSEPwVxc");

        ProductsPage productsPage = loginPage.goToProductsPage();
    }
}
