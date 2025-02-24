package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class MtsBy extends Abstract {
    public MtsBy(WebDriver driver) {
        Abstract.driver = (EventFiringWebDriver) driver;
        PageFactory.initElements(driver, this);

    }

//    public String mts = "https://www.mts.by/";
//
//    public MtsBy openMts() {
//        driver.get(mts);
//        return this;
//    }
    @FindBy (xpath = "//*[@class='select__header']")
//    @FindBy(xpath = "//p[text() = 'Услуги связи']"));
public WebElement stroki1;

    @FindBy(xpath = "//p[text() = 'Домашний интернет']")
    public WebElement homenet1;
    @FindBy (xpath = "//*[@placeholder='Номер абонента']")
    public WebElement homenet2;
    @FindBy(xpath = "//*[contains(@id,'connection-sum')]")
    public WebElement netsum;


    @FindBy(xpath = "//p[text() = 'Рассрочка']")
    public WebElement mentplan;
    @FindBy(xpath = "//*[@placeholder='Номер счета на 44']")
    public WebElement mentplan1;
    @FindBy(xpath = "//*[contains(@id,'instalment-sum')]")
    public WebElement mentplan2;
    @FindBy(xpath = "//*[@id='internet-email']")
    public WebElement mailplan;

    @FindBy(xpath = "//p[text() = 'Задолженность']")
    public WebElement arrears1;
    @FindBy(xpath = "//*[contains(@id,'score-arrears')]")
    public WebElement nomber2073;
    @FindBy(xpath = "//*[contains(@id,'arrears-sum')]")
    public WebElement arrsum;
    @FindBy(xpath = "//*[contains(@id,'arrears-email')]")
    public WebElement arrmail;

    @FindBy(xpath = "//*[text()='Онлайн пополнение ']")
    public WebElement name1;

    @FindBy(xpath = "//div[@class='pay__wrapper']")
    public WebElement logopay;

    @FindBy(xpath = "//a[@href='/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/']")
    public WebElement link;














}
