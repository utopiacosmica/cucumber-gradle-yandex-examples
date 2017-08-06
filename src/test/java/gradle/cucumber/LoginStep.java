package gradle.cucumber;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gradle.cucumber.pages.MailPage;
import gradle.cucumber.pages.MainPage;

public class LoginStep {

    MainPage mainPage = new MainPage();
    MailPage mailPage = new MailPage();

    @Given("^I navigate to the main page$")
    public void iNavigateToTheMainPage() throws Throwable {
        mainPage.open();
    }

    @And("^I enter the username (.*) and password (.*)$")
    public void iEnterTheUsernameAdminAndPasswordAdmin(String login, String password) throws Throwable {
        mainPage.login(login, password);
    }

    @And("^I click submit button$")
    public void iClickLoginButton() throws Throwable {
        mainPage.clickOnSubmitBtn();
    }

    @Then("^I should see the mail page$")
    public void iShouldSeeTheMailPage() throws Throwable {
        mailPage.checkOpenMailPage();
    }
}
