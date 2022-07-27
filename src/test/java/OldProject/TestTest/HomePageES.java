package TestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;


public class HomePageES extends BasePageES {


    public HomePageES(WebDriver driver) {
        super(driver);
    }

    public WebElement checkLogo() {
        return driver.findElement(By.xpath("//img[@alt='EatStreet Logo']"));
    }

    public WebElement signInBtn() {
        return driver.findElement(By.xpath("//a[@id='menu-signin']"));
    }

    public WebElement gotItBtn() {
        return driver.findElement(By.xpath("//button[contains(text(), 'Got it')]"));
    }

    public WebElement myAkkBtn() {
        return driver.findElement(By.xpath("//a[@id='menu-my-account']"));
    }

    public WebElement inputSearch() {
        return driver.findElement(By.xpath("//input[@id='input-food-search']"));
    }

    public WebElement clickEnterBtn() {
        return driver.findElement(By.xpath("//a[@id='enter-address-btn']"));
    }

    public WebElement clickGetFedBtn() {
        return driver.findElement(By.xpath("//a[@id='find-restaurants']"));
    }
    public WebElement aboutUsBtn() {
        return driver.findElement(By.xpath("//a[@href='/about-us']"));
    }

    public boolean ckeckURL() {
        return driver.getCurrentUrl().contains("eatstreet.com");
    }

    public WebElement applyNowBtn() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Apply Now')]"));

    }

    public WebElement getPhoenixLink() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Phoenix, AZ')]"));
    }

    public WebElement getScottsdaleLink() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Scottsdale, AZ')]"));
    }

    public WebElement getTempeLink() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Tempe, AZ')]"));
    }

    public WebElement getLiveChatBtn() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Live Chat')]"));
    }

    public void goToTheSecondWindowTab(WebDriver driver, Integer seconds) {
        waitForNewTabOpened(seconds);
        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
    public void waitForNewTabOpened(Integer seconds) {
        for (int a = 0; a < seconds * 2; a++) {
            ArrayList<String> tabs2 = new ArrayList(driver.getWindowHandles());
            if (tabs2.size() > 1) {
                break;
            }
        }
    }
}
