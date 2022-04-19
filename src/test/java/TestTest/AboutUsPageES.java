package TestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUsPageES extends BasePageES {
    public AboutUsPageES(WebDriver driver) {
        super(driver);
    }

    public WebElement blogBtn() {
        return driver.findElement(By.xpath("//a[@class='press__nav__anchor']"));
    }
}
