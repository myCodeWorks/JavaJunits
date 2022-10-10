package learning.java.basics;

import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.Matchers;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SimpleCalculatorRunSteps {
	private double total;

    private SimpleCalculator calculator;

    @Before
    private void init() {
        total = -999;

    }

    @Given("^I have a calculator$")
    public void initializeCalculator() throws Throwable {
        calculator = new SimpleCalculator();
    }

    @When("^I add (-?\\d+) and (-?\\d+)$")
    public void testAdd(int num1, int num2) throws Throwable {
        total = calculator.addTwoNumbers(num1,num2);
    }

    @Then("^the result should be (-?\\d+)$")
    public void validateResult(double result) throws Throwable {
        assertThat(total,Matchers.equalTo(result));
    }
}
