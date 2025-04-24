package com.siigo.app.questions;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.targets.*;

public class ElementIsVisible implements Question<Boolean> {
    private final Target target;

    public ElementIsVisible(Target target) {
        this.target = target;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return target.resolveFor(actor).isVisible();
    }

    public static ElementIsVisible isVisible(Target target) {
        return new ElementIsVisible(target);
    }
}
