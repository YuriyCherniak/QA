package TestPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class InstagramPage extends BasePage {
    public InstagramPage(WebDriver driver) {
        super(driver);
    }

    public void getLoginBtn() {
        getElementByXpath("//input[@name='username']").sendKeys("cherniak_yuriy\n");
    }

    public void getPassBtn() {
        getElementByXpath("//input[@name='password']").sendKeys("18ronaldo18\n");
    }

    public WebElement notNowBtn() {
        return getElementByXpath("//button[contains(text(), 'Не зараз')]");
    }

    public WebElement getHomeBtn() {
        return getElementByXpath("//div[@class='XrOey']/div[@class='MTaRy']");
    }

    public void scrollToElement() {
        for (int i = 0; i < 11; i++) {
            sleep(2);
            Actions scroll = new Actions(driver);
            scroll.scrollToElement(driver.findElements(By.xpath("//*[@class='_aacl _aaco _aacw _aacx _aad7 _aade']")).get(i));
            scroll.perform();
        }
    }

}
