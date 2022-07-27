package TestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShishKabobPage extends BasePageES {
    public ShishKabobPage(WebDriver driver) {
        super(driver);
    }

    public WebElement choiceFoodMenu() {
        return driver.findElement(By.xpath("//select[@id='main-option']"));
    }

    public WebElement choiceFood() {
        return driver.findElement(By.xpath("//option[@label='Chicken ($14.39)']"));
    }

    public WebElement addBtn() {
        return driver.findElement(By.xpath("//button[@id='quantity--adds']"));
    }

    public WebElement addToCart() {
        return driver.findElement(By.xpath("//a[@id='confirm-options']"));
    }

    public WebElement orderAheadBtn() {
        return driver.findElement(By.xpath("//a[@id='click-checkout']"));
    }

    public WebElement getCart() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Cart')]"));
    }
}
