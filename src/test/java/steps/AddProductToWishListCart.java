package steps;

import Pages.WishListCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddProductToWishListCart {
    WishListCartPage wishListCartPage=Hooks.homepage.WishListCartPage1();
    @Given("Logged user could add different products to Wishlist cart")
    public void logged_user_could_add_different_products_to_wishlist_cart() {

    }
    @When("user add First products to Wishlist cart")
    public void user_add_first_products_to_wishlist_cart() {

        wishListCartPage.addFristproducte();
    }
    @And("user add Second products to Wishlist cart")
    public void user_add_second_products_to_wishlist_cart() {

        wishListCartPage.addSecondproducte();
    }
    @Then("assert Wishlist cart have two product")
    public void assert_wishlist_cart_have_two_product() {
        Assert.assertEquals(wishListCartPage.getresultsuccessaddtowishlist(),"The product has been added to your wishlist");
        System.out.println("Wegdan---------------Two product ----"+wishListCartPage.getresultsuccessaddtowishlist());
    }

}
