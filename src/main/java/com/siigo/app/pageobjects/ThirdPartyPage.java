package com.siigo.app.pageobjects;

import net.serenitybdd.core.pages.*;
import net.serenitybdd.annotations.*;
import net.serenitybdd.screenplay.targets.*;

@DefaultUrl("https://qastaging.siigo.com/#/third-party/350?Customer=true")
public class ThirdPartyPage extends PageObject {
    // Target
    public static Target THIRDPARTY_FORM = Target.the("Thirdparty Form").locatedBy("//thirdparty-root");
    public static Target CANCEL_BUTTON = Target.the("Cancel Button Thirdparty Form").locatedBy("//button[@class='button red']");
    public static Target SAVE_BUTTON = Target.the("Save Button Thirdparty Form").locatedBy("//button[@class='button green filled']");
    public static Target ALERT_DIALOG = Target.the("Alert Dialog").locatedBy("//div[@class='overlay-container']//child::div[@id='toast-container']//child::div//child::div[@role='alertdialog']");

    // Javascrip Selector
    public static String SELECT_TIPO_PERSONA = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(1).shadowRoot.querySelector(\"div > div > div\");";
    public static String ITEM_PERSONA_SELECT_TIPO_PERSONA = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(1).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(0);";
    public static String ITEM_EMPRESA_SELECT_TIPO_PERSONA = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(1).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(1);";
    public static String SELECT_TIPO_DOCUMENTO = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelector(\"div > div > div\");";
    public static String ITEM_REGISTRO_CIVIL_SELECT_TIPO_DOCUMENTO = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(0);";
    public static String ITEM_TARJETA_IDENTIDAD_SELECT_TIPO_DOCUMENTO = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(1);";
    public static String ITEM_CEDULA_CIUDADANIA_SELECT_TIPO_DOCUMENTO = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(2);";
    public static String ITEM_TARJETA_EXTRANJERIA_SELECT_TIPO_DOCUMENTO = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(3);";
    public static String ITEM_CEDULA_EXTRANJERIA_SELECT_TIPO_DOCUMENTO = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(4);";
    public static String ITEM_NIT_SELECT_TIPO_DOCUMENTO = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(5);";
    public static String ITEM_PASAPORTE_SELECT_TIPO_DOCUMENTO = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(6);";
    public static String ITEM_DIE_SELECT_TIPO_DOCUMENTO = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(7);";
    public static String ITEM_NUIP_SELECT_TIPO_DOCUMENTO = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(8);";
    public static String ITEM_PEP_SELECT_TIPO_DOCUMENTO = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(9);";
    public static String ITEM_SNE_DIAN_SELECT_TIPO_DOCUMENTO = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(10);";
    public static String ITEM_NIT_EXTERIOR_SELECT_TIPO_DOCUMENTO = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(11);";
    public static String ITEM_SALVOCONDUCTO_SELECT_TIPO_DOCUMENTO = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(12);";
    public static String ITEM_PPT_SELECT_TIPO_DOCUMENTO = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(13);";
    public static String ITEM_RUT_PN_SELECT_TIPO_DOCUMENTO = "return document.querySelectorAll(\"siigo-dropdownlist-web\").item(2).shadowRoot.querySelectorAll(\"div > div > div[class='mdc-select__menu mdc-menu mdc-menu-surface mdc-menu-surface--open mdc-menu-surface--is-open-below'] > ul > li\").item(14);";
    public static String INPUT_IDENTIFICACION = "return document.querySelector(\"siigo-identification-input-web\").shadowRoot.querySelector(\"div > div[id='identification'] > input[class='mdc-text-field__input input-identification']\");";
    public static String INPUT_DIGITO_VERIFICACION = "return document.querySelector(\"siigo-identification-input-web\").shadowRoot.querySelector(\"div > div[id='check-digit'] > input[id='input-check-digit']\");";
    public static String INPUT_CODIGO_SUCURSAL = "return document.querySelectorAll(\"siigo-textfield-web\").item(0).shadowRoot.querySelector(\"div > div > input\");";
    public static String INPUT_NOMBRES = "return document.querySelectorAll(\"siigo-textfield-web\").item(1).shadowRoot.querySelector(\"div > div > input\");";
    public static String INPUT_APELLIDOS = "return document.querySelectorAll(\"siigo-textfield-web\").item(2).shadowRoot.querySelector(\"div > div > input\");";
    public static String INPUT_NOMBRE_COMERCIAL = "return document.querySelectorAll(\"siigo-textfield-web\").item(4).shadowRoot.querySelector(\"div > div > input\");";
    public static String LABEL_CIUDAD = "return document.querySelectorAll(\"siigo-autocomplete-web\").item(0).shadowRoot.querySelector(\"div[id='siigo-autocomplete-web city'] > div > div > div > div > div > div > label\");";
    public static String INPUT_CIUDAD = "return document.querySelectorAll(\"siigo-autocomplete-web\").item(0).shadowRoot.querySelector(\"div[id='siigo-autocomplete-web city'] > div > div > div > div > div > div > label > input\");";
    public static String ITEM_CIUDAD = "return document.querySelectorAll(\"siigo-autocomplete-web\").item(0).shadowRoot.querySelector(\"div[id='siigo-autocomplete-web city'] > div > div > div > div > div > div[class='suggestions opened'] > table > tbody\").querySelectorAll(\"tr\").item(0);";
    public static String INPUT_RAZON_SOCIAL = "return document.querySelectorAll(\"siigo-textfield-web\").item(3).shadowRoot.querySelector(\"div > div > input\");";
    public static String INPUT_DIRECCION = "return document.querySelectorAll(\"siigo-textfield-web\").item(5).shadowRoot.querySelector(\"div > div > input\");";
    public static String INPUT_INDICATIVO = "return document.querySelector(\"siigo-phone-web\").shadowRoot.querySelectorAll(\"div > div > div > div > div > div\").item(0).querySelector('label > input');";
    public static String INPUT_NUMERO_TELEFONO = "return document.querySelector(\"siigo-phone-web\").shadowRoot.querySelectorAll(\"div > div > div > div > div > div\").item(1).querySelector('div > input');";
    public static String INPUT_EXTENSION = "return document.querySelector(\"siigo-phone-web\").shadowRoot.querySelectorAll(\"div > div > div > div > div > div\").item(4).querySelector('label > input');";
}
