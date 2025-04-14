package com.siigo.app.tasks.login;

import com.siigo.app.models.*;
import com.siigo.app.pageobjects.*;
import com.siigo.app.interactions.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;

public class LoginUser implements Task {
    private final User user;

    public LoginUser(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            ShadowSendKeys.using("return document.querySelector(\"#username\").shadowRoot.querySelector(\"#username-input\");", user.getUsername()),
            ShadowSendKeys.using("return document.querySelector(\"#current-password\").shadowRoot.querySelector(\"#password-input\");", user.getPassword()),
            Click.on(LoginPage.BUTTON_INGRESAR)
        );
    }

    public static LoginUser login(User user) {
        return Tasks.instrumented(LoginUser.class, user);
    }
}
