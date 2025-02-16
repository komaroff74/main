import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MtsTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
    }

    @Test
    public void blockName() {
        WebElement blockName = driver.findElement(By.xpath("//*[text()='Онлайн пополнение ']"));
        Assert.assertTrue(blockName.isDisplayed());
    }

    @Test
    public void logoPay() {
        WebElement logoPay = driver.findElement(By.xpath("//div[@class='pay__wrapper']"));
        Assert.assertTrue(logoPay.isDisplayed());
    }

    @Test
    public void linkWork() {
        WebElement linkWork = driver.findElement(By.xpath("//a [@href=\"/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/\"]"));
        linkWork.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
    }

    @Test
    public void addingFunds() {

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@placeholder=\"Номер телефона\"]"));
        phoneNumber.sendKeys("297777777");
        WebElement sum = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        sum.sendKeys("500");

        WebElement payButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        payButton.click();

    }

    @After
    public void tearDown() {
        driver.quit();
        driver = null;
    }
}
