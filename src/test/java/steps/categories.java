package steps;

import Pages.CategoriesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class categories {
    CategoriesPage categoriesPage=Hooks.homepage.CategoriesPage1();
    @Given("Logged user in home page")
    public void logged_user_in_home_page() {

    }
    @When("user detierment to Categories and Hover to sub_Categories")
    public void user_detierment_to_categories_and_hover_to_sub_categories() {
        categoriesPage.selectSubCategory();
        categoriesPage.selectCategoryBook();


    }
    @Then("Click on sub categories successfully")
    public void click_on_sub_categories_successfully() {

        System.out.println("successfully cat");

    }
}
