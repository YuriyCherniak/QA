package TestPageObject;

import org.testng.annotations.Test;

public class TestInstagram extends TestInit {

    @Test
    public void testScrollInstagram() {
        InstagramPage instagramPage = new InstagramPage(driver);
        openUrl("https://www.instagram.com/");
        instagramPage.getLoginBtn();
        instagramPage.getPassBtn();
        instagramPage.getHomeBtn().click();
        instagramPage.notNowBtn().click();

        for (int i = 0; i < 10000; i++) {
            instagramPage.scrollToElement();
            driver.navigate().refresh();
            sleep(5);
        }
    }

    @Test
    public void searchRoadToKeln() {
        FlixBusPage flixBusPage = new FlixBusPage(driver);
        openUrl("https://www.flixbus.ua/");
        flixBusPage.searchFirstCity().sendKeys("Львів");
        sleep(1);
        flixBusPage.clickOnCity().click();
        flixBusPage.searchSecondCity().sendKeys("Кельн");
        sleep(1);
        flixBusPage.clickOnCity().click();
        flixBusPage.chooseDate().click();
        flixBusPage.chooseDate2().click();
        flixBusPage.getSearchBtn().click();
        flixBusPage.getReservBtn().click();
        flixBusPage.inputFirstName().sendKeys("Степан");
        flixBusPage.inputSecondName().sendKeys("Бандера");
    }
}
