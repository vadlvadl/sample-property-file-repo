import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

public class JiraLoginTest {

    @Test
    public void loginToJira(){

        Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.timeout = 7000;


    }
}
