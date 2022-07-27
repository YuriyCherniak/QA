import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestEatStreat {

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void checkNewYorkRestorans(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://eatstreet.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[contains(text(), 'Got it')]")).click();
        driver.findElements(By.xpath("//li[@class='top-cities__item ng-scope']")).get(73).click();
        sleep(3);
        driver.findElements(By.xpath("//ul[@class='cuisine-types__list']//li")).get(1).click();
        sleep(2);

        Assert.assertTrue(driver.getCurrentUrl().contains("asian-food-delivery"));
        driver.quit();
    }

    @Test
    public void checkRegistration(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://eatstreet.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(), 'Sign In')]")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'Sign Up')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Got it')]")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("qwerty@gmai.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("qwerty12345");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,125)", "");
        sleep(3);
        driver.findElement(By.xpath("//button[@id='signup']")).click();
        sleep(2);

        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(), ' Must match')]")).isDisplayed());
        driver.quit();
    }

    @Test
    public void checkDelivery(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.eatstreet.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//label[contains(text(), 'Takeout')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Got it')]")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1926)", "");
        driver.findElements(By.xpath("//li[@class='top-cities__item ng-scope']")).get(0).click();
        JavascriptExecutor fg = (JavascriptExecutor) driver;
        fg.executeScript("window.scrollBy(0,450)", "");
        sleep(2);
        driver.findElement(By.xpath("//button[contains(text(), 'View all American Food options')]")).click();
        sleep(2);
        driver.findElement(By.xpath("//a[contains(text(), 'Cranberry Hills')]")).click();
        sleep(3);
        driver.findElements(By.xpath("//a[@class='restaurant-header restaurant-header--menu']")).get(1).click();
        sleep(2);
        driver.findElement(By.xpath("//button[@id='quantity--adds']")).click();
        driver.findElement(By.xpath("//button[@id='quantity--adds']")).click();
        driver.findElement(By.xpath("//button[@id='quantity--adds']")).click();
        driver.findElement(By.xpath("//button[@id='quantity--adds']")).click();
        sleep(2);
        driver.findElement(By.xpath("//select[@id='main-option']")).click();
        driver.findElement(By.xpath("//option[contains(text(), 'Bread Bowl ($8.70)')]")).click();
        driver.findElement(By.xpath("//span[contains(text(), 'Add to Cart')]")).click();
        sleep(2);

        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(), 'Restaurant is Closed')]")).isDisplayed());
        sleep(3);
        driver.quit();
    }
    String Linkk = "https://www.google.com.ua/?hl=ru";


    @Test
    public void checkEnter(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(Linkk);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("instagram" + "\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("instagram"));
    }

}


