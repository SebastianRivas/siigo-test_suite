package com.siigo.app.tasks;

import com.siigo.app.pageobjects.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;

public class NavigateTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.browserOn().the(LoginPage.class)
        );
    }

    public static NavigateTo loginPage() {
        return Tasks.instrumented(NavigateTo.class);
    }
}
