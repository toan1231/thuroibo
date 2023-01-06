package api_automation.stepDefinition;

import com.jayway.jsonpath.JsonPath;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;

import ui_automation.utilities.ConfigurationReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;



public class mealBPersonalInfo {
     String token;
    String flag;
  static Response response;
    Map<String,Object>map;
    Scenario scenario;
    @Before
    public void setup(Scenario scenario){
        this.scenario=scenario;

    }

    @Given("User gets token when flag is {string}")
    public void userGetsTokenWhenFlagIs(String flag) throws IOException {

        this.flag=flag;
        File file = new File("src/test/resources/requestBody");
        String reqData = FileUtils.readFileToString(file);
        if (flag.equals("A")) {
            Response response = given()
                    .contentType(ContentType.JSON)
                    .body(reqData)
                    .when()
                    .post(ConfigurationReader.getProperty("api-config.properties", "mealB.tokenAPI.url"));
            token= JsonPath.read(response.asString(),"$.result.accessToken");
            scenario.write(token);

        }

    }
    @When("User submits GET request to {string}")
    public void userSubmitsGETRequestTo(String toan) {
     if(flag.equals("A")){
        response=given()
                 .header("Authorization","Bearer "+token)
                 .when()
                 .get(ConfigurationReader.getProperty("api-config.properties",""+toan+""));
        scenario.write(response.prettyPrint());

     }

    }

    @When("User validates if status code is {int}")
    public void user_validates_if_status_code_is(int ExpectedCode) {
        if(flag.equals("A")){

           int actualStatusCode= response.getStatusCode();


            Assert.assertEquals(ExpectedCode,response.getStatusCode());
            scenario.write(""+response.getStatusCode());

        }
    }

    @Then("User validates {string} in response")
    public void userValidatesInResponse(String element){

        Map<String,Object>map=JsonPath.read(response.asPrettyString(), "$.result");
//      String obj= String.valueOf(map.get(element));
//        System.out.println("element:::"+element+"   value:::"+obj);
        //<String>list=map.keySet();
        map.keySet();
        System.out.println(map.keySet());








    }


    }
