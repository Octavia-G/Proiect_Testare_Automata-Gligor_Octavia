package Automation.myStepDefinition;

import Automation.myPages.HomePage;
import Automation.myUtils.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;

import static Automation.myUtils.TestBase.driver;
import static org.testng.AssertJUnit.assertTrue;

public class HomePage_Steps {

    private final HomePage homePage;
    private String currentUrl;

    public HomePage_Steps(TestBase testBase) {
        homePage = new HomePage(testBase.initializDriver());
    }

    @Given("the home page is accessed")
    public void access_HomePage(){
        homePage.open_HomePage();
    }

    @When("the create account button is clicked")
    public void create_Account(){
        homePage.click_CreateAccount();
    }

    @When("the sign in button is clicked")
    public void sign_In(){
        homePage.click_SignIn();
    }

    @When("the user clicks on image")
    public void click_Image(){homePage.clickOnImage();}

    @Then("the user closes image")
    public void close_Image(){homePage.clickCloseImage();}

    @When("the user clicks on the play button")
    public void click_Play(){homePage.clickPlayMusic();}

    @Then("the video should start playing")
    public void music_Playing(){homePage.is_MusicPlaying();}

    @When("the user clicks on a title from the contents")
    public void click_onTitle(){homePage.click_Title();}

    @Then("the subtitles are extended")
    public void extend_Subtitle(){homePage.show_Subtitle();}

    @When("the user clicks on the hide button")
    public void click_Hide(){ homePage.click_HideButton(); }

    @Then("the contents should be hidden")
    public void hidden_Contents(){
        Assert.assertFalse(homePage.isContentsHidden());
    }

    @When("the user scrolls down the page")
    public void scrollDownPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, 1500);");
    }

    @Then("the user should be able to see more content")
        public void seeMore_Content() {
            Assert.assertTrue(homePage.isMoreAvailable());
        }

    @When("the user clicks on languages")
    public void clickLanguages(){
        WebElement lang = driver.findElement(By.id("p-lang-btn-checkbox"));
        lang.click();
    }

    @Then("the foreign language page is displayed")
    public void engLanguage(){
        String newUrl = driver.getCurrentUrl();
        Assert.assertNotEquals(newUrl, currentUrl);
    }

    @When("the user enters {string} into the search bar")
    public void theUserEntersIntoTheSearchBar(String searchTerm) {
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys(searchTerm);
    }

    @And("the user clicks on the search button")
    public void theUserClicksOnTheSearchButton() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement search = driver.findElement(By.xpath("//button[@class='cdx-button cdx-button--action-default cdx-button--weight-normal cdx-button--size-medium cdx-button--framed cdx-search-input__end-button']"));
        search.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Then("the search results page for {string} should be displayed")
    public void theSearchResultsPageForShouldBeDisplayed(String searchTerm) {
            // Assuming there's a unique identifier on the search results page to verify
            // For example, checking for the presence of a specific element
            boolean searchResultsDisplayed = driver.findElement(By.cssSelector(".mw-page-title-main")).isDisplayed();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            assertTrue("Search results page not displayed", searchResultsDisplayed);

    }


}
