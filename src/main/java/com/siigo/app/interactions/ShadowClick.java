package com.siigo.app.interactions;

import org.openqa.selenium.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.abilities.*;

public class ShadowClick implements Interaction {
    private final String jsSelector;

    public ShadowClick(String jsSelector) {
        this.jsSelector = jsSelector;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
        WebElement shadowElement = (WebElement) js.executeScript(jsSelector);
        shadowElement.click();
    }
    
    public static ShadowClick using(String jsSelector) {
        return Tasks.instrumented(ShadowClick.class, jsSelector);
    }
}
