package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

public class HomePage {
    WebDriver driver;
    public HomePage(){
        driver= Driver.getInstance().getDriver();
        PageFactory.initElements(driver,this);
        this.driver=driver;

    }
    @FindBy(xpath = "//*[text()='Leave']")
    public WebElement leaveButton;
    @FindBy(xpath = "//*[text()='PIM']")
    public WebElement pimButton;
    @FindBy(xpath = "//*[text()='Admin']")
    public WebElement admin;
    @FindBy(id ="menu_leave_viewMyLeaveList")
    public WebElement my_leaveButton;
    @FindBy(css = "form#frmList_ohrmListComponent")
    public WebElement leaveTable;
}
