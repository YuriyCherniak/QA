package youtubeCourse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OnlyMy extends TestInit {

    @Test
    public void googleTest(){
        String searchWord = "cats";
        searchGoogle(searchWord);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));

    }
    @Test
    public void yahooTest(){
        String searchWord = "cats";
        searchYahoo(searchWord);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord)); 
    }
    @Test
    public void bingTest(){
        String searchWord = "cats";
        searchBing(searchWord);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));

    }
}
