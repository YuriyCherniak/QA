package TestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VeggieHousePage extends BasePageES {
    public VeggieHousePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getVeggieMeat() {
        return driver.findElement(By.xpath("//span[contains(text(), '3. BBQ Veggie Meat')]"));
    }

    public WebElement addFood() {
        return driver.findElement(By.xpath("//button[@id='quantity--adds']"));
    }

    public WebElement addToCart() {
        return driver.findElement(By.xpath("//a[@id='confirm-options']"));
    }

    public WebElement getCart() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Cart')]"));
    }
}
