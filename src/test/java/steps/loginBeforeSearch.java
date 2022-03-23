package steps;

import Pages.LoginPageBeforeSearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class loginBeforeSearch {
    LoginPageBeforeSearch loginPageBeforeSearch;

    @Given("user go to login page before search")
    public void go_to_login_page1()  {
        loginPageBeforeSearch =Hooks.homepage.LoginPageBeforeSearch1();
        loginPageBeforeSearch.loginBeforeSearch();
    }


    @When("user login  before search with valid email and password")
    public void valid_username_password()
    {
        String email= register.userEmail;
        String password=register.password;
        loginPageBeforeSearch.UserLogin(email,password);

    }


    @Then("user login to the system successfully before search")
    public void success_login1()
    {
        Assert.assertEquals(loginPageBeforeSearch.GetMyAccount(),"My account","Login successful");
        System.out.println("Hossam----------------"+loginPageBeforeSearch.GetMyAccount());
    }
}
