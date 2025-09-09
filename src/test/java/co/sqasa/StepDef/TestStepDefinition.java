//package co.sqasa.StepDef;
//
//import cucumber.api.java.en.Given;
//
//public class TestStepDefinition {
//
//    @Given("^I open the Serenity test page$")
//    public void iOpenTheSerenityTestPage() {
//        System.out.println("Serenity is running the feature correctly!");
//    }
//}

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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class TestStepDefinition {

    @Managed(driver = "chrome")
    WebDriver browser;

    Actor user = Actor.named("User");

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
    @Then("^the selected date should appear in the input field$")
    public void validateSelectedDate() {
        String selectedDate = Text.of(Objects.INPUT_DATE).viewedBy(user).asString();
        System.out.println("Date in input: " + selectedDate);
        assertThat("The selected date should appear in the input",
                selectedDate, containsString("15"));
    }
}

