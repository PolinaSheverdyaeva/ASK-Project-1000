package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import support.TestContext;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class MarketStepDefs {
    @Given("I go to {string} page")
    public void iGoToPage(String page) {
        switch (page.toLowerCase()) {
            case "quote":
                getDriver().get("https://quote-qa.portnov.com/");
                break;
            case "google":
                getDriver().get("https://www.google.com/");
                break;
            default:
//                System.out.println("Not recognized page " + page);
                throw new RuntimeException("Not recognized page " + page);
        }
    }

    @When("I print page details in console")
    public void iPrintPageDetailsInConsole() {

        System.out.println("Page URL: " + getDriver().getCurrentUrl());
        System.out.println("Page Title: " + getDriver().getTitle());
        System.out.println("Window Handles: " + getDriver().getWindowHandles());
        System.out.println("Page Title: " + getDriver().getPageSource());
       
    }

    @And("I go back and forward, then refresh the page")
    public void iGoBackAndForwardThenRefreshThePage() {
        getDriver().navigate().back();
        getDriver().navigate().forward();
        getDriver().navigate().refresh();
    }

    @When("I fill out required fields")
    public void iFillOutRequiredFields() {
        getDriver().findElement(By.cssSelector("input[ng-model='formData.username']")).sendKeys("shever");
        getDriver().findElement(By.cssSelector("input[ng-model='formData.email']")).sendKeys("shever@gmail.com");
        getDriver().findElement(By.cssSelector("input[ng-model='formData.password']")).sendKeys("Password1");
        getDriver().findElement(By.cssSelector("input[ng-model='formData.confirmPassword']")).sendKeys("Password1");
        getDriver().findElement(By.cssSelector("input[ng-model='formData.name']")).sendKeys("Polina Shever");
        getDriver().findElement(By.cssSelector("input[ng-model='formData.agreedToPrivacyPolicy']")).click();


    }

    @And("I submit the form")
    public void iSubmitTheForm() {
        getDriver().findElement(By.xpath("//*[@id='formSubmit']")).click();
    }

    @And("I change resolution to {string}")
    public void iChangeResolutionTo(String device) {
        if(device.equals("phone")){
            Dimension phoneSize = new Dimension(400, 768);
            getDriver().manage().window().setSize(phoneSize);
        } else if(device.equals("desktop")){
            Dimension desktopSize = new Dimension(1024, 768);
            getDriver().manage().window().setSize(desktopSize);
        } else {
            throw new IllegalArgumentException("Unsupported resolution " + device);
        }
    }


    @Then("I verify email field behavior")
    public void iVerifyEmailFieldBehavior() {


    }

    @When("I type email {string} into email field")
    public void iTypeEmailIntoEmailField(String email) {
        getDriver().findElement(By.xpath("//input[@ng-model='formData.email']")).sendKeys(email);
    }

    @Then("error message {string} should be shown")
    public void errorMessageShouldBeShown(String errorMessage) {
        assertThat(getDriver().findElement(By.cssSelector("#email-error")).isDisplayed()).isTrue();
    }

    @Then("error message {string} is not shown")
    public void errorMessageIsNotShown(String errorMessage) {
        assertThat(getDriver().findElement(By.xpath("//label[@id='email-error']")).isDisplayed()).isFalse();
    }
}
