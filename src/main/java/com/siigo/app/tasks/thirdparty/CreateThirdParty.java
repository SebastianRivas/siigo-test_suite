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
        actor.attemptsTo(ShadowClick.using(ThirdPartyPage.SELECT_TIPO_PERSONA));
        actor.attemptsTo(SleepThread.sleep(2));

        switch (tipoPersona) {
            case "persona":
                actor.attemptsTo(ShadowClick.using(ThirdPartyPage.ITEM_PERSONA_SELECT_TIPO_PERSONA));
                break;

            case "empresa":
                actor.attemptsTo(ShadowClick.using(ThirdPartyPage.ITEM_EMPRESA_SELECT_TIPO_PERSONA));
                break;

            default:
                break;
        }
    }

    public void clickSelectTipoIdentificacion(Actor actor, String tipoIdentificacion) {
        actor.attemptsTo(ShadowClick.using(ThirdPartyPage.SELECT_TIPO_DOCUMENTO));
        actor.attemptsTo(SleepThread.sleep(2));

        switch (tipoIdentificacion) {
            case "registro_civil":
                actor.attemptsTo(ShadowClick.using(ThirdPartyPage.ITEM_REGISTRO_CIVIL_SELECT_TIPO_DOCUMENTO));
                break;

            case "tarjeta_identidad":
                actor.attemptsTo(ShadowClick.using(ThirdPartyPage.ITEM_TARJETA_IDENTIDAD_SELECT_TIPO_DOCUMENTO));
                break;

            case "cedula_ciudadania":
                actor.attemptsTo(ShadowClick.using(ThirdPartyPage.ITEM_CEDULA_CIUDADANIA_SELECT_TIPO_DOCUMENTO));
                break;

            case "tarjeta_extranjeria":
                actor.attemptsTo(ShadowClick.using(ThirdPartyPage.ITEM_TARJETA_EXTRANJERIA_SELECT_TIPO_DOCUMENTO));
                break;

            case "cedula_extranjeria":
                actor.attemptsTo(ShadowClick.using(ThirdPartyPage.ITEM_CEDULA_EXTRANJERIA_SELECT_TIPO_DOCUMENTO));
                break;

            case "nit":
                actor.attemptsTo(ShadowClick.using(ThirdPartyPage.ITEM_NIT_SELECT_TIPO_DOCUMENTO));
                break;

            case "pasaporte":
                actor.attemptsTo(ShadowClick.using(ThirdPartyPage.ITEM_PASAPORTE_SELECT_TIPO_DOCUMENTO));
                break;

            case "die":
                actor.attemptsTo(ShadowClick.using(ThirdPartyPage.ITEM_DIE_SELECT_TIPO_DOCUMENTO));
                break;

            case "nuip":
                actor.attemptsTo(ShadowClick.using(ThirdPartyPage.ITEM_NUIP_SELECT_TIPO_DOCUMENTO));
                break;

            case "pep":
                actor.attemptsTo(ShadowClick.using(ThirdPartyPage.ITEM_PEP_SELECT_TIPO_DOCUMENTO));
                break;

            case "sne_dian":
                actor.attemptsTo(ShadowClick.using(ThirdPartyPage.ITEM_SNE_DIAN_SELECT_TIPO_DOCUMENTO));
                break;

            case "nit_exterior":
                actor.attemptsTo(ShadowClick.using(ThirdPartyPage.ITEM_NIT_EXTERIOR_SELECT_TIPO_DOCUMENTO));
                break;

            case "salvoconducto":
                actor.attemptsTo(ShadowClick.using(ThirdPartyPage.ITEM_SALVOCONDUCTO_SELECT_TIPO_DOCUMENTO));
                break;

            case "ppt":
                actor.attemptsTo(ShadowClick.using(ThirdPartyPage.ITEM_PPT_SELECT_TIPO_DOCUMENTO));
                break;

            case "rut_pn":
                actor.attemptsTo(ShadowClick.using(ThirdPartyPage.ITEM_RUT_PN_SELECT_TIPO_DOCUMENTO));
                break;

            default:
                break;
        }
    }

    public void sendKeysInputIdentificacion(Actor actor, String id) {
        actor.attemptsTo(ShadowSendKeys.using(ThirdPartyPage.INPUT_IDENTIFICACION, id));
    }

    public void sendKeysInputDigitoVerificacion(Actor actor, String dv) {
        actor.attemptsTo(ShadowSendKeys.using(ThirdPartyPage.INPUT_DIGITO_VERIFICACION, dv));
    }

    public void sendKeysInputCodigoSucursal(Actor actor, String codigoSucursal) {
        actor.attemptsTo(ShadowSendKeys.using(ThirdPartyPage.INPUT_CODIGO_SUCURSAL, codigoSucursal));
    }

    public void sendKeysInputNombres(Actor actor, String nombres) {
        actor.attemptsTo(ShadowSendKeys.using(ThirdPartyPage.INPUT_NOMBRES, nombres));
    }

    public void sendKeysInputApellidos(Actor actor, String apellidos) {
        actor.attemptsTo(ShadowSendKeys.using(ThirdPartyPage.INPUT_APELLIDOS, apellidos));
    }

    public void sendKeysInputNombreComercial(Actor actor, String nombreComercial) {
        actor.attemptsTo(ShadowSendKeys.using(ThirdPartyPage.INPUT_NOMBRE_COMERCIAL, nombreComercial));
    }

    public void sendKeysInputRazonSocial(Actor actor, String razonSocial) {
        actor.attemptsTo(ShadowSendKeys.using(ThirdPartyPage.INPUT_RAZON_SOCIAL, razonSocial));
    }

    public void sendKeysInputCiudad(Actor actor, String ciudad) {
        actor.attemptsTo(ShadowClick.using(ThirdPartyPage.LABEL_CIUDAD));
        actor.attemptsTo(SleepThread.sleep(2));
        actor.attemptsTo(ShadowSendKeys.using(ThirdPartyPage.INPUT_CIUDAD, ciudad));
        actor.attemptsTo(SleepThread.sleep(2));
        actor.attemptsTo(ShadowClick.using(ThirdPartyPage.ITEM_CIUDAD));
    }

    public void sendKeysInputDireccion(Actor actor, String direccio) {
        actor.attemptsTo(ShadowSendKeys.using(ThirdPartyPage.INPUT_DIRECCION, direccio));
    }

    public void sendKeysInputIndicativo(Actor actor, String indicativo) {
        actor.attemptsTo(ShadowSendKeys.using(ThirdPartyPage.INPUT_INDICATIVO, indicativo));
    }

    public void sendKeysInputNumeroTelefono(Actor actor, String telefono) {
        actor.attemptsTo(ShadowSendKeys.using(ThirdPartyPage.INPUT_NUMERO_TELEFONO, telefono));
    }

    public void sendKeysInputExtension(Actor actor, String extension) {
        actor.attemptsTo(ShadowSendKeys.using(ThirdPartyPage.INPUT_EXTENSION, extension));
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
            json = mapper.readValue(jsonThirdParty, new TypeReference<Map<String, String>>() {
            });
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
