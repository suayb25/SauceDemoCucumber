package SauceDemoCucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\java\\SauceDemoCucumber\\tests.feature" },
        plugin = { "pretty" })

public class TestRunner {
}
