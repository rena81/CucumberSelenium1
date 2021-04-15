package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features"},
		glue = {"steps"},
		plugin = {"pretty", "html:Report1", "json:Report2", "junit:Report3"},
		//	        dryRun = true
		//	        strict = true,
		//	        monochrome = true
		tags = {"@test1 or @test2 or @test3 or @test4 or @test5 or @test6 or @test7" }
		//	        name = {"Logo"}
		)
public class TestRunner {
}

