package steps;

import Pages.CheckOutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static steps.Hooks.driver;

public class CreateSuccessfulOrder {
    CheckOutPage checkOutPage=Hooks.homepage.CheckOutPage1();
    @Given("User Go to Shopping cart")
    public void user_got_to_shopping_cart() {
        checkOutPage.GotoCart();
    }
    @When("user Complete Data to create order")
    public void user_complete_data_to_create_order() throws InterruptedException {
        checkOutPage.CheckoutProduct("wegdan", "walid", "Egypt", "wagdanwalid@email.com", "maadi", "11000", "201010101010", "Cairo");

    }
    @Then("assert user created order successful")
    public void assert_user_created_order_successful() throws InterruptedException {
        checkOutPage.confirmOrder();
        Assert.assertTrue(checkOutPage.ThankYoulbl.isDisplayed());
        checkOutPage.viewOrderDetails();
        System.out.println(checkOutPage.getorderinfo());
        Assert.assertEquals(checkOutPage.getorderinfo(),"Order information","order not compete");
        Assert.assertTrue(driver.getCurrentUrl().contains("orderdetails"));

    }
}
