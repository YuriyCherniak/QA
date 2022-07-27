package TestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverCareerPage extends  BasePageES{
    public DriverCareerPage(WebDriver driver) {
        super(driver);
    }

    public WebElement applyCityBtn() {
        return driver.findElement(By.xpath("//select[@onchange='location = this.value;']"));
    }

    public WebElement chooseCity() {
        return driver.findElement(By.xpath("//option[contains(text(), 'Delivery Driver - Ames, IA.')]"));
    }
}
