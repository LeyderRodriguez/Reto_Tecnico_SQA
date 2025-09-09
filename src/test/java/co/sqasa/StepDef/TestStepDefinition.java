
package co.sqasa.StepDef;

import co.sqasa.pageObjects.Objects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.screenplay.actions.Enter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import static org.hamcrest.Matchers.equalTo;

import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.Before;


public class TestStepDefinition {

    // CONFIGURACION DRIVER
    @Managed(driver = "chrome")
    WebDriver browser;

    @Before
    public void setupDriver() {
        // Configura automáticamente la versión de ChromeDriver
        WebDriverManager.chromedriver().setup();
    }

    Actor user = Actor.named("User");

    // CASO 1

    // Open Calendar
    @Given("^I open the Datepicker page$")
    public void openDatepickerPage() {
        user.can(BrowseTheWeb.with(browser));
        browser.get("https://jqueryui.com/datepicker/");
        // Switch to the iframe
        WebElement iframe = browser.findElement(By.cssSelector(".demo-frame"));
        browser.switchTo().frame(iframe);
    }

    // Select Day
    @When("^I select day (\\d+) of the current month$")
    public void selectDayOfCurrentMonth(int day) {
        user.attemptsTo(
                Click.on(Objects.INPUT_DATE),
                Click.on(Objects.DAY(day))
        );
    }

    // Input Date
    @Then("^the selected date should contain (\\d+)$")
    public void validateSelectedDate(int expectedDay) {
        String selectedDate = Objects.INPUT_DATE.resolveFor(user).getValue();
        System.out.println("Date in input: " + selectedDate);
        // Convertimos el int a String
        assertThat("The selected date should appear in the input",
                selectedDate, containsString(String.valueOf(expectedDay)));
    }

    // CASO 2

    // SELECCION DIA MES SIGUIENTE
    @When("^I select day (\\d+) of the next month$")
    public void selectDayOfNextMonth(int day) {
        user.attemptsTo(
                Click.on(Objects.INPUT_DATE),   // abre el calendario
                Click.on(Objects.NEXT_MONTH),   // avanza al siguiente mes
                Click.on(Objects.DAY(day))      // selecciona el día
        );
    }

    // CASO 3

    // INGRESO MANUAL
    @When("^I try to enter the date \"(.*)\" manually$")
    public void tryToEnterDateManually(String date) {
        user.attemptsTo(
                Enter.theValue(date).into(Objects.INPUT_DATE)
        );
    }

    // VALIDACION
    @Then("^the input field should remain empty$")
    public void validateInputFieldRemainsEmpty() {
        String selectedDate = Objects.INPUT_DATE.resolveFor(user).getValue();
        System.out.println("Value after manual input attempt: '" + selectedDate + "'");
        assertThat("The input field should remain empty",
                selectedDate, equalTo(""));
    }

}

