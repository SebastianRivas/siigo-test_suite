package com.siigo.app.tasks.dashboard;

import net.serenitybdd.screenplay.*;
import com.siigo.app.pageobjects.DashboardPage;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class WaitDashboardPageLoaded implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(DashboardPage.DASHBOARD_HEADER, isVisible()).forNoMoreThan(30).seconds());
    }

    public static WaitDashboardPageLoaded loading() {
        return Tasks.instrumented(WaitDashboardPageLoaded.class);
    }
}
