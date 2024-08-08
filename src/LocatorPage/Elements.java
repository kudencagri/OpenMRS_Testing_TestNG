package LocatorPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utility.BaseDriver;

import java.util.List;

public class Elements {
    public Elements() {PageFactory.initElements(BaseDriver.driver,this);}

    @FindBy(xpath = "//*[text()='Demo']")
    public static WebElement demo;

    @FindBy(xpath = "//*[text()='Enter the OpenMRS 2 Demo']")
    public WebElement openMRS2;

    @FindBy(xpath = "//ul[@id='sessionLocation']//li")
    public List<WebElement> locations;

    @FindBy(linkText = "Find Patient Record")
    public WebElement patientRecord;

    @FindBy(css = "[class='icon-user']")
    public WebElement registerPatient;

    @FindBy(xpath = "//*[text()='Male']")
    public WebElement gender;

    @FindBy(id = "relationship_type")
    public WebElement relationship;

    @FindBy(css = "[placeholder='Person Name']")
    public WebElement personName;

    @FindBy(className = "PersonName-givenName") //@FindBy(css = "[class='mt-0 mb-2 name']")
    public WebElement verification;

    @FindBy(id = "patient-search")
    public WebElement search;

    @FindBy(xpath = "//*[text()='beybun kulilk']")
    public WebElement selectThePatient;

    @FindBy(xpath = "//*[@role='alert']/tr")
    public List<WebElement> numberOfRows;

    @FindBy(id = "patient-search-results-table_info")
    public WebElement entries;

    @FindBy(linkText = "Appointment Scheduling")
    public WebElement appointmentScheduling;

    @FindBy(linkText = "Manage Appointments")
    public WebElement manageAppointments;

    @FindBy(xpath = "(//*[@class='note error'])[2]")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[@class='gt-current-lang']")
    public WebElement flag;

    @FindBy(xpath = "//*[@class='nturl'][1]")
    public WebElement BritishFlag;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement Username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='loginButton']")
    public WebElement LoginButton;

    @FindBy(xpath = "//*[@id='sessionLocation']/li[1]")
    public WebElement location;

    @FindBy(xpath = "//*[@class='nav-item logout']/a")
    public WebElement logout;

    @FindBy(xpath = "//*[@class='nav-item identifier']")
    public WebElement admin;

    @FindBy(xpath = "//*[@id='user-account-menu']/li/a")
    public  WebElement MyAccount;

    @FindBy(xpath = "//*[@class='task'][1]")
    public WebElement ChangePasswords;


}