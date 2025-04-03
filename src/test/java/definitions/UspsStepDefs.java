package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;

import org.openqa.selenium.support.ui.WebDriverWait;
import static support.TestContext.*;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class UspsStepDefs {
    @When("I go to Lookup ZIP page by address")
    public void iGoToLookupZIPPageByAddress() throws InterruptedException{

        //replaced the step to use Actions in the pop-up
        //getDriver().findElement(By.xpath("//a[@id='mail-ship-width']")).click();
//        List<WebElement> links = getDriver().findElements(By.tagName("a"));
//        for (WebElement link : links) {
//            System.out.println(link.getAttribute("href"));
//                }
        //replaced the step
        //getDriver().findElement(By.xpath("//a[contains(@href,'ZipLookupAction!')]")).click();

        //new steps
        WebElement mailAndShip = getDriver().findElement(By.xpath("//a[@id='mail-ship-width']"));
        //Actions actions = new Actions(getDriver());
        new Actions(getDriver()).moveToElement(mailAndShip).perform();
        getDriver().findElement(By.xpath("//li[@class='tool-zip']")).click();
//        List<WebElement> scripts = getDriver().findElements(By.tagName("script"));
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

        //explicit wait
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElement(resultElement,zip));
        // Here is it searches in the Result section, without checking each element
        //This is how it can be written as well:
        //new WebDriverWait(getDriver(),Duration.ofSeconds(5))
        //             .until(ExpectedConditions.textToBePresentInElement(resultElement,zip));

        //wait.until(ExpectedConditions.textToBePresentInElementValue())
        //wait.until(ExpectedConditions.elementToBeSelected())

        //The explicit wait makes the below assertion redundant
//        String result = getDriver().findElement(By.cssSelector("#zipByAddressDiv")).getText();
//        System.out.println("Search result: " + result);
//        assertThat(result).contains(zip);


        //in each element this zipcode is present - findElements
        List<WebElement> list = getDriver().findElements(By.xpath("//div[@class='zipcode-result-address']"));
        // for each loop
        for (WebElement item : list){
            String itemText = item.getText();
            System.out.println(itemText);
            assertThat(itemText.contains(zip));
        }
        //using stream

        list.stream()
                .map(WebElement::getText)
                .forEach(text -> assertThat(text.contains(zip)).isTrue());

        //using Iterator
        Iterator<WebElement> iterator = list.iterator();
        while(iterator.hasNext()){
            WebElement element = iterator.next();
            assertThat(element.getText().contains(zip)).isTrue();
        }

    }

    @When("I go to Calculate Price Page")
    public void iGoToCalculatePricePage() {
        getDriver().findElement(By.xpath("//a[@id='mail-ship-width']")).click();
        getDriver().findElement(By.xpath("//a[contains(@href,'calculateretailpostage')]")).click();
    }

    @And("I select {string} with {string} shape")
    public void iSelectWithShape(String country, String postageOption) {
        WebElement countrySelect = getDriver().findElement(By.xpath("//select[@id='CountryID']"));
        new Select(countrySelect).selectByVisibleText(country);

        getDriver().findElement(By.xpath("//input[@id='option_1'][@value='Postcard']")).click();
    }
    @And("I define {string} quantity")
    public void iDefineQuantity(String gty) {
        getDriver().findElement(By.cssSelector("#quantity-0")).sendKeys("2");
    }

    @Then("I calculate the price and validate cost is {string}")
    public void iCalculateThePriceAndValidateCostIs(String cost) {
        getDriver().findElement(By.xpath("//input[@value='Calculate']")).click();
        String result = getDriver().findElement(By.xpath("//div[@id='total']")).getText();
        assertThat(result.equals(cost));
    }


    @And("I search for {string}")
    public void iSearchFor(String searchText) {
        WebElement searchLookingGlass = getDriver().findElement(By.xpath("//li[contains(@class,'nav-search')]"));
        getActions().moveToElement(searchLookingGlass).perform();

    }

    @And("I search on main page for {string}")
    public void iSearchOnMainPageFor(String searchText) {
        WebElement searchLookingGlass = getDriver().findElement(By.xpath("//li[contains(@class,'nav-search')]"));
        getActions().moveToElement(searchLookingGlass).perform();

        WebElement searchInput = getDriver().findElement(By.xpath("//input[@id='global-header--search-track-search']"));
        searchInput.sendKeys(searchText);
        searchInput.sendKeys(Keys.ENTER);
    }
}
