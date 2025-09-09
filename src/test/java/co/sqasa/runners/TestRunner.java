package co.sqasa.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
//import cucumber.api.java.BeforeSuite;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/test.feature",   // Ruta de features
        glue = "co.sqasa.StepDef",                  // Paquete donde están los step
        tags = "@Case1 or @Case2 or @Case3",
        plugin = {"pretty","json:target/cucumber-reports/cucumber.json"},
        snippets = SnippetType.CAMELCASE
)

public class TestRunner {
    //@BeforeSuite
    //public static void test() throws IOException, InvalidFormatException {
    //    DataToFeature.overrideFeatureFiles("src/test/resources/features/test.feature");
    //}
}