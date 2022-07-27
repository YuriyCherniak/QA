package TestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.w3c.dom.html.HTMLInputElement;

public class SignInPage extends BasePageES {
    public SignInPage(WebDriver driver){
        super(driver);
    }

    public WebElement signUpbtn() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Sign Up')]"));
    }

    public WebElement inputEmail() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement inputPassword() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement signInBtn() {
        return driver.findElement(By.xpath("//button[@id='signin']"));
    }
}
