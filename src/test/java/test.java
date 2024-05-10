import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.interactions.Actions;

public class test {
    public static void main(String[] args) {
        open("https://the-internet.herokuapp.com/drag_and_drop"); // URL of the site to test


        SelenideElement source = $("#column-a");
        SelenideElement target = $("#column-b");


        new Actions(WebDriverRunner.getWebDriver())
                .clickAndHold(source)
                .moveToElement(target)
                .release()
                .build()
                .perform();


        //target.shouldHave(text("Expected result after drag and drop"));
        sleep(5000);
    }
}
