package com.siigo.app.tasks.thirdparty;

import com.siigo.app.pageobjects.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class WaitThirdPartyPageLoaded implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            WaitUntil.the(ThirdPartyPage.THIRDPARTY_FORM, isVisible()).forNoMoreThan(30).seconds()
        );
    }

    public static WaitThirdPartyPageLoaded loading() {
        return Tasks.instrumented(WaitThirdPartyPageLoaded.class);
    }
}
