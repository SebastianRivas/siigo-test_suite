package com.siigo.app.tasks.thirdparty;

import com.siigo.app.pageobjects.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class WaitThirdPartyCreated implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ThirdPartyPage.ALERT_DIALOG, isVisible()).forNoMoreThan(30).seconds());
    }

    public static WaitThirdPartyCreated loading() {
        return Tasks.instrumented(WaitThirdPartyCreated.class);
    }
}
