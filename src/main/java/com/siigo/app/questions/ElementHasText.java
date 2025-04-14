package com.siigo.app.questions;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.targets.*;

public class ElementHasText implements Question<Boolean> {
    private final Target target;
    private final String text;

    public ElementHasText(Target target, String text) {
        this.target = target;
        this.text = text;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (target.resolveFor(actor).isVisible() && (target.resolveFor(actor).getText().equals(text))) {
            return true;
        } else {
            return false;
        }
    }

    public static ElementHasText hasText(Target target, String text) {
        return new ElementHasText(target, text);
    }
}
