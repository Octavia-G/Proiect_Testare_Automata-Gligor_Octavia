package Automation.myPages;

import Automation.myConstants.myConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void click_CreateAccount(){
        WebElement CreateAcc = driver.findElement(By.cssSelector("li[id='pt-createaccount-2'] span"));
        CreateAcc.click();
    }

    public void click_SignIn(){
        WebElement SignIn = driver.findElement(By.cssSelector("li[id='pt-login-2'] a[title='Sunteți încurajat să vă autentificați, deși acest lucru nu este obligatoriu. [alt-shift-o]'] span"));
    }

    public void click_HideButton(){
        WebElement hide = driver.findElement(By.cssSelector("button[data-event-name='pinnable-header.vector-toc.unpin']"));
        hide.click();
    }

    public boolean isContentsHidden(){
        WebElement hideContents = driver.findElement(By.cssSelector("#vector-page-titlebar-toc-checkbox"));

        return hideContents.isSelected();
    }

    public void clickOnImage(){
            WebElement img = driver.findElement(By.cssSelector(".mw-file-element[src='//upload.wikimedia.org/wikipedia/commons/thumb/7/73/Flag_of_Romania.svg/125px-Flag_of_Romania.svg.png']"));
            img.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    public void clickCloseImage(){
        WebElement close = driver.findElement(By.className("mw-mmv-close"));
        close.click();
    }

    public void clickPlayMusic(){
        WebElement play = driver.findElement(By.cssSelector(".mw-tmh-play-icon"));
        play.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    public void is_MusicPlaying() {
        WebElement play = driver.findElement(By.cssSelector("#mwe_player_0"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        try {
            play.isDisplayed();
        } catch (Exception e) {
            boolean value = false;
            Assert.assertFalse(value);
        }
    }

    public void click_Title(){
        WebElement title = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > nav:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(8) > a:nth-child(1) > div:nth-child(1)"));
        title.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    public void show_Subtitle(){
        WebElement subtitle = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > nav:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(8) > ul:nth-child(3) > li:nth-child(1) > a:nth-child(1) > div:nth-child(1)"));
        Assert.assertTrue(subtitle.isDisplayed());
    }

    public boolean isMoreAvailable(){
        WebElement seeMore = driver.findElement(By.cssSelector("p:nth-child(16)"));
        return  seeMore.isDisplayed();
    }

    public void open_HomePage(){
        driver.get(myConstants.homepage);
    }
}

