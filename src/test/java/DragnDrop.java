import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragnDrop {

    @Test
    void dragDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("[id=column-a]").dragAndDropTo($("[id=column-b]"));
        $("[id=column-a]").shouldHave(text("B"));
        $("[id=column-b]").shouldHave(text("A"));
    }
}
