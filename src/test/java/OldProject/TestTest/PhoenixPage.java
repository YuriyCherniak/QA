package TestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhoenixPage extends BasePageES {
    public PhoenixPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogoBtn() {
        return driver.findElement(By.xpath("//img[@class='logo-alternate']"));
    }
}
