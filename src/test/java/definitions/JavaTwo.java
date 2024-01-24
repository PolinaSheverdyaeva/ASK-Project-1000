package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import gherkin.ast.ScenarioOutline;

public class JavaTwo {
    @Given("I write java step")
    public void iWriteJavaStep() {
        System.out.println("Hello To Polina!");
    }

    @And("I write another java step with argument {string}")
    public void iWriteAnotherJavaStepWithArgument(String message) {
        System.out.println(message);
    }
}
