import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class JiraLoginTest {

    @Test
    public void loginToJiraTest(){

        PropertyReader props = new PropertyReader("/home/vadim/IdeaProjects/sample-property-file-repo/src/main/resources/jira.properties");

        Configuration.remote = props.getStringValue("configurationRemote");
        Configuration.browser = props.getStringValue("configurationBrowser");
        Configuration.timeout = props.getIntValue("configurationTimeout");

        open(props.getStringValue("jiraURL"));

        LoginPage loginPage = new LoginPage();

        loginPage.enterLogin(props.getStringValue("jiraLogin"));
        loginPage.enterPassword(props.getStringValue("jiraPassword"));
        loginPage.clickSubmitButton();

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.checkLoggedIn();

    }
}
