package definitions;

import cucumber.api.java.en.Given;
import support.RestWrapper;
import java.util.Map;

import static support.TestContext.*;

public class RestStepDefs {
    @Given("I login via REST as {string}")
    public void iLoginViaRESTAs(String role) {
        Map<String, String> user = getData(role);
        new RestWrapper().login(user);
    }

}
