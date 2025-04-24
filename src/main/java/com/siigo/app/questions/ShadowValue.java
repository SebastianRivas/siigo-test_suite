package com.siigo.app.questions;

import org.openqa.selenium.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.abilities.*;

public class ShadowValue implements Question<String> {
    private final String jsSelector;

    public ShadowValue(String jsSelector) {
        this.jsSelector = jsSelector;
    }

    @Override
    public String answeredBy(Actor actor) {
        JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
        WebElement shadowElement = (WebElement) js.executeScript(jsSelector);

        return shadowElement.getText();
    }

    public static ShadowValue from(String jsSelector) {
        return new ShadowValue(jsSelector);
    }
}
