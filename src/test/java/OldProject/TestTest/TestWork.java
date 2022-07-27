package TestTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWork extends TestInitES{

    @Test
    public void checkHomePageBtn(){
        HomePageES homePageES = new HomePageES(driver);
        goToUrl("https://eatstreet.com/");

        Assert.assertTrue(homePageES.checkLogo().isDisplayed());
        Assert.assertTrue(homePageES.signInBtn().isDisplayed());

    }
    @Test
    public void checkEmptyCart(){
        HomePageES homePageES = new HomePageES(driver);
        goToUrl("https://qa2.eatstreet.com/");
        homePageES.gotItBtn().click();
        homePageES.signInBtn().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.signUpbtn().click();
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.inputLoggin().sendKeys(System.currentTimeMillis() + "@fgf.com");
        signUpPage.inputPass().sendKeys("1Qwertyqazwsxedc");
        signUpPage.inputPassAgain().sendKeys("1Qwertyqazwsxedc");
        signUpPage.signUpBtn().click();
        sleep(4);
        homePageES.myAkkBtn().click();
        MyAkkPage myAkkPage = new MyAkkPage(driver);
        myAkkPage.cartBtn().click();
        CartPage cartPage = new CartPage(driver);

        Assert.assertTrue(cartPage.checkCart().isDisplayed());
    }

    @Test
    public void checkTakeout(){
        HomePageES homePageES = new HomePageES(driver);
        goToUrl("https://qa2.eatstreet.com/");
        homePageES.gotItBtn().click();
        homePageES.signInBtn().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.inputEmail().sendKeys("qwerty123@fgf.com");
        signInPage.inputPassword().sendKeys("1Qwertyqazwsxedc");
        signInPage.signInBtn().click();
        sleep(3);
        homePageES.inputSearch().sendKeys("NYC\n");
        homePageES.clickEnterBtn().click();
        homePageES.clickGetFedBtn().click();
        sleep(3);
        RestoransPageES restoransPageES = new RestoransPageES(driver);
        restoransPageES.takeoutBtn().click();
        restoransPageES.openNowBtn().click();

        Assert.assertTrue(restoransPageES.restoransToTakeout().isDisplayed());
    }

    @Test
    public void checkDeliveryCart(){
        HomePageES homePageES = new HomePageES(driver);
        goToUrl("https://qa2.eatstreet.com/");
        homePageES.gotItBtn().click();
        homePageES.inputSearch().sendKeys("Лас-Вегас, Невада, США\n");
        homePageES.clickEnterBtn().click();
        homePageES.clickGetFedBtn().click();
        sleep(3);
        RestoransPageES restoransPageES = new RestoransPageES(driver);
        restoransPageES.freshKabobClick().click();
        FreshKabobPageES freshKabobPageES = new FreshKabobPageES(driver);
        sleep(3);
        freshKabobPageES.shishKabobsClick().click();
        sleep(2);
        ShishKabobPage shishKabobPage = new ShishKabobPage(driver);
        shishKabobPage.choiceFoodMenu().click();
        shishKabobPage.choiceFood().click();
        shishKabobPage.addBtn().click();
        shishKabobPage.addBtn().click();
        shishKabobPage.addBtn().click();
        shishKabobPage.addToCart().click();

        Assert.assertTrue(shishKabobPage.orderAheadBtn().isDisplayed());
    }

    @Test
    public void returnToHome(){
        goToUrl("https://qa2.eatstreet.com/");
        HomePageES homePageES = new HomePageES(driver);
        homePageES.gotItBtn().click();
        homePageES.signInBtn().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.inputEmail().sendKeys("qwerty123@fgf.com");
        signInPage.inputPassword().sendKeys("1Qwertyqazwsxedc");
        signInPage.signInBtn().click();
        sleep(2);
        homePageES.aboutUsBtn().click();
        sleep(3);
        AboutUsPageES aboutUsPageES = new AboutUsPageES(driver);
        aboutUsPageES.blogBtn().click();
        sleep(3);
        BlogPageES blogPageES = new BlogPageES(driver);
        blogPageES.eatStreetBtn().click();

        Assert.assertTrue(homePageES.ckeckURL());
    }

    @Test
    public void driverCareer(){
        HomePageES homePageES = new HomePageES(driver);
        goToUrl("https://qa2.eatstreet.com/");
        homePageES.gotItBtn().click();
        homePageES.signInBtn().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.inputEmail().sendKeys("qwerty123@fgf.com");
        signInPage.inputPassword().sendKeys("1Qwertyqazwsxedc");
        signInPage.signInBtn().click();
        sleep(3);
        homePageES.applyNowBtn().click();
        sleep(3);
        DriverCareerPage driverCareerPage = new DriverCareerPage(driver);
        driverCareerPage.applyCityBtn().click();
        driverCareerPage.chooseCity().click();
        DeliveryDriverPage deliveryDriverPage = new DeliveryDriverPage(driver);

        Assert.assertTrue(deliveryDriverPage.deliveryCheck());
    }

    @Test
    public void continueAsGuest(){
        HomePageES homePageES = new HomePageES(driver);
        goToUrl("https://qa2.eatstreet.com/");
        homePageES.gotItBtn().click();
        homePageES.inputSearch().sendKeys("Лас-Вегас, Невада, США\n");
        homePageES.clickEnterBtn().click();
        homePageES.clickGetFedBtn().click();
        sleep(3);
        RestoransPageES restoransPageES = new RestoransPageES(driver);
        restoransPageES.ratingBtn().click();
        restoransPageES.getVeggieHouse().click();
        sleep(3);
        VeggieHousePage veggieHousePage = new VeggieHousePage(driver);
        veggieHousePage.getVeggieMeat().click();
        sleep(2);
        veggieHousePage.addFood().click();
        veggieHousePage.addFood().click();
        veggieHousePage.addFood().click();
        veggieHousePage.addToCart().click();
        veggieHousePage.getCart().click();
        CartPage cartPage = new CartPage(driver);

        Assert.assertTrue(cartPage.continueAsGuest().isDisplayed());
    }

    @Test
    public void continueAsMyAkk(){
        HomePageES homePageES = new HomePageES(driver);
        goToUrl("https://qa2.eatstreet.com/");
        homePageES.gotItBtn().click();
        homePageES.signInBtn().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.inputEmail().sendKeys("qwerty123@fgf.com");
        signInPage.inputPassword().sendKeys("1Qwertyqazwsxedc");
        signInPage.signInBtn().click();
        sleep(4);
        homePageES.inputSearch().sendKeys("Лас-Вегас, Невада, США\n");
        homePageES.clickEnterBtn().click();
        homePageES.clickGetFedBtn().click();
        sleep(3);
        RestoransPageES restoransPageES = new RestoransPageES(driver);
        restoransPageES.freshKabobClick().click();
        FreshKabobPageES freshKabobPageES = new FreshKabobPageES(driver);
        sleep(3);
        freshKabobPageES.shishKabobsClick().click();
        sleep(2);
        ShishKabobPage shishKabobPage = new ShishKabobPage(driver);
        shishKabobPage.choiceFoodMenu().click();
        shishKabobPage.choiceFood().click();
        shishKabobPage.addBtn().click();
        shishKabobPage.addBtn().click();
        shishKabobPage.addToCart().click();
        shishKabobPage.getCart().click();
        sleep(2);
        CartPage cartPage = new CartPage(driver);

        Assert.assertTrue(cartPage.checkoutOrder());
    }

    @Test
    public void checkArizonaLink(){
        HomePageES homePageES = new HomePageES(driver);
        goToUrl("https://qa2.eatstreet.com/");
        homePageES.gotItBtn().click();
        homePageES.getPhoenixLink().click();
        PhoenixPage phoenixPage = new PhoenixPage(driver);
        phoenixPage.getLogoBtn().click();
        sleep(2);
        homePageES.getScottsdaleLink().click();
        ScottsdalePage scottsdalePage = new ScottsdalePage(driver);
        scottsdalePage.getLogoBtn().click();
        homePageES.getTempeLink().click();
        sleep(2);
        TempePage tempePage = new TempePage(driver);
        tempePage.viewAllRest().click();

        Assert.assertTrue(tempePage.referMsg().isDisplayed());
    }

    @Test
    public void checkLiveChat(){
        HomePageES homePageES = new HomePageES(driver);
        goToUrl("https://qa2.eatstreet.com/");
        homePageES.gotItBtn().click();
        homePageES.signInBtn().click();
        SignInPage signInPage = new SignInPage(driver);
        signInPage.inputEmail().sendKeys("qwerty123@fgf.com");
        signInPage.inputPassword().sendKeys("1Qwertyqazwsxedc");
        signInPage.signInBtn().click();
        sleep(4);
        homePageES.getLiveChatBtn().click();
        homePageES.goToTheSecondWindowTab(driver,10);
        sleep(6);
        LiveChatPage liveChatPage = new LiveChatPage(driver);
        liveChatPage.sendMsg().sendKeys("Hello\n");

        Assert.assertTrue(liveChatPage.endChat().isDisplayed() );




    }

}
