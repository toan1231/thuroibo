package ui_automation.step_definitions;

import gherkin.ast.Scenario;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import ui_automation.pages.HomePage;
import ui_automation.utilities.BrowserFactory;
import ui_automation.utilities.Driver;
import ui_automation.utilities.ExcelUtility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hrmOrangeStepPositive {
    WebDriver driver= Driver.getInstance().getDriver();
    HomePage homePage=new HomePage();
    @Then("I click on leave and my leave")
    public void iClickOnLeaveAndMyLeave() {
        homePage.leaveButton.click();
        homePage.my_leaveButton.click();


    }



    @Then("I am able to see leave table record")
    public void iAmAbleToSeeLeaveTableRecord() throws Exception {

        homePage.leaveTable.isDisplayed();



    }

}
