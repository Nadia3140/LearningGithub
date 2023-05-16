package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


    public class DriverFactory {
        // Do not allow to initialize this class from outside
        private DriverFactory() {
            // Do nothing -- Empty constructor
        }
        public static final Utilities.DriverFactory instance = new Utilities.DriverFactory();
        public static Utilities.DriverFactory getInstance() {
            return instance;
        }
        // Thread local driver object for WebDriver
        ThreadLocal<WebDriver> driver = ThreadLocal.withInitial(() -> {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            return  new ChromeDriver(options);
        });

        //Call this method to get the driver object and launch the browser
        public WebDriver getDriver() {
            return  driver.get();
        }

        // Quits the driver and closes the browser
        public void removeDriver() {
            driver.get().quit();
            driver.remove();
        }
    }
