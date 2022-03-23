package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    protected WebDriver driver;
    private By Email= By.id("Email");
    private By Password=By.id("Password");
    private By btnLogin= By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
    private By successLogin=By.xpath("//a[@href=\"/customer/info\"]");
    private  By logout=By.xpath("//a[@href=\"/logout\"]");
    private By loginBeforeSearch=By.xpath("//a[@href=\"/login?returnUrl=%2Fpasswordrecovery\"]");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void UserLogin(String email,String pass){
        driver.findElement(Email).sendKeys(email);
        driver.findElement(Password).sendKeys(pass);
        driver.findElement(btnLogin).click();
    }
    public String GetMyAccount(){
        return driver.findElement(successLogin).getText();
    }
    public void logOutUser(){
        driver.findElement(logout).click();
    }
    public void loginBeforeSearch(){
        driver.findElement(loginBeforeSearch).click();
    }
}
