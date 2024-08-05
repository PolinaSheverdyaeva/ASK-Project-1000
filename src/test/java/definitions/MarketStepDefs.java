package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import support.TestContext;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class MarketStepDefs {
    @Given("I go to {string} page")
    public void iGoToPage(String page) {
        switch (page.toLowerCase()) {
            case "usps":
                getDriver().get("https://www.usps.com/");
                break;
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
        System.out.println();
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
//        getDriver().findElement(By.cssSelector("input[ng-model='formData.name']")).sendKeys("Polina Shever");
        getDriver().findElement(By.cssSelector("#name")).click();
        getDriver().findElement(By.cssSelector(("#firstName"))).sendKeys("Polina");
        getDriver().findElement(By.cssSelector(("#lastName"))).sendKeys("Shever");
        getDriver().findElement(By.xpath("//span[text()='Save']")).click();
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

    @Then("I verify that submitted fields saved correctly")
    public void iVerifyThatSubmittedFieldsSavedCorrectly() throws InterruptedException {
//        assertThat(getDriver().findElement(By.id("quotePageResult")).getText()).contains("shever");
//        Thread.sleep(4000);
        String result = getDriver().findElement(By.id("quotePageResult")).getText();
        System.out.println(result);
        assertThat(result).contains("shever");
        assertThat(result).contains("shever@gmail.com");
        assertThat(result).contains("name");
        assertThat(result).containsIgnoringCase("Pass");
        assertThat(result).containsIgnoringCase("Pass");
        String agreed = getDriver().findElement(By.xpath("//b[@name='agreedToPrivacyPolicy']")).getText();
        assertThat(agreed).containsIgnoringCase("True");

        String privacyPolicy = getDriver().findElement(By.xpath("//b[@name='agreedToPrivacyPolicy']")).getText();
        assertThat(privacyPolicy).isEqualTo("true");



//        if (!result.contains("shever")){
//            throw new RuntimeException("Doesn't contain the username");
//        }

    }

    @And("I fill out optional fields")
    public void iFillOutOptionalFields(){
        getDriver().findElement(By.cssSelector("#address")).sendKeys("107 Test Street, Nowhere Town");
        getDriver().findElement(By.cssSelector("input[name='phone']")).sendKeys("4545880");
        getDriver().findElement(By.cssSelector("input[value='female']")).click();
        getDriver().findElement(By.cssSelector("#dateOfBirth")).click();
        getDriver().findElement(By.cssSelector(".ui-datepicker-month option:nth-child(1)")).click();
        getDriver().findElement(By.cssSelector(".ui-datepicker-year option:nth-child(84)")).click();
        getDriver().findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='28']")).click();
//        getDriver().findElement(By.xpath("//select[@name='countryOfOrigin']/option[contains(@value,'China')]")).click();
        WebElement countrySelect = getDriver().findElement(By.xpath("//select[@name='countryOfOrigin']"));
        new Select(countrySelect).selectByValue("China");
        new Select(countrySelect).isMultiple();
//        Select mySelect = new Select(countrySelect);
//        mySelect.selectByValue("Australia");
        getDriver().findElement(By.xpath("//option[contains(text(),'Toyota')]")).click();

    }

    @Then("I verify that optional submitted fields saved correctly")
    public void iVerifyThatOptionalSubmittedFieldsSavedCorrectly() throws InterruptedException {
        System.out.println();
        String result = getDriver().findElement(By.id("quotePageResult")).getText();
        assertThat(result).containsIgnoringCase("4545880");
        assertThat(result).containsIgnoringCase("107 Test Street, Nowhere Town");
        assertThat(result).containsIgnoringCase("female");
        assertThat(result).containsIgnoringCase("female");
        assertThat(result).containsIgnoringCase("China");
        Thread.sleep(7000);

        String res = getDriver().findElement(By.xpath("//div[@id='quotePageResult']")).getText();
/*
Submitted Application
Allowed To Contact true
Username shever
Email shever@gmail.com
Password [entered]
Confirm Password Password1
First Name Polina
Last Name Shever
Name Polina Shever
Agreed To Privacy Policy true
Address 107 Test Street, Nowhere Town
Phone 4545880
Gender female
Country Of Origin China
Car Make Toyota
Location Los Altos, CA 94022
Current Date 04/06/2024
Current Time 12:23 am Eastern Daylight Time

Return
 */

    }
}


