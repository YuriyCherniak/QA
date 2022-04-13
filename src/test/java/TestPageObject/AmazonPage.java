package TestPageObject;

import org.openqa.selenium.WebDriver;

public class AmazonPage extends BasePage {
    public AmazonPage (WebDriver driver) {
        super(driver);
    }
    public void goToAmazon(){
        driver.get("https://www.amazon.com/");
    }
}
