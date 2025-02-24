import PageObject.MtsBy;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;
//import org.testng.Assert;
//import org.testng.annotations.Test;

public class MtsTest {
    static WebDriver driver;

    @BeforeEach
    void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

    }

    @Test
    public void blockName() {
        driver.findElement((By) new MtsBy(driver).name1 );
    }

    @Test
    public void logoPay() {
        driver.findElement((By) new MtsBy(driver).logopay);

    }

    @Test
    public void linkWork() {
        driver.findElement((By) new MtsBy(driver).link).click();

        Assertions.assertEquals(driver.getCurrentUrl(), "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
    }

    @Test
    public void stroki() {
        driver.findElement((By) new MtsBy(driver).stroki1);


    }

    @Test
    public void homeNet() {
        System.out.println("Задание №2");
        driver.findElement((By) new MtsBy(driver).homenet1);
        driver.switchTo();
        driver.findElement((By) new MtsBy(driver).homenet2);
        driver.findElement((By) new MtsBy(driver).netsum);
    }

    @Test
    public void installmentPlan(){
        driver.findElement((By) new MtsBy(driver).mentplan);
        driver.switchTo();
        driver.findElement((By) new MtsBy(driver).mentplan1);
        driver.findElement((By) new MtsBy(driver).mentplan2);
        driver.findElement((By) new MtsBy(driver).mailplan);

    }
    @Test
    public void arrears(){
        driver.findElement((By) new MtsBy(driver).arrears1);
        driver.switchTo();
        driver.findElement((By) new MtsBy(driver).nomber2073);
        driver.findElement((By) new MtsBy(driver).arrsum);
        driver.findElement((By) new MtsBy(driver).arrmail);

    }

    @Test
    public void addingFunds() {

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@placeholder='Номер телефона']"));
        phoneNumber.sendKeys("297777777");
        WebElement sum = driver.findElement(By.xpath("//*[@id='connection-sum']"));
        sum.sendKeys("5000");

        WebElement payButton = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));
        payButton.click();

    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
