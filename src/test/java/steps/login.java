package steps;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;

public class login {
    LoginPage loginPage;
    @Given("user go to login page")
    public void go_to_login_page()  {
        loginPage =Hooks.homepage.loginPage1();
    }


    @When("user login with valid email and password")
    public void valid_username_password()
    {
        String email= register.userEmail;
        String password=register.password;
        loginPage.UserLogin(email,password);

    }


    @Then("user login to the system successfully")
    public void success_login()
    {
        Assert.assertEquals(loginPage.GetMyAccount(),"My account","Login successful");
        System.out.println("Wegdan----------------"+loginPage.GetMyAccount());
        loginPage.logOutUser();
    }
}
