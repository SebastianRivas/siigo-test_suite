package com.siigo.app.stepdefinitions;

import io.cucumber.java.en.*;
import com.siigo.app.questions.*;
import com.siigo.app.pageobjects.*;
import net.serenitybdd.screenplay.*;
import com.siigo.app.interactions.*;
import com.siigo.app.tasks.dashboard.*;
import com.siigo.app.tasks.thirdparty.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ThirdPartyStepDefinitions {
    @And("{actor} clikea el boton Crear")
    public void actor_clikea_el_boton_crear(Actor actor) {
        actor.attemptsTo(WaitDashboardPageLoaded.loading());
        actor.attemptsTo(ShadowClick.using(DashboardPage.BUTTON_CREAR));
    }

    @And("{actor} clikea la opcion Clientes")
    public void actor_clikea_la_opcion_clientes(Actor actor) {
        actor.attemptsTo(ShadowClick.using(DashboardPage.BUTON_CLIENTES));
    }

    @And("{actor} verifica que haya cargado correctamente el formulario de creacion")
    public void actor_verifica_que_haya_cargado_correctamente_el_formulario_de_creacion(Actor actor) {
        actor.attemptsTo(WaitThirdPartyPageLoaded.loading());
        actor.should(seeThat(ElementIsVisible.isVisible(ThirdPartyPage.THIRDPARTY_FORM)));
    }

    @And("{actor} diligencia el formulario de creacion con los datos {string}")
    public void actor_diligencia_el_formulario_de_creacion_con_los_datos(Actor actor, String args) {
        actor.attemptsTo(WaitThirdPartyPageLoaded.loading());
        actor.attemptsTo(CreateThirdParty.create(args));
    }

    @Then("{actor} verifica que se haya creado correctamente el tercero")
    public void actor_verifica_que_se_haya_creado_correctamente_el_tercero(Actor actor) {
        actor.attemptsTo(WaitThirdPartyCreated.loading());
        actor.should(seeThat(ElementIsVisible.isVisible(ThirdPartyPage.ALERT_DIALOG)));
        actor.should(seeThat(ElementHasText.hasText(ThirdPartyPage.ALERT_DIALOG, "Tercero guardado exitosamente")));
    }

    @Then("{actor} verifica que no se haya creado correctamente el tercero")
    public void actor_verifica_que_no_se_haya_creado_correctamente_el_tercero(Actor actor) {
        actor.attemptsTo(WaitThirdPartyCreated.loading());
        actor.should(seeThat(ElementIsVisible.isVisible(ThirdPartyPage.ALERT_DIALOG)));
        actor.should(seeThat(ElementHasText.hasText(ThirdPartyPage.ALERT_DIALOG, "La identificación del tercero que estas creando ya existe.")));
    }

    @Then("{actor} verifica que se presente la alerta de valor invalido {string}")
    public void actor_verifica_que_se_presente_la_alerta_de_valor_invalido(Actor actor, String textAlert) {
        actor.attemptsTo(WaitThirdPartyCreated.loading());
        actor.should(seeThat(ElementIsVisible.isVisible(ThirdPartyPage.ALERT_DIALOG)));
        actor.should(seeThat(ElementHasText.hasText(ThirdPartyPage.ALERT_DIALOG, textAlert)));
    }

    @Then("{actor} verifica que se presente la alerta de obligatoriedad del campo")
    public void actor_verifica_que_se_presente_la_alerta_de_obligatoriedad_del_campo(Actor actor, String fields) {
        actor.attemptsTo(ValidateAlerts.validate(fields));
    }

    @Then("{actor} verifica que se presente el campo {string}")
    public void actor_verifica_que_se_presente_el_campo(Actor actor, String field) {
        actor.should(seeThat(ShadowIsVisible.from(field)));
    }
}