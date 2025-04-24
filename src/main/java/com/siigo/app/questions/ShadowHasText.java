package com.siigo.app.questions;

import org.openqa.selenium.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.abilities.*;

public class ShadowHasText implements Question<Boolean> {
    private final String jsSelector;
    private final String text;

    public ShadowHasText(String jsSelector, String text) {
        this.jsSelector = jsSelector;
        this.text = text;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
        WebElement shadowElement = (WebElement) js.executeScript(jsSelector);

        return shadowElement.getText().equals(text);
    }

    public static ShadowHasText from(String jsSelector, String text) {
        return new ShadowHasText(jsSelector, text);
    }
}
