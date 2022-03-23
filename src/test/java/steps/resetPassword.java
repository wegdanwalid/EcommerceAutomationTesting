package steps;


import Pages.ResetPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;

public class resetPassword {
    ResetPasswordPage restPasswordPage;
    //LoginPage loginPage=Hooks.homepage.loginPage1();

    @Given("user go to Reset page")
    public void user_go_to_reset_page() {
        //  loginPage.logOutUser();
        Hooks.homepage.loginPage1();
        restPasswordPage =Hooks.homepage.restPasspage();
    }

    @When("user reset with valid email")
    public void user_reset_with_valid_email() {
        String email=register.userEmail;
        restPasswordPage.setEmailToRestPassword(email);
    }

    @And("user press on Recover button")
    public void user_press_on_recover_button() {
        restPasswordPage.clickOnBtuuonRest();
    }

    @Then("user reset password successfully")
    public void user_reset_password_successfully() throws InterruptedException {
        Assert.assertEquals(restPasswordPage.getResultfromRest(),"Email with instructions has been sent to you.","incorrect message");
        System.out.println("Wegdan----------------"+restPasswordPage.getResultfromRest());
        Thread.sleep(3000);
    }



}
