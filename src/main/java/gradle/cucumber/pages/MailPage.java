package gradle.cucumber.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MailPage {


    public SelenideElement NewMassageBtn = $(".mail-ComposeButton-Text");

    public void checkOpenMailPage() {
        NewMassageBtn.shouldHave(text("Написать"));
    }
}
