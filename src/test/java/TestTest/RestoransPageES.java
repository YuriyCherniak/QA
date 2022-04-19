package TestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class RestoransPageES extends BasePageES{
    public RestoransPageES(WebDriver driver) {
        super(driver);
    }

    public WebElement takeoutBtn() {
        return driver.findElement(By.xpath("//input[@id='filters-checkbox-takeout']"));
    }

    public WebElement openNowBtn() {
        return driver.findElement(By.xpath("//label[contains(text(), 'Open Now')]"));
    }

    public WebElement restoransToTakeout() {
        return driver.findElement(By.xpath("//p[contains(text(), 'matching restaurants near you')]"));
    }

    public WebElement freshKabobClick() {
        return driver.findElement(By.xpath("//a[@class='restaurant-header restaurant-header--rest-list ng-binding'][contains(text(), 'Fresh Kabob')]"));
    }

    public WebElement ratingBtn() {
        return driver.findElement(By.xpath("//label[contains(text(), 'Rating 4+')]"));
    }

    public WebElement getVeggieHouse() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Veggie House')]"));
    }
}
