package steps;

import Pages.CompareListCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import static steps.Hooks.driver;


public class AddProductToCompareCart {
    CompareListCartPage compareListCartPage=Hooks.homepage.CompareListCartPage1();

    @Given("Logged user could add different products to compare cart")
    public void logged_user_could_add_different_products_to_compare_cart() {
        driver.navigate().to("https://demo.nopcommerce.com/books");
    }
    @When("user add First products to compare cart")
    public void user_add_first_products_to_compare_cart() {
        compareListCartPage.addFristproducte();
    }
    @And("user add Second products to compare cart")
    public void user_add_second_products_to_compare_cart() {
        compareListCartPage.addSecondproducte();
    }
    @Then("assert compare cart have two product")
    public void assert_compare_cart_have_two_product() throws InterruptedException {
        Assert.assertEquals(compareListCartPage.getresultsuccessaddtocompare(),"The product has been added to your product comparison");
        System.out.println("Wegdan---------------Two product ----"+compareListCartPage.getresultsuccessaddtocompare());
        Thread.sleep(3000);
    }


}

