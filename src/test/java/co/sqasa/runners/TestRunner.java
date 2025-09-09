package co.sqasa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "test/resources/features/test.feature",   // Ruta de features
        glue = "co.sqasa.StepDef",                  // Paquete donde están los steps
        snippets = SnippetType.CAMELCASE
)
public class TestRunner {
}
