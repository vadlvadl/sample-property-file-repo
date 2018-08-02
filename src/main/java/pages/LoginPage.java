package pages;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private String loginInputID = "login-form-username";
    private String passwordInputID = "login-form-password";
    private String submitButtonID = "login";

    public void enterLogin(String login){
        $(byId(loginInputID)).sendKeys(login);
    }

    public void enterPassword(String password){
        $(byId(passwordInputID)).sendKeys(password);
    }

    public void clickSubmitButton(){
        $(byId(submitButtonID)).click();
    }



}
