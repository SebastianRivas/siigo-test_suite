package com.siigo.app.tasks.login;

import net.serenitybdd.screenplay.*;
import com.siigo.app.pageobjects.LoginPage;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class WaitLoginPageLoaded implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.FORM_LOGIN, isVisible()).forNoMoreThan(10).seconds());
    }

    public static WaitLoginPageLoaded loading() {
        return Tasks.instrumented(WaitLoginPageLoaded.class);
    }
}
