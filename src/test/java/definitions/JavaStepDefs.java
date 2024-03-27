package definitions;

import com.google.gson.internal.bind.util.ISO8601Utils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
        if (str1.length() == str2.length()) {
            System.out.println("Strings are the same length");
        } else {
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

        for (int i = str1.length() - 1; i >= 0; i--) {
            revStr1.append(str1.charAt(i));
        }

        for (int j = str1.length() - 1; j >= 0; j--) {
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

        switch (siteName.toLowerCase()) {
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
//                System.out.println("Not supported website" + siteName);
                throw new RuntimeException("Not supported website. Actual :" + siteName);
        }
    }

    @Given("I work with arrays")
    public void iWorkWithArrays() {
        String[] fruits = {"apple", "plum", "kiwi"};
        int[] nums = {5, 2, 3, 2, 5};

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        for (int num : nums) {
            System.out.println("num: " + num);
        }

        List<String> myFruits = Arrays.asList("apple", "kiwi");
        for (String fruit : myFruits) {
            System.out.println(fruit);
        }

        Iterator<String> iterator = myFruits.iterator();

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println("Using iterator: " + fruit);
        }

        List<Integer> myNumbers = Arrays.asList(5, 2, 3, 2, 5);
        for (int num : myNumbers) {
            System.out.println("num " + num);
        }
        myNumbers.add(6);


    }

    @Given("I work with maps")
    public void iWorkWithMaps() {
        Map<String, String> user = Map.of(
                "username", "jdough",
                "password", "welcome",
                "email", "john@doe.com"
        );
        Map<String, String> admin = Map.of(
                "username", "admin",
                "password", "pass1",
                "email", "admin@doe.com"
        );
        System.out.println(user);
        System.out.println(admin);
        System.out.println(user.get("username"));
        System.out.println(user.get("password"));
        System.out.println(user.get("email"));
        System.out.println(admin.get("username"));
        System.out.println(admin.get("password"));
        System.out.println(admin.get("email"));

    }

    @Given("I solve coding challenges")
    public void iSolveCodingChallenges() {
        swap(3, 5);
        isDivisible(17);
        isDivisible2(9);
        isDivisible2(8);
        isDivisible2(12);
        isDivisible2(13);
    }

    //interview coding task: swap 2 variables values
    void swap(int a, int b) {
        System.out.println("Swap function");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    void isDivisible(int num) {
        System.out.println("isDivisible function");
        if (num % 12 == 0) {
            System.out.println(num + " divisible by 3 and 4");
        } else if (num % 3 == 0) {
            System.out.println(num + " divisible by 3");
        } else if (num % 4 == 0) {
            System.out.println(num + " divisible by 4");
        } else {
            System.out.println(num + " is not divisible by 3 and 4");

        }
    }

    void isDivisible2(int num) {
        System.out.println("isDivisble 2");
        switch (num % 12) {
            case 0:
                System.out.println(num + " divisible by 3 and 4");
                break;
            case 3:
                System.out.println(num + " divisible by 3");
                break;
            case 4:
                System.out.println(num + " divisible by 4");
                break;
            default:
                System.out.println(num + " is not divisible by 3 and 4");
                break;
        }
    }
}

