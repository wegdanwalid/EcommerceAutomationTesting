package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    WebDriver driver = null;

    @Given("user open chrome browser")
    public void user_open_chrome_browser() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
    }

    @And("user navigates to home page")
    public void user_navigates_to_home_page() {
        driver.navigate().to("https://demo.nopcommerce.com/");
        }

    @When("user clicks on search field")
    public void user_clicks_on_search_field() {
        // locate search field and click on it
        driver.findElement(By.id("small-searchterms")).click();
    }

    @And("user search with project name")
    public void user_search_with_project_name() {
        // locate search field and click on it
        driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
    }

    @And("user could find relative results")
    public void user_could_find_relative_results() {
        int count = driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();
        for (int x = 0; x > count; x++) {
            System.out.println(driver.findElement(By.cssSelector("h2[class=\"product-title\"] a")).getText());
        }
    }
}
