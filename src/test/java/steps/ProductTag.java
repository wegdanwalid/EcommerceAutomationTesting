package steps;

import Pages.ProductTagPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductTag {
    ProductTagPage productTag =Hooks.homepage.ProducTag1();
    @Given("Logged user in Any Category to select Popular tags")
    public void logged_user_in_any_category_to_select_popular_tags() {
        productTag.selectCategory();
    }
    @When("user determined to tags and assert successfully")
    public void user_determined_to_tags_and_assert_successfully() {
        productTag.slectTag("cool");
    }
    @And("tags determined assert successfully")
    public void tags_determined_assert_successfully() {

    }
    @Then("user Anthor detierment to tags and assert successfully")
    public void user_anthor_detierment_to_tags_and_assert_successfully() {
        productTag.slectTag("shirt");
    }
    @And("Anthor tags determined assert successfully")
    public void anthor_tags_determined_assert_successfully() {
    }
}
