import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class JiraLoginTest {

    @Test
    public void loginToJira(){

        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.timeout = 7000;

        open("http://jira.hillel.it:8080/");

        LoginPage loginPage = new LoginPage();

        loginPage.enterLogin("webinar5");
        loginPage.enterPassword("webinar5");
        loginPage.clickSubmitButton();

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.checkLoggedIn();

    }
}
