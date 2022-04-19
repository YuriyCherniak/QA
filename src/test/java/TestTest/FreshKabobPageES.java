package TestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FreshKabobPageES extends BasePageES{
    public FreshKabobPageES(WebDriver driver) {
        super(driver);
    }

    public WebElement shishKabobsClick() {
        return driver.findElements(By.xpath("//span[@class='menu-item-name ng-binding'][contains(text(), '2. Shish Kabob')]")).get(0);
    }
}
