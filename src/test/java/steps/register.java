package steps;


import Pages.LoginPage;
import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class register {

    private  String firstname="Wegdan";
    private String lastname="Walid";
    public static String userEmail="wagdan3@gmail.com";
    public static String password="wegdanwalid";
    RegisterPage registerPage;

    @Given("user go to register page")
    public void user_go_to_register_page() {
        registerPage=Hooks.homepage.redirectedToregisterPage();
    }

    @When("user register with valid firstname and lastname and email and password and confirmPassword")
    public void user_register_with_valid_firstname_and_lastname_and_email_and_password_and_confirm_password() {
        registerPage.registerNewUser(firstname,lastname,userEmail,password);

    }
    @And("user press on register button")
    public void user_press_on_register_button() {
        registerPage.clickBtnregister();
    }

    @Then("user register to the system successfully")
    public void user_register_to_the_system_successfully() {
        Assert.assertEquals(registerPage.resulteRegister(), "Your registration completed");
        System.out.println("Wegdan----------------"+registerPage.resulteRegister());
    }

    @And("user logout to login page")
    public void user_logout_to_login_page() {
        registerPage.logOutUser();
    }

}
