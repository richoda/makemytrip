package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class=\"minContainer\"]/div/div/div/div/ul/li[2][text()=\"Round Trip\"]")
    private WebElement roundTrip;
    @FindBy(xpath = "//label[@for=\"fromCity\"]")
    private WebElement sectionFrom;
    @FindBy(xpath = "//input[@class=\"react-autosuggest__input react-autosuggest__input--open react-autosuggest__input--focused\"]")
    private WebElement fieldFrom;
    @FindBy(xpath = "//div[@id=\"react-autowhatever-1\"]/div/ul/li[1]/div/div[1]/p[1][text()=\"Bangkok, Thailand\"]")
    private WebElement suggestionFrom;
    @FindBy(xpath = "//label[@for=\"toCity\"]")
    private WebElement sectionTo;
    @FindBy(xpath = "//input[@class=\"react-autosuggest__input react-autosuggest__input--open react-autosuggest__input--focused\"]")
    private WebElement fieldTO;
    @FindBy(xpath = "//div[@class=\"react-autosuggest__container react-autosuggest__container--open\"]/div/div/ul/li[1]/div/div[1]/p[1][text()=\"Singapore, Singapore\"]")
    private WebElement suggestionTo;
    @FindBy(xpath = "//div[@class=\"DayPicker-Month\"]/div[3]/div[3]/div[4]/div/p[text()=\"14\"]")
    private WebElement dateDeparture;
    @FindBy(xpath = "//div[@class=\"DayPicker-Month\"]/div[3]/div[3]/div[5]/div/p[text()=\"15\"]")
    private WebElement dateReturn;
    @FindBy(xpath = "//a[@class=\"primaryBtn font24 latoBold widgetSearchBtn \"]")
    private WebElement buttonSearchFlight;
    public void roundTrip(){
        roundTrip.click();
    }
    public void inputOnSearchFrom(String input){
        sectionFrom.click();
        fieldFrom.sendKeys(input);
        suggestionFrom.click();
    }
    public void inputOnSearchTo(String input){
        sectionTo.click();
        fieldTO.sendKeys(input);
        suggestionTo.click();
    }
    public void datePicker(){
        dateDeparture.click();
        dateReturn.click();
    }
    public void searchFlight(){
        buttonSearchFlight.click();
    }
}
