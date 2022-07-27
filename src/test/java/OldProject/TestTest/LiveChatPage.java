package TestTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LiveChatPage extends BasePageES {
    public LiveChatPage(WebDriver driver) {
        super(driver);
    }

    public WebElement sendMsg() {
        return driver.findElement(By.xpath("//textarea[@id='liveAgentChatTextArea']"));
    }

    public WebElement endChat() {
        return driver.findElement(By.xpath("//button[@class='liveAgentChatElement liveAgentEndButton']"));
    }
}
