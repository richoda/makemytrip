package org.example.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class makemytripTest extends BasePagesTests {
    @Test
    public void pickDestinationAndReturn(){
        homePage.roundTrip();
        homePage.inputOnSearchFrom("Bangkok");
        homePage.inputOnSearchTo("Singapore");
        homePage.datePicker();
        homePage.searchFlight();
        Assert.assertEquals(schadulePage.getTitleFilter().getText(),"Popular Filters");
    }
    @Test
    public void filterRefund(){
        homePage.searchFlight();
        schadulePage.checkBoxRefund();
        Assert.assertEquals(schadulePage.getAppliedFilter().getText(), "REFUNDABLE FARES");
    }
    @Test
    public void changeReturnAndDate(){
        homePage.searchFlight();
        schadulePage.changeDestination("Indonesia");
        schadulePage.datePickerReschadule();
        schadulePage.searchNewDestination();
        Assert.assertEquals(schadulePage.getValidationDestinationTo().getText(), "Yogyakarta");
    }
}
