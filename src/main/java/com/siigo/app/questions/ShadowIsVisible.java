package com.siigo.app.questions;

import org.openqa.selenium.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.abilities.*;

public class ShadowIsVisible implements Question<Boolean> {
    private final String jsSelector;

    public ShadowIsVisible(String jsSelector) {
        this.jsSelector = jsSelector;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
        WebElement shadowElement = (WebElement) js.executeScript(jsSelector);

        return shadowElement.isDisplayed();
    }
    
    public static ShadowIsVisible from(String jsSelector) {
        return new ShadowIsVisible(jsSelector);
    } 
}
