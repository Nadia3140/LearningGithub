package command_providers;

import org.openqa.selenium.WebDriver;

public class BrowserActions {
    public WebDriver driver;

    public BrowserActions(WebDriver driver){ //method

        this.driver = driver;
    }

    public  BrowserActions openBrowser(String url){ //method
        driver.manage().deleteAllCookies();
        driver.get(url);
        driver.manage().window().maximize();
        return this;
    }
    public BrowserActions closeBrowser(){
        driver.quit();
        return this;

    }
    public String captureTitle (){
        return driver.getTitle();
    }
}
