package TestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlogPageES extends  BasePageES {
    public BlogPageES(WebDriver driver) {
        super(driver);
    }

    public WebElement eatStreetBtn() {
        return driver.findElements(By.xpath("//a[contains(text(), 'EatStreet.com')]")).get(2);
    }
}
