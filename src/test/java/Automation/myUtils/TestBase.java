package Automation.myUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {

    public static WebDriver driver;

    public WebDriver initializDriver(){
        if(driver == null){
            driver = new ChromeDriver();
        }
        return driver;
    }

    public void inchideDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

}
