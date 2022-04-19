package PullRequestJira;

import TestPageObject.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EatStreetTest extends TestInit {

    @Test
    public void checkIncorrectSignIn(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.clickBtnGotIt().click();
        homePage.clickSignInBtn().click();
        homePage.inputEmail().sendKeys("qwerty@gmail.com");
        homePage.inputPass().sendKeys("qwerty123");
        homePage.clickSignIn().click();
        sleep(3);

        Assert.assertTrue(homePage.incorrectMsg().isDisplayed());
    }

    @Test
    public void checkEatStreetLogo(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.clickBtnGotIt().click();

        Assert.assertTrue(homePage.checkLogo().isDisplayed());
    }

    @Test
    public void checkEmptyCart(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.clickBtnGotIt().click();
        homePage.clickCartBtn().click();

        Assert.assertTrue(homePage.cartEmptyMsg().isDisplayed());
    }

    @Test
    public void searchNYCRestorans(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/");
        homePage.clickBtnGotIt().click();
        homePage.inputNYC().sendKeys("NYC\n");
        homePage.clickEnterBtn().click();
        homePage.clickGetFedBtn().click();
        sleep(3);

        Assert.assertTrue(homePage.resultNYC().isDisplayed());
    }

    @Test
    public void checkSignInButton(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com/signin");
        homePage.clickBtnGotIt().click();
        homePage.clickSignInBtn().click();

        Assert.assertTrue(homePage.driver.getCurrentUrl().contains("/signin"));
    }

    @Test
    public void checkHeadquarters(){
        HomePage homePage = new HomePage(driver);
        openUrl("https://eatstreet.com");
        homePage.clickBtnGotIt().click();
        homePage.clickBtnAboutUs().click();
        sleep(2);

        Assert.assertTrue(homePage.availabilityHeadquarters().isDisplayed());
    }

//    @Test
//    public void openRestInLV(){
//
//    }


}
