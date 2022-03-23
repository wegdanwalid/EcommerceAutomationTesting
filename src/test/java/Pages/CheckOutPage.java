package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CheckOutPage {

    private WebDriver driver;
    Actions actions;
    private By Cartheader=By.id("topcartlink");
    private By Gotocart=By.xpath("//*[@id=\"flyout-cart\"]/div/div[4]/button");
    private By agreeterm=By.id("termsofservice");
    private By checkout =By.id("checkout");
    Select sel;
    /*Data to complete Order*/
    @FindBy(css = "input.button-1.checkout-as-guest-button")
    private WebElement guestBtn;
    @FindBy(id = "BillingNewAddress_FirstName")
    private WebElement fnTxt;
    @FindBy(id = "BillingNewAddress_LastName")
    private WebElement lnTxt;
    @FindBy(id = "BillingNewAddress_Email")
    private WebElement emailTxt;
    @FindBy(id = "BillingNewAddress_CountryId")
    private WebElement countryList;
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    private WebElement phoneTxt;
    @FindBy(id = "BillingNewAddress_City")
    private WebElement cityTxt;
    @FindBy(id = "BillingNewAddress_Address1")
    private WebElement addressTxt;
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    private WebElement postCodeTxt;
    @FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/button[4]")
    private WebElement continueBtn;
    @FindBy(id = "shippingoption_1")
    private WebElement shippingMethodRdo;
    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/button")
    private WebElement continueShippingBtn;
    @FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/button")
    private WebElement continuePaymentBtn;
    @FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/button")
    private WebElement continueInfoBtn;
    @FindBy(css = "a.product-name")
    public WebElement prodcutName;
    @FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/button")
    private WebElement confirmBtn;
    @FindBy(css = "h1")
    public WebElement ThankYoulbl;
    @FindBy(css = "div.title")
    private WebElement orderCompleteMsg;
    @FindBy(linkText = "Click here for order details.")
    private WebElement orderDetailsLink;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]/h1")
    private WebElement orderInformation;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        actions = new Actions(driver);
    }
    public void GotoCart(){
        driver.findElement(Cartheader).click();
       // actions.moveToElement(driver.findElement(Cartheader)).moveToElement(driver.findElement(Gotocart)).click().build().perform();
        driver.findElement(agreeterm).click();
        driver.findElement(checkout).click();
    }

    public void CheckoutProduct(String firstName, String lastName, String countryName, String email, String address,
                                String postcode, String phone, String city) throws InterruptedException {

        sel = new Select(countryList);
        sel.selectByVisibleText(countryName);
        setText(cityTxt, city);
        setText(addressTxt, address);
        setText(postCodeTxt, postcode);
        setText(phoneTxt, phone);
        clickBtn(continueBtn);
        clickBtn(shippingMethodRdo);
        clickBtn(continueShippingBtn);
        Thread.sleep(2000);
        clickBtn(continuePaymentBtn);
        Thread.sleep(2000);
        clickBtn(continueInfoBtn);
    }

    public void confirmOrder() throws InterruptedException {
        Thread.sleep(1000);
        clickBtn(confirmBtn);
        Thread.sleep(1000);
    }
    public void viewOrderDetails() {
        clickBtn(orderDetailsLink);
    }
    protected static void setText(WebElement textElement, String textValue) {
        textElement.sendKeys(textValue);
    }
    protected static void clickBtn(WebElement btn) {
        btn.click();
    }
    public String getorderinfo(){
        return orderInformation.getText();
    }

}
