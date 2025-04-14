package com.siigo.app.stepdefinitions;

import com.siigo.app.tasks.*;
import io.cucumber.java.en.*;
import com.siigo.app.models.*;
import com.siigo.app.questions.*;
import com.siigo.app.pageobjects.*;
import com.siigo.app.tasks.login.*;
import net.serenitybdd.screenplay.*;
import com.siigo.app.tasks.dashboard.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginStepDefinitions {
    @Given("{actor} desea ingresar al login de SIIGO")
    public void actor_desea_ingresar_al_login_de_SIIGO(Actor actor) {
        actor.attemptsTo(NavigateTo.loginPage());
    }

    @When("{actor} ingresa las credenciales {string} y {string}")
    public void actor_ingresa_las_credenciales(Actor actor, String usr, String passwd) {
        User objUser = new User(usr, passwd);
        actor.attemptsTo(WaitLoginPageLoaded.loading());
        actor.attemptsTo(LoginUser.login(objUser));
    }

    @Then("{actor} verifica que haya cargado exitosamente el formulario de login")
    public void actor_verifica_que_haya_cargado_exitosamente_el_formulario_de_login(Actor actor) {
        actor.attemptsTo(WaitLoginPageLoaded.loading());
        actor.should(seeThat(ElementIsVisible.isVisible(LoginPage.FORM_LOGIN)));
    }

    @Then("{actor} verifica que haya ingresado exitosamente")
    public void actor_verifica_que_haya_ingresado_exitosamente(Actor actor) {
        actor.attemptsTo(WaitDashboardPageLoaded.loading());
        actor.should(seeThat(ElementIsVisible.isVisible(DashboardPage.DASHBOARD_HEADER)));
    }

    @Then("{actor} verifica que no haya ingresado exitosamente")
    public void actor_verifica_que_no_haya_ingresado_exitosamente(Actor actor) {
        actor.should(seeThat(ElementIsVisible.isVisible(LoginPage.FORM_LOGIN)));
    }
}
