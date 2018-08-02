package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {

    private String accountDetailMenuID = "header-details-user-fullname";

    public void checkLoggedIn(){
        $(By.id(accountDetailMenuID)).should(Condition.exist);
    }
}
