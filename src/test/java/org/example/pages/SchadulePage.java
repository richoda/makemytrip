package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SchadulePage extends BasePage {
    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    public SchadulePage(WebDriver driver) {super(driver);}
    @FindBy(xpath = "//p[text()=\"Popular Filters\"]")
    private WebElement titleFilter;
    @FindBy(xpath = "//div[@class=\"filterWrapper\"]/div[1]/ul/li[text()=\"Refundable Fares\"]")
    private WebElement appliedFilter;
    @FindBy(xpath = "//div[@class=\"filterWrapper\"]/div[1]/div/div[1]/div/div[4]/label/span/input[@id=\"listingFilterCheckbox\"]")
    private WebElement checkBoxRefund;
    @FindBy(xpath = "//input[@id=\"toCity\"]")
    private WebElement changeDestinationTo;
    @FindBy(xpath = "//div[@role=\"combobox\"]/input[@type=\"text\"]")
    private WebElement fieldChangeDestinationTo;
    @FindBy(xpath = "//p[text()=\"Yogyakarta, Indonesia\"]")
    private WebElement chooseDestinationTo;
    @FindBy(xpath = "//div[@aria-label=\"Wednesday, 28 February 2024\"]/div/p[text()=28]")
    private WebElement dateDeparture;
    @FindBy(xpath = "//div[@aria-label=\"Monday, 4 March 2024\"]")
    private WebElement dateReturn;
    @FindBy(xpath = "//div[@class=\"filtersHeading appendBottom15\"]")
    private WebElement fillterCheckIn;
    @FindBy(xpath = "//button[@id=\"search-button\"]")
    private WebElement buttonSearch;
    @FindBy(xpath = "//span/b[2][text()=\"Yogyakarta\"]")
    private WebElement validationDestionationTo;

    public WebElement getTitleFilter(){
        return titleFilter;
    }
    public WebElement getAppliedFilter(){
        return appliedFilter;
    }
    public WebElement getValidationDestinationTo(){return validationDestionationTo;}
    public void checkBoxRefund(){
        checkBoxRefund.click();
    }
    public void changeDestination(String input){
        changeDestinationTo.click();
        fieldChangeDestinationTo.sendKeys(input);
        chooseDestinationTo.click();
    }

    public void datePickerReschadule(){
        dateDeparture.click();
        dateReturn.click();
    }

    public void searchNewDestination(){
        wait.until(ExpectedConditions.visibilityOfAllElements(fillterCheckIn));
        buttonSearch.click();
    }
}
