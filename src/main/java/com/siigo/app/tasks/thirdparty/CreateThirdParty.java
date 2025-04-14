package com.siigo.app.tasks.thirdparty;

import java.util.*;
import com.siigo.app.pageobjects.*;
import com.siigo.app.interactions.*;
import net.serenitybdd.screenplay.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.type.*;
import net.serenitybdd.screenplay.actions.*;

public class CreateThirdParty implements Task {
    private final String jsonThirdParty;

    public CreateThirdParty(String jsonThirdParty) {
        this.jsonThirdParty = jsonThirdParty;
    }

    public void clickSelectTipoPersona(Actor actor, String tipoPersona) {
        actor.attemptsTo(
            ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(1).shadowRoot.querySelector(\"div > div > div\");")
        );
        
        actor.attemptsTo(
            SleepThread.sleep(2)
        );
        
        switch (tipoPersona) {
            case "persona":
                actor.attemptsTo(
                    ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(1).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(0);")
                );
                break;

            case "empresa":
                actor.attemptsTo(
                    ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(1).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(1);")
                );
                break;

            default:
                break;
        }
    }

    public void clickSelectTipoIdentificacion(Actor actor, String tipoIdentificacion) {
        actor.attemptsTo(ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelector(\"div > div > div\");"));
        actor.attemptsTo(SleepThread.sleep(2));
        switch (tipoIdentificacion) {
            case "registro_civil":
                actor.attemptsTo(ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(0);"));
                break;

            case "tarjeta_identidad":
                actor.attemptsTo(ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(1);"));
                break;
        
            case "cedula_ciudadania":
                actor.attemptsTo(ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(2);"));
                break;
        
            case "tarjeta_extranjeria":
                actor.attemptsTo(ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(3);"));
                break;
        
            case "cedula_extranjeria":
                actor.attemptsTo(ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(4);"));
                break;

            case "nit":
                actor.attemptsTo(ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(5);"));
                break;

            case "pasaporte":
                actor.attemptsTo(ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(6);"));
                break;
        
            case "die":
                actor.attemptsTo(ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(7);"));
                break;
        
            case "nuip":
                actor.attemptsTo(ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(8);"));
                break;
        
            case "pep":
                actor.attemptsTo(ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(9);"));
                break;

            case "sne_dian":
                actor.attemptsTo(ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(10);"));
                break;

            case "nit_exterior":
                actor.attemptsTo(ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(11);"));
                break;
        
            case "salvoconducto":
                actor.attemptsTo(ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(12);"));
                break;
        
            case "ppt":
                actor.attemptsTo(ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(13);"));
                break;
        
            case "rut_pn":
                actor.attemptsTo(ShadowClick.using("return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(14);"));
                break;
        
            default:
                break;
        }
    }

    public void sendKeysInputIdentificacion(Actor actor, String id) {
        actor.attemptsTo(ShadowSendKeys.using("return document.querySelector(\"siigo-identification-input-web\").shadowRoot.querySelector(\"div > div[id='identification'] > input[class='mdc-text-field__input input-identification']\");", id));
    }

    public void sendKeysInputDigitoVerificacion(Actor actor, String dv) {
        actor.attemptsTo(ShadowSendKeys.using("return document.querySelector(\"siigo-identification-input-web\").shadowRoot.querySelector(\"div > div[id='check-digit'] > input[id='input-check-digit']\");", dv));
    }

    public void sendKeysInputCodigoSucursal(Actor actor, String codigoSucursal) {
        actor.attemptsTo(ShadowSendKeys.using("return document.querySelectorAll(\"siigo-textfield-web\").item(0).shadowRoot.querySelector(\"div > div > input\");", codigoSucursal));
    }

    public void sendKeysInputNombres(Actor actor, String nombres) {
        actor.attemptsTo(ShadowSendKeys.using("return document.querySelectorAll(\"siigo-textfield-web\").item(1).shadowRoot.querySelector(\"div > div > input\");", nombres));
    }

    public void sendKeysInputApellidos(Actor actor, String apellidos) {
        actor.attemptsTo(ShadowSendKeys.using("return document.querySelectorAll(\"siigo-textfield-web\").item(2).shadowRoot.querySelector(\"div > div > input\");", apellidos));
    }

    public void sendKeysInputNombreComercial(Actor actor, String nombreComercial) {
        actor.attemptsTo(ShadowSendKeys.using("return document.querySelectorAll(\"siigo-textfield-web\").item(4).shadowRoot.querySelector(\"div > div > input\");", nombreComercial));
    }

    public void sendKeysInputRazonSocial(Actor actor, String razonSocial) {
        actor.attemptsTo(ShadowSendKeys.using("return document.querySelectorAll(\"siigo-textfield-web\").item(3).shadowRoot.querySelector(\"div > div > input\");", razonSocial));
    }

    public void sendKeysInputCiudad(Actor actor, String ciudad) {
        actor.attemptsTo(ShadowClick.using("return document.querySelectorAll(\"siigo-autocomplete-web\").item(0).shadowRoot.querySelector(\"div[id='siigo-autocomplete-web city'] > div > div > div > div > div > div > label\");"));
        actor.attemptsTo(SleepThread.sleep(2));
        actor.attemptsTo(ShadowSendKeys.using("return document.querySelectorAll(\"siigo-autocomplete-web\").item(0).shadowRoot.querySelector(\"div[id='siigo-autocomplete-web city'] > div > div > div > div > div > div > label > input\");", ciudad));
        actor.attemptsTo(SleepThread.sleep(2));
        actor.attemptsTo(ShadowClick.using("return document.querySelectorAll(\"siigo-autocomplete-web\").item(0).shadowRoot.querySelector(\"div[id='siigo-autocomplete-web city'] > div > div > div > div > div > div[class='suggestions opened'] > table > tbody\").querySelectorAll(\"tr\").item(0);"));
    }

    public void sendKeysInputDireccion(Actor actor, String direccio) {
        actor.attemptsTo(ShadowSendKeys.using("return document.querySelectorAll(\"siigo-textfield-web\").item(5).shadowRoot.querySelector(\"div > div > input\");", direccio));
    }

    public void sendKeysInputIndicativo(Actor actor, String indicativo) {
        actor.attemptsTo(ShadowSendKeys.using("return document.querySelector(\"siigo-phone-web\").shadowRoot.querySelectorAll(\"div > div > div > div > div > div\").item(0).querySelector('label > input');", indicativo));
    }

    public void sendKeysInputNumeroTelefono(Actor actor, String telefono) {
        actor.attemptsTo(ShadowSendKeys.using("return document.querySelector(\"siigo-phone-web\").shadowRoot.querySelectorAll(\"div > div > div > div > div > div\").item(1).querySelector('div > input');", telefono));
    }

    public void sendKeysInputExtension(Actor actor, String extension) {
        actor.attemptsTo(ShadowSendKeys.using("return document.querySelector(\"siigo-phone-web\").shadowRoot.querySelectorAll(\"div > div > div > div > div > div\").item(4).querySelector('label > input');", extension));
    }

    public void dispatcherFunction(Actor actor, String key, String value) {
        switch (key) {
            case "tipo_persona":
                clickSelectTipoPersona(actor, value);
                break;

            case "tipo_identificacion":
                clickSelectTipoIdentificacion(actor, value);
                break;

            case "numero_identificacion":
                sendKeysInputIdentificacion(actor, value);
                break;

            case "digito_verificacion":
                sendKeysInputDigitoVerificacion(actor, value);
                break;

            case "codigo_sucursal":
                sendKeysInputCodigoSucursal(actor, value);
                break;

            case "nombres":
                sendKeysInputNombres(actor, value);
                break;

            case "apellidos":
                sendKeysInputApellidos(actor, value);
                break;

            case "razon_social":
                sendKeysInputRazonSocial(actor, value);
                break;

            case "nombre_comercial":
                sendKeysInputNombreComercial(actor, value);
                break;

            case "ciudad":
                sendKeysInputCiudad(actor, value);
                break;

            case "direccion":
                sendKeysInputDireccion(actor, value);
                break;

            case "indicativo":
                sendKeysInputIndicativo(actor, value);
                break;

            case "telefono":
                sendKeysInputNumeroTelefono(actor, value);
                break;

            case "extension":
                sendKeysInputExtension(actor, value);
                break;

            default:
                break;
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> json = null;

        try {
            json = mapper.readValue(jsonThirdParty, new TypeReference<Map<String, String>>() {});
        } catch (Exception e) {
            System.out.println(e);
        }

        json.forEach((key, value) -> {
            if (value != null) {
                dispatcherFunction(actor, key, value);
            }
        });

        actor.attemptsTo(Click.on(ThirdPartyPage.SAVE_BUTTON));
    }

    public static CreateThirdParty create(String jsonThirdParty) {
        return Tasks.instrumented(CreateThirdParty.class, jsonThirdParty);
    }
}
