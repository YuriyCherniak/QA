package youtubeCourse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestEatstreetSearch {
    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    WebDriver driver;

    @BeforeMethod
    public void beforeMyTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }


    @Test
    public void searchMadison() {
        driver.manage().window().maximize();
        driver.get("https://qa2.eatstreet.com");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Madison\n");


    }

}
