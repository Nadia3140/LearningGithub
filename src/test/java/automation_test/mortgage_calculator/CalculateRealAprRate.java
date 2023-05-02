package automation_test.mortgage_calculator;

import command_providers.ActOn;
import command_providers.AssertThat;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.NavigationBar;

import java.time.Duration;

public class CalculateRealAprRate {
    WebDriver driver;

    private final By RatesLink = By.linkText("Rates");
    private final By RealAprLink = By.linkText("Real APR");
    private final By CalculatorTab = By.xpath("//label[1][text()='Calculator']");
    private final By HomePriceInputField = By.name("HomeValue");
    private final By DownPaymentInputField = By.name("DownPayment");
    private final By DownPaymentInDollar = By.id("DownPaymentSel0");
    private final By InterestRateInputField = By.name("Interest");
    private final By CalculateRateButton = By.name("calculate");
    // complex way actualAprRate
    private final By ActualAprRate = By.xpath("//*[@id=\"analysisDiv\"]/table[1]/tbody/tr/td/strong[text()='Actual APR:']/../../td[2]/strong");

    //private final By ActualAprRate = By.xpath("//*[text()='3.130%']"); //ez way to capture actualAprRate

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.mortgagecalculator.org/");
        driver.manage().window().maximize();
    }

    public void navigateToRealApr(){
        //Mouse Hover to Rates Link
        ActOn.element(driver, RatesLink).mouseHover();

        //Click on Real Apr Link
        ActOn.element(driver, RealAprLink).click();

        //Wait for the page to load
        ActOn.wait(driver, CalculatorTab).waitForElementToBeDisplayed();
    }



    @Test
    public void calculateRealApr() {
        new NavigationBar(driver)
                .mouseHoverToRates()
                .navigateToRealApr()
                .waitForPageToLoad()
                .typeHomePrice("200000")
                .typeDownPayment("15000")
                .selectDownPaymentInDollar()
                .typeInterestRate("3")
                .clickOnCalculateButton()
                .validateRealAprRate("3.130%");
    }


    @AfterMethod
    public void closeBrowser(){

        ActOn.browser(driver).closeBrowser();
    }
}
