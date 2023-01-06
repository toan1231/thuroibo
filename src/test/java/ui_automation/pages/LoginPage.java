package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(){
        driver= Driver.getInstance().getDriver();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//*[@id='txtUsername']")
    public WebElement userNameBox;
    @FindBy(xpath = "//*[@type='password']")
    public WebElement passWordBox;
    @FindBy(xpath = "(//*[@value='LOGIN'])[1]")
    public WebElement loginButton;
    @FindBy(css = "span#spanMessage")
    public WebElement invalidCredentialText;
    public void login(String username,String password){
        userNameBox.sendKeys(username);
        passWordBox.sendKeys(password);
        loginButton.click();
    }
}

