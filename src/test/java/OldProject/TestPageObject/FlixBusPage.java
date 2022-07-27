package TestPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FlixBusPage extends BasePage {
    public FlixBusPage(WebDriver driver) {
        super(driver);
    }

    public WebElement searchFirstCity() {
        return getElementByXpath("//div[@class='smhc-input CIi7x v_c6h']/input[@placeholder='Київ']");
    }

    public WebElement searchSecondCity() {
        return getElementByXpath("//div[@class='smhc-input CIi7x v_c6h']/input[@class='smhc-input__field'][@placeholder='Берлін']");
    }

    public WebElement getSearchBtn() {
        return getElementByXpath("//button[contains(text(), 'Пошук')]");
    }

    public WebElement clickOnCity() {
        return getElementByXpath("//button[@class='kHHJS']");
    }

    public WebElement getReservBtn() {
        return getElementByXpath("//div[@class='BookButton__wrapper___FNLt6']");
    }

    public WebElement inputFirstName() {
        return getElementByXpath("//input[@name='passengers.0.firstName']");
    }

    public WebElement inputSecondName() {
        return getElementByXpath("//input[@name='passengers.0.lastName']");
    }

    public WebElement chooseDate() {
        return getElementsByXpath("//input[@class='smhc-input__field']").get(2);
    }

    public WebElement chooseDate2() {
        return getElementByXpath("//span[@data-date='2022-07-22']");
    }
}
