package aqa_hw_12.stet_definitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "aqa_hw_12/stet_definitions")

public class CucumberRunner {}
