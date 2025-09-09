
package co.sqasa.pageObjects;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Objects {

    // Iframe that contains the Datepicker calendar
    public static final Target IFRAME_CALENDAR = Target.the("calendar iframe")
            .located(By.cssSelector(".demo-frame"));

    // Input field for the date
    public static final Target INPUT_DATE = Target.the("date input field")
            .located(By.id("datepicker"));

    // Button to move to the next month
    public static final Target NEXT_MONTH = Target.the("next month button")
            .located(By.cssSelector(".ui-datepicker-next"));

    // Dynamic method to select a specific day
    public static Target DAY(int day) {
        return Target.the("day " + day)
                .located(By.xpath("//a[text()='" + day + "']"));
    }
}
