package Automation.myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage_Creare_cont {

    static WebDriver driver;

    public RegisterPage_Creare_cont(WebDriver driver){

        this.driver = driver;
    }


    public boolean estePag_CreareCont_afisata(){
        WebElement cr_cont = driver.findElement(By.id("wpName2"));
        return cr_cont.isDisplayed();
    }


    public void typeValueToNumeUtilizator(String webElement, String NumeUtilizator){
        WebElement elementNumeUtilizator = driver.findElement(By.cssSelector(webElement));

        elementNumeUtilizator.sendKeys(NumeUtilizator);
    }

    public void typeValueToPassword(String webElement, String Password){
        WebElement elementPassword = driver.findElement(By.cssSelector("#wpPassword2"));

        elementPassword.sendKeys(Password);
    }

    public void typeValueToConfirmPassword(String webElement, String ConfirmPassword){
        WebElement elementConfirmPassword = driver.findElement(By.cssSelector("#wpRetype"));
        elementConfirmPassword.sendKeys(ConfirmPassword);
    }

    public void typeValueToEmail(String webElement, String Email){
        WebElement elementEmail = driver.findElement(By.cssSelector("#wpEmail"));
        elementEmail.sendKeys(Email);
    }
}
