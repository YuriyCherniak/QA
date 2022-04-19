package TestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeliveryDriverPage extends BasePageES {
    public DeliveryDriverPage(WebDriver driver) {
        super(driver);
    }

    public boolean deliveryCheck() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Delivery Driver')]")).isDisplayed();
    }
}
