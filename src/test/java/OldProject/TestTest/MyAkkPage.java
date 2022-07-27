package TestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MyAkkPage extends BasePageES {
    public MyAkkPage(WebDriver driver){
        super(driver);
    }

    public WebElement cartBtn() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Cart')]"));
    }
}
