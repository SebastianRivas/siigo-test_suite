package com.siigo.app.pageobjects;

import net.serenitybdd.core.pages.*;
import net.serenitybdd.annotations.*;
import net.serenitybdd.screenplay.targets.*;

@DefaultUrl("https://qastaging.siigo.com/#/third-party/350?Customer=true")
public class ThirdPartyPage extends PageObject {
    public static Target THIRDPARTY_FORM = Target.the("Thirdparty Form").locatedBy("//thirdparty-root");
    public static Target CANCEL_BUTTON = Target.the("Cancel Button Thirdparty Form").locatedBy("//button[@class='button red']");
    public static Target SAVE_BUTTON = Target.the("Save Button Thirdparty Form").locatedBy("//button[@class='button green filled']");
    public static Target ALERT_DIALOG = Target.the("Alert Dialog").locatedBy("//div[@class='overlay-container']//child::div[@id='toast-container']//child::div//child::div[@role='alertdialog']");
}
