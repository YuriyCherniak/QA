package youtubeCourse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    WebDriver driver;
    String googleSearch = "https://www.google.com.ua/";
    String yahooSearch = "https://www.yahoo.com/";
    String bingSearch = "https://www.bing.com/";


    @BeforeMethod
    public  void BeforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public void searchGoogle(String slovo){

        driver.get(googleSearch);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys( slovo + "\n");

    }
    public  void searchYahoo(String slovo){

        driver.get(yahooSearch);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@class='_yb_2n89o']")).sendKeys( slovo + "\n");
    }

    public void searchBing(String slovo){

        driver.get(bingSearch);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@class='sb_form_q']")).sendKeys(slovo + "\n");
    }
}
