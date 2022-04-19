package TestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TempePage extends BasePageES {
    public TempePage(WebDriver driver) {
        super(driver);
    }

    public WebElement viewAllRest() {
        return driver.findElement(By.xpath("//a[contains(text(), 'View All Tempe Restaurants')]"));
    }

    public WebElement referMsg() {
        return driver.findElement(By.xpath("//div[contains(text(), 'updated our Terms')]"));
    }
}
