package steps;

import Pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddProductToShppoingCart {
    ShoppingCartPage shoppingCartPage=Hooks.homepage.ShoppingCartPage1();
    @Given("Logged user could add different products to Shopping cart")
    public void logged_user_could_add_different_products_to_shopping_cart() {


    }
    @When("user add First products to Shopping cart")
    public void user_add_first_products_to_shopping_cart() {
        shoppingCartPage.addFristproducte();
    }
    @And("assert shopping cart have First product")
    public void assert_shopping_cart_have_two_product2() {
        Assert.assertEquals(shoppingCartPage.getresulttoaddtocart(),"The product has been added to your shopping cart");
        System.out.println("Wegdan---------------First product ----"+shoppingCartPage.getresulttoaddtocart());
    }
    @Then("user add Second products to Shopping cart")
    public void user_add_second_products_to_shopping_cart() {
        shoppingCartPage.addSecondproducte();
    }
    @And("assert shopping cart have Second product")
    public void assert_shopping_cart_have_two_product() {
        Assert.assertEquals(shoppingCartPage.getresulttoaddtocart(),"The product has been added to your shopping cart");
        System.out.println("Wegdan---------------Second product ----"+shoppingCartPage.getresulttoaddtocart());
    }
}
