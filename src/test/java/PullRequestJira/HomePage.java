package PullRequestJira;

import TestPageObject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickBtnGoIt() {
        return driver.findElement(By.xpath("//button[contains(text(), 'Got it')]"));
    }

    public void goToEatStreet(){
        driver.get("https://eatstreet.com");
    }
    public WebElement incorrectMsg() {
        return driver.findElement(By.xpath("//span[contains(text(), 'incorrect.')]"));
    }

    public WebElement clickSignIn() {
        return driver.findElement(By.xpath("//button[@id='signin']"));
    }

    public WebElement inputPass() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement inputEmail() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement clickSignInBtn() {
        return driver.findElement(By.xpath("//a[@id='menu-signin']"));
    }

    public WebElement checkLogo() {
        return driver.findElement(By.xpath("//img[@class='logo-alternate']"));
    }

    public WebElement clickCartBtn() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Cart ')]"));
    }

    public WebElement cartEmptyMsg() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Cart is Empty')]"));
    }
}
