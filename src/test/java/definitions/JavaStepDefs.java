package definitions;

import com.google.gson.internal.bind.util.ISO8601Utils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class JavaStepDefs {
    @Given("I say hello world")
    public void iSayHelloWorld() {
        System.out.println("Hello World");

        String var1 = "Hello World";
        var1 = "Hello World again";

        System.out.println(var1);

        String lastName = "Pol";
        String firstName = "Pen";
        System.out.println("Full name 1:" + firstName + " " + lastName);
        System.out.printf("Full name 2: %s %s%n", firstName, lastName);

        String template = "Full name 3: {firstName} {lastName}";
        String output = template.replaceAll("\\{firstName\\}", firstName).
                replaceAll("\\{lastName\\}", lastName);
        System.out.println(output);

        System.out.println(firstName.length() + " " + lastName.toUpperCase());
        System.out.println(firstName.isBlank());
        System.out.println(firstName.getClass());


    }

    @When("I say {string}")
    public void iSay(String mes) {

//        System.out.println(mes);
        System.out.println("Simon says " + mes);
    }


    @Given("I perform actions with variables {string} and {string}")
    public void iPerformActionsWithVariablesAnd(String str1, String str2) {
        System.out.println("str1: " + str1 + ", " + "str2: " + str2);
    }

    @When("I print the variables {string} and {string} into console using regexp")
    public void iPrintTheVariablesAndIntoConsoleUsingRegexp(String str1, String str2) {
        String template = "str1: {str1}, str2: {str2}";
        String output = template.replaceAll("\\{str1\\}", str1).
                replaceAll("\\{str2\\}", str2);
        System.out.println(output);
    }

    @When("I print the variables {string} and {string} into console using printf")
    public void iPrintTheVariablesAndIntoConsoleUsingPrintf(String str1, String str2) {
        System.out.printf("str1: %s, str2: %s%n", str1, str2);
    }

    @And("I print the variables {string} and {string} uppercase into console")
    public void iPrintTheVariablesAndUppercaseIntoConsole(String str1, String str2) {
        System.out.println("str1: " + str1.toUpperCase() + ", " + "str2: " + str2.toUpperCase());
    }

    @And("I print result of exact comparison of the variables {string} and {string} into console")
    public void iPrintResultOfExactComparisonOfTheVariablesAndIntoConsole(String str1, String str2) {
        System.out.println("str1 equals to str2? " + str1.equals(str2));
    }

    @And("I print result of exact comparison ignoring cases of the variables {string} and {string} into console")
    public void iPrintResultOfExactComparisonIgnoringCasesOfTheVariablesAndIntoConsole(String str1, String str2) {
        System.out.println("str1 equals to str2 ignoring cases? " + str1.equalsIgnoreCase(str2));
    }

    @And("I print result of partial comparison of the variables {string} and {string} into console")
    public void iPrintResultOfPartialComparisonOfTheVariablesAndIntoConsole(String str1, String str2) {
        System.out.println("str1 partially equals to str2? " + str1.toLowerCase().contains(str2.toLowerCase()));
    }

    @And("I compare length of {string} and {string} into console")
    public void iCompareLengthOfAndIntoConsole(String str1, String str2) {
        if(str1.length() == str2.length()){
            System.out.println("Strings are the same length");
        } else{
            System.out.println("Strings are different legth");
        }

    }

    @And("I print length of the variables {string} and {string} into console")
    public void iPrintLengthOfTheVariablesAndIntoConsole(String str1, String str2) {
        System.out.println("str1 length: " + str1.length() + ", " + "str2 length: " + str2.length());
    }

    @And("I print the variables {string} and {string} into console in reverse order")
    public void iPrintTheVariablesAndIntoConsoleInReverseOrder(String str1, String str2) {
        StringBuilder revStr1 = new StringBuilder();
        StringBuilder revStr2 = new StringBuilder();

        for (int i = str1.length() - 1; i >= 0; i--){
            revStr1.append(str1.charAt(i));
        }

        for(int j = str1.length() - 1; j >= 0; j--){
            revStr2.append(str2.charAt(j));
        }
        System.out.println("str1: " + revStr1 + ", " + "str2: " + revStr2);


        System.out.println("hello".toUpperCase());
    }

    @And("I print url for {string}")
    public void iPrintUrlFor(String siteName) {
////        System.out.println(siteName);
//        if(siteName.equalsIgnoreCase("google")) {
//            System.out.println("https://www.google.com/");
//        } else if(siteName.equalsIgnoreCase("bing")){
//            System.out.println("https://www.bing.com/");
//        } else if(siteName.equalsIgnoreCase("quote")) {
//            System.out.println("https://skryabin.com/market/quote.html");
//        }else{
//            System.out.println("Not supported website");
//        }

        switch (siteName.toLowerCase()){
            case "google":
                System.out.println("https://www.google.com/");
                break;
            case "bing":
                System.out.println("https://www.bing.com/");
                break;
            case "quote":
                System.out.println("https://skryabin.com/market/quote.html");
                break;
            default:
                System.out.println("Not supported website" + siteName);
                break;
        }
    }
}
