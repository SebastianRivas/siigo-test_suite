package com.siigo.app.pageobjects;

import net.serenitybdd.core.pages.*;
import net.serenitybdd.annotations.*;
import net.serenitybdd.screenplay.targets.*;

@DefaultUrl("https://qastaging.siigo.com/#/login")
public class LoginPage extends PageObject {
    public static Target FORM_LOGIN = Target.the("Form Login").locatedBy("//div[@class=\"login\"]");
    public static Target BUTTON_INGRESAR = Target.the("Button Ingresar").locatedBy("//button[@id=\"login-submit\"]");
    public static Target ALERT = Target.the("Alert Message").locatedBy("//div[@class=\"notification notification-danger\"]");
}
