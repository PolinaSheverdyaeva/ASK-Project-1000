package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Scanner;

public class JavaScanner {
//    private TestContext context;
    private Scanner scanner;

    private String userName;

    public JavaScanner(){
        this.scanner = new Scanner(System.in);
    }

    @Given("it prompts to provide users name")
    public void itPromptsToProvideUsersName() {
        System.out.println("Please provide your name: ");
    }

    @When("User provides their name")
    public void userProvidesTheirName() {
        this.userName = scanner.nextLine();
    }

    @Then("it responds with {string}")
    public void itRespondsWith(String userName) {
        System.out.println("Hello " + this.userName + "!");
    }
}
