package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPage loginPage= new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        loginPage.signInButton.click();
    }

    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String expectedTab) {
        String actualTitle= Driver.get().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTab));
        Assert.assertEquals(expectedTab,loginPage.selectedTab.getText());

    }


    @And("Users logins with user name {string} and password {string}")
    public void usersLoginsWithUserNameAndPassword(String userName, String passWord) {
        loginPage.loginBox.sendKeys(userName);
        loginPage.passwordBox.sendKeys(passWord);
        loginPage.submit.click();
      /*  try{
            System.out.println(loginPage.errorMessage.isDisplayed());
        }catch (Exception e)
       {
            Driver.get().get("http://zero.webappsecurity.com/bank/account-summary.html");
        } */
        Driver.get().get("http://zero.webappsecurity.com/bank/account-summary.html");
    }

    @And("user selects {string} page")
    public void userSelectsPage(String arg) {
        loginPage.navigateTo(arg);
    }

    @Then("user gets {string} error message")
    public void userGetsErrorMessage(String arg0) {

        Assert.assertTrue(loginPage.errorMessage.isDisplayed());

    }
}
