package TestTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.w3c.dom.html.HTMLInputElement;

public class SignUpPage extends BasePageES {
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public WebElement inputLoggin() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement inputPass() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement inputPassAgain() {
        return driver.findElement(By.xpath("//input[@id='passwordAgain']"));
    }

    public WebElement signUpBtn() {
        return driver.findElement(By.xpath("//button[@id='signup']"));
    }
}
