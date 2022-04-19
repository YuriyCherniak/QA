package TestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePageES {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public WebElement checkCart() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Your Cart is Empty')]"));
    }

    public WebElement continueAsGuest() {
        return driver.findElement(By.xpath("//div[contains(text(), 'Continue as Guest')]"));
    }

    public boolean checkoutOrder() {
        return driver.getCurrentUrl().contains("/checkout/order");
    }
}
