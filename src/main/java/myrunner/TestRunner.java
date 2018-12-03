package myrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\myselenium\\freecrmBDDframework\\src\\main\\java\\features\\login.feature",
glue= {"stepdefinations"},
format= {"pretty","html:test-output"},
dryRun=true
)

public class TestRunner {

}
