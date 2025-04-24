package com.siigo.app.pageobjects;

import net.serenitybdd.core.pages.*;
import net.serenitybdd.annotations.*;
import net.serenitybdd.screenplay.targets.*;

@DefaultUrl("https://qastaging.siigo.com/#/login")
public class LoginPage extends PageObject {
    // Target
    public static Target FORM_LOGIN = Target.the("Form Login").locatedBy("//div[@class=\"login\"]");
    public static Target BUTTON_INGRESAR = Target.the("Button Ingresar").locatedBy("//button[@id=\"login-submit\"]");
    public static Target ALERT = Target.the("Alert Message").locatedBy("//div[@class=\"notification notification-danger\"]");

    // Javascrip Selector
    public static String INPUT_USERNAME = "return document.querySelector(\"#username\").shadowRoot.querySelector(\"#username-input\");";
    public static String INPUT_PASSWORD = "return document.querySelector(\"#current-password\").shadowRoot.querySelector(\"#password-input\");";
}
