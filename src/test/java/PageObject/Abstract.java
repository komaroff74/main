package PageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class Abstract {
    public static EventFiringWebDriver driver;
    public static ChromeOptions chromeOptions;
//    static WebDriver driver;

    void setupClass() {
        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        chromeOptions = new ChromeOptions();
        driver.get("https://www.mts.by/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

    }
    public void init(){
        setupClass();
    }
}
