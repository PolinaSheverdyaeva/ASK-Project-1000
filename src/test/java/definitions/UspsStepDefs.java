package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;
import support.TestContext;

import java.time.Duration;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class UspsStepDefs {
    @When("I go to Lookup ZIP page by address")
    public void iGoToLookupZIPPageByAddress() throws InterruptedException{
        getDriver().findElement(By.xpath("//a[@id='mail-ship-width']")).click();
//        List<WebElement> links = getDriver().findElements(By.tagName("a"));
//        for (WebElement link : links) {
//            System.out.println(link.getAttribute("href"));
//                }
        getDriver().findElement(By.xpath("//a[contains(@href,'ZipLookupAction!')]")).click();

//        List<WebEle   ment> scripts = getDriver().findElements(By.tagName("script"));
//        for (WebElement script : scripts){
//            String scriptContent = script.getAttribute(("innerHTML"));
//            if(!scriptContent.isEmpty()) {
//                System.out.println("Script: ");
//                System.out.println(scriptContent);
//                System.out.println("+++++++++++++++++++++++++++++++++++++++");
        getDriver().findElement(By.cssSelector(".zip-code-address.zip-code-home")).click();
//
//            }
        //        }

    }

    @And("I fill out {string} street, {string} city, {string} state")
    public void iFillOutStreetCityState(String street, String city, String state) {
        List<WebElement> selects = getDriver().findElements(By.tagName("select"));
        for (WebElement select : selects) {
            String selectContent = select.getAttribute(("innerHTML"));
            if (!selectContent.isEmpty()) {
                System.out.println("Select: ");
                System.out.println(selectContent);
                System.out.println("========================");
            }
        }

        getDriver().findElement(By.cssSelector("#tAddress")).sendKeys(street);
        getDriver().findElement(By.cssSelector("#tCity")).sendKeys(city);

//        WebElement stateElement = getDriver().findElement(By.cssSelector("#tState"));
//        Select stateSelect = new Select(stateElement);
//        stateSelect.selectByValue(state);

        WebElement stateElement = getDriver().findElement(By.cssSelector("#tState"));
        new Select(stateElement).selectByValue(state);

//        getDriver().findElement(By.xpath("//select[@id='tState']/option[@value='"+ state +"']")).click();
//        getDriver().findElement(By.cssSelector("select[id='tState'] option[value='"+ state +"']")).click();
        getDriver().findElement(By.cssSelector("#zip-by-address")).click();
    }

    @Then("I validate {string} zip code exists in the result")
    public void iValidateZipCodeExistsInTheResult(String zip) throws InterruptedException{
        WebElement resultElement = getDriver().findElement(By.cssSelector("#zipByAddressDiv"));

        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElement(resultElement,zip));

        String result = getDriver().findElement(By.cssSelector("#zipByAddressDiv")).getText();
        System.out.println("Search result: " + result);
        assertThat(result).contains(zip);
    }
}
