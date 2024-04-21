package Automation.myPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Autentificare_LogInPage {

    WebDriver driver;

    public Autentificare_LogInPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean estePag_Autentif_afisata(){
        WebElement autentif = driver.findElement(By.cssSelector("#firstHeading"));
        return autentif.isDisplayed();
    }

}
