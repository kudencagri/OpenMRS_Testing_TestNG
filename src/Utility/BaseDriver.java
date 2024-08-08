package Utility;

import LocatorPage.Elements;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver{
    public static final org.apache.logging.log4j.Logger logger4j= LogManager.getLogger();
    public static WebDriver driver;
    public static WebDriverWait wait;


    @BeforeClass
    public void startupOperations() {
        Logger logger=Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver=new ChromeDriver();
        driver.manage().window().setPosition(new Point(-2000,0));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    }

    @AfterClass
    public void endOperations(){
        MyFunction.OptionalWait(2);
        driver.quit();
    }



    public void loginTest(){
        Elements elm = new Elements();
        driver.get("https://openmrs.org/");
        elm.demo.click();
        elm.openMRS2.click();
        Actions actions=new Actions(driver);
        actions.sendKeys("Admin").keyDown(Keys.TAB).keyUp(Keys.TAB).sendKeys("Admin123").build().perform();
        actions.keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
    }

    public void OpenWebsite(){
        driver.get("https://openmrs.org");
        Elements elm=new Elements();
        Actions actions=new Actions(driver);
        actions.moveToElement(elm.flag).click().build().perform();
        actions.moveToElement(elm.BritishFlag).click().build().perform();
        elm.demo.click();
        elm.openMRS2.click();
        wait.until(ExpectedConditions.elementToBeClickable(elm.Username));
    }

    public void OpenMyAccount(){
        Elements elm=new Elements();
        driver.get("https://openmrs.org");
        Actions actions=new Actions(driver);
        actions.moveToElement(elm.flag).click().build().perform();
        actions.moveToElement(elm.BritishFlag).click().build().perform();
        elm.demo.click();
        elm.openMRS2.click();
        wait.until(ExpectedConditions.elementToBeClickable(elm.Username));
        elm.Username.sendKeys("Admin");
        elm.password.sendKeys("Admin123");
        elm.location.click();
        elm.LoginButton.click();
    }

}
//TODO BURAYA SONRA BEFOREMETHOD VE AFTERMETHOD ILE LOGLAMA ISLEMLERINI YAP