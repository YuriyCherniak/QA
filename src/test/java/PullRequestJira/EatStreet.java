package PullRequestJira;

import TestPageObject.TestInit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EatStreet extends TestInit {

    @Test
    public void checkIncorrectSignIn(){
        HomePage homePage = new HomePage(driver);
        homePage.goToEatStreet();
        homePage.clickBtnGoIt().click();
        homePage.clickSignInBtn().click();
        homePage.inputEmail().sendKeys("qwerty@gmail.com");
        homePage.inputPass().sendKeys("qwerty123");
        homePage.clickSignIn().click();
        sleep(2);

        Assert.assertTrue(homePage.incorrectMsg().isDisplayed());
    }

    @Test
    public void checkEatStreetLogo(){
        HomePage homePage = new HomePage(driver);
        homePage.goToEatStreet();
        homePage.clickBtnGoIt().click();

        Assert.assertTrue(homePage.checkLogo().isDisplayed());





    }
}
