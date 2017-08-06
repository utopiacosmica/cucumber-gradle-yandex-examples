package gradle.cucumber.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public MainPage open() {
        Selenide.open("http://yandex.ru");
        return this;
    }

    public SelenideElement txtUserName = $(By.name("login"));
    public SelenideElement txtPassword = $(By.name("passwd"));
    public SelenideElement btnSubmit = $(".button.auth__button.domik2__auth-button.button_theme_bordergray.button_size_m");

    public void login(String userName, String password) {
        txtUserName.val(userName);
        txtPassword.val(password);
    }

    public void clickOnSubmitBtn() {
        btnSubmit.submit();
    }


}
