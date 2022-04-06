import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestFelicita {

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void checkVakantciiFelicita(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.grandpersona.ua/uk/projects/felicita");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(), 'Вакансії')]")).click();
        // скрол сторінки
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1000)", "");

        Assert.assertTrue(driver.getCurrentUrl().contains("jobs"));
        driver.quit();
    }

    @Test
    public void checkDostavkaFelicita(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.grandpersona.ua/uk/projects/felicita");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(), 'Доставка')]")).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("delivery"));
        driver.quit();
    }
    @Test
    public void checkDeliveryFelicita(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.grandpersona.ua/uk/projects/felicita");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(), 'Доставка')]")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'ПІЦА')]")).click();
        sleep(2);
        driver.findElements(By.xpath("//a[@aria-label='Додати в кошик']")).get(5).click();
        driver.findElements(By.xpath("//button[@data-val='+']")).get(5).click();
        sleep(3);
        driver.findElements(By.xpath("//i[@class='icon i-cart']")).get(0).click();
        sleep(2);
        driver.findElement(By.xpath("//a[@style='opacity: 1;']")).click();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Yuriy");
        driver.findElements(By.xpath("//input[@id='phone']")).get(0).sendKeys("0633666802");
        driver.findElement(By.xpath("//input[@id='email2']")).sendKeys("qwer@gmail.com");
        driver.findElement(By.xpath("//b[@class='button']")).click();
        driver.findElement(By.xpath("//li[contains(text(), 'Липини')]")).click();
        driver.findElement(By.xpath("//input[@id='street']")).sendKeys("POLIOVA");
        driver.findElement(By.xpath("//input[@id='house']")).sendKeys("876");

        Assert.assertTrue(driver.getCurrentUrl().contains("checkout"));
    }



}
