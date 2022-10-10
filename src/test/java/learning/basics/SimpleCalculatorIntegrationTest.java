package learning.basics;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//plugin = {"pretty", "json:target/reports/json/calculator.json"}
//plugin = { "pretty", "html:target/cucumber-reports" }
@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features/simpleCalculator.feature"}, plugin = {"pretty",
        "html:target/cucumber-reports.html"})
public class SimpleCalculatorIntegrationTest {
}
