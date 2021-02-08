package Tests;

import Pages.MainPageHelper;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MainPageValidation extends TestBase{
    MainPageHelper mainPageHelper;
    String cityFrom ="Tel-Aviv";
    String cityTo = "London";
    @BeforeMethod
    public void uniTests(){
        mainPageHelper = PageFactory.initElements(driver,MainPageHelper.class);
    }
    @Test(priority = 3)
    public void sloganIsDisplayedTest() throws InterruptedException {
        assert  mainPageHelper.sloganContainsText();
    }
    @Test(priority = 2)
    public void homeButtonIsDisplayedTest(){
        mainPageHelper.homeButtonIsDisplayed();
    }

    @Test(priority = 1,groups = {"functional"})
    public void clearCityByClickOnButtonClearFormTest(){
        mainPageHelper.inputCityInFromField(cityFrom);
        mainPageHelper.clickOnFromSearchResult();
        mainPageHelper.inputCityInToField(cityTo);
        mainPageHelper.clickOnToSearchResult();
        mainPageHelper.clickOnButtonClearForm();
    }

    @Test(priority = 4,groups = {"functional","feedbackForm"})
    public void FeedBackFormIsPresentTest() throws InterruptedException {
        mainPageHelper.inputCityInFromField(cityFrom);
        mainPageHelper.clickOnFromSearchResult();
        mainPageHelper.inputCityInToField(cityTo);
        mainPageHelper.clickOnToSearchResult();
        mainPageHelper.clickOnLetsGoButton();
        Assert.assertTrue(mainPageHelper.feedBackFormIsDisplayed());
    }
    @Test(priority = 5,groups = {"functional","searchResults"})
    public void dropDownListWithSelectedRouteIsOpenedTest() throws InterruptedException {
        mainPageHelper.inputCityInFromField(cityFrom);
        mainPageHelper.clickOnFromSearchResult();
        mainPageHelper.inputCityInToField(cityTo);
        mainPageHelper.clickOnToSearchResult();
        mainPageHelper.clickOnLetsGoButton();
        mainPageHelper.clickOnButtonOpenDownList();
        Assert.assertTrue( mainPageHelper.dropDownListIsDisplayed());


    }
    @Test
    public void test11(){

    }

}





