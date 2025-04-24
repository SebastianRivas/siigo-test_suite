package com.siigo.app.interactions;

import org.openqa.selenium.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.abilities.*;

public class ShadowSendKeys implements Interaction {
    private final String jsSelector;
    private final String value;

    public ShadowSendKeys(String jsSelector, String value) {
        this.jsSelector = jsSelector;
        this.value = value;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
        WebElement shadowElement = (WebElement) js.executeScript(jsSelector);
        shadowElement.sendKeys(value);
    }

    public static ShadowSendKeys using(String jsSelector, String value) {
        return Tasks.instrumented(ShadowSendKeys.class, jsSelector, value);
    }
}
