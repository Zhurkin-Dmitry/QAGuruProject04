import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubTest {

    @Test
    void gitHubSearch() {
        open("https://github.com/selenide/selenide");
        $("[data-content=\"Wiki\"]").click();
        $(byText("Show 1 more pages…")).click();
        $$("#wiki-pages-box li a").find(text("SoftAssertions")).click();
        $$("#wiki-body ol li").shouldHave(itemWithText("Using JUnit5 extend test class:"));

        sleep(4000);
    }

}
