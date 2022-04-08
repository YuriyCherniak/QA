import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PullRequest {
    String Linkk = "https://www.google.com.ua/?hl=ru";
    @Test
    public void checkEnterForGit(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(Linkk);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("instagram" + "\n");
        Assert.assertTrue(driver.getCurrentUrl().contains("instagram"));
    }
}
