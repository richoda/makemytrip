package org.example.tests;

import org.example.pages.HomePage;
import org.example.pages.SchadulePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePagesTests {
    protected HomePage homePage;
    protected SchadulePage schadulePage;
    private WebDriver driver;
    @BeforeMethod
    public void setupPages(){
        homePage = new HomePage(driver);
        schadulePage = new SchadulePage(driver);
    }
    @AfterMethod
    public void tearDownPages(){
        driver.get("https://www.makemytrip.com");
    }
    @BeforeSuite
    public void globalSetUp(){
        System.out.println("********************************** Test Started **********************************");
    }
    @AfterSuite
    public void globalTearDown(){
        System.out.println("********************************** Test Finished **********************************");
    }
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.makemytrip.com");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
