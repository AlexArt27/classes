package com.automation.stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.LinkedList;
import java.util.List;

public class StepDefinition {

    @Given("user opens website")
    public void openWebsite() {

    }

    @Given("user us on login page")
    public void verifyLoginPage() {

    }

    @When("user enters username {string} and password {string}")
    public void doLogin(String username, String password) {

        System.out.println(username + " "+ password);
    }

    @When("click on login button")
    public void click_on_login_button() {

    }

    @Then("verify user is navigated to homepage")
    public void verifyHomePage() {

    }


    @And("selects logout option")
    public void selectsLogoutOption() {
        
    }

    @Given("user opens admin website")
    public void userOpensAdminWebsite() {

    }

    @When("user hover mouse on PIM menu")
    public void user_hover_mouse_on_pim_menu() {
        
        
    }
    @When("click on Add Employee link")
    public void click_on_add_employee_link() {
        
        
    }
    @Then("verify user is navigated to add employee page")
    public void verify_user_is_navigated_to_add_employee_page() {
        
    }
    @When("user enters valid details on add employee page")
    public void user_enters_valid_details_on_add_employee_page() {
        
        
    }
    @When("click on save button")
    public void click_on_save_button() {
        
        
    }
    @Then("verify user is navigated to personal details page")
    public void verify_user_is_navigated_to_personal_details_page() {
        
        
    }

    @Then("verify the error message for missing first and last is displayed")
    public void verifyTheErrorMessageForMissingFirstAndLastIsDisplayed() {

    }

    @Then("verify invalid login error message is displayed")
    public void verifyInvalidLoginErrorMessageIsDisplayed() {
    }

    @Then("verify table has below data")
    public void verify_table_has_below_data(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists();
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.get(i).size(); j++) {
                System.out.print(data.get(i).get(j)+" ");
            }
        }
    }

    @Then("verify one more table data with data table")
    public void verify_another_table_data(DataTable datatable){
        List<String> listOfData = datatable.asList();
        for (String data : listOfData){
            System.out.println(data);
        }
    }
    @When("user clicks on user badge icon")
    public void user_clicks_on_user_badge_icon() {

    }
    @When("select on logout option")
    public void select_on_logout_option() {

    }
    @Then("user is on login page")
    public void user_is_on_login_page() {

    }

}
