package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageHelper extends PageBase {
    public MainPageHelper(WebDriver driver) {
        super(driver);
    }


    @FindBy(className = "slogan")
    WebElement slogan;
    @FindBy(css = ".mat-button-wrapper .material-icons")
    WebElement homeButton;
    @FindBy(id="mat-input-0")
    WebElement fromField;
    @FindBy(id = "mat-input-1")
    WebElement toField;
    @FindBy(css = "button[type=submit]")
    WebElement buttonLetsGo;
    @FindBy(className = "aside")
    WebElement searchResults;
    @FindBy(xpath = "//MAT-OPTION[@id='mat-option-0']")
    WebElement fromResult;
    @FindBy(xpath = "//MAT-OPTION[@id='mat-option-1']")
    WebElement toResult;
    @FindBy(xpath = "//body/app-root[1]/app-trip-direction[1]/app-search-result[1]/div[1]/div[2]")
    WebElement feedbackForm;
    @FindBy(xpath = "//SPAN[@class='mat-button-wrapper'][text()='Clear form']")
    WebElement buttonClearForm;
    @FindBy(className = "description")
    WebElement buttonOpenDropDownList;
    @FindBy(css = "mat-expansion-panel")
    WebElement dropDownListWithResult;

    public boolean sloganContainsText() {
       return slogan.getText().contains("CHEAP TRIP. PAY LESS, VISIT MORE!");
    }

    public boolean homeButtonIsDisplayed() {
     return homeButton.isDisplayed();
    }
    public void inputCityInFromField(String city) {
      fromField.sendKeys(city);
    }
    public void clickOnFromSearchResult() {
        fromResult.click();
    }
    public void inputCityInToField(String city) {
        toField.sendKeys(city);
    }
    public void clickOnToSearchResult() {
        toResult.click();
    }
    public void clickOnLetsGoButton() {
        buttonLetsGo.click();
    }
    public boolean resultIsDisplayed() {
       return searchResults.isDisplayed();
    }

    public boolean feedBackFormIsDisplayed() throws InterruptedException {
        Thread.sleep(30);
        return feedbackForm.isDisplayed();
    }
    public void clickOnButtonClearForm() {
buttonClearForm.click();
    }

    public void clickOnButtonOpenDownList() {buttonOpenDropDownList.click();
    }
    public boolean dropDownListIsDisplayed() {

        waitUntilElementVisible(dropDownListWithResult,1);
        return dropDownListWithResult.isDisplayed();
    }
}
