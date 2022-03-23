package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import steps.Hooks;

public class ProductTagPage {
    private WebDriver driver;
    Actions actions;
    private By jewelryCategory = By.cssSelector("a[href=\"/jewelry\"]");
    private By CoolTag = By.cssSelector("a[href=\"/cool\"]");
    private By ShirtTag = By.cssSelector("a[href=\"/shirt\"]");


    public ProductTagPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }

    public void selectCategory() {
        actions.moveToElement(Hooks.driver.findElement(jewelryCategory)).click().build().perform();
    }
    public void slectTag(String tagname){
        if(tagname =="cool"){
            driver.findElement(CoolTag).click();
        }else if(tagname=="shirt"){
            driver.findElement(ShirtTag).click();
        }
    }
}
