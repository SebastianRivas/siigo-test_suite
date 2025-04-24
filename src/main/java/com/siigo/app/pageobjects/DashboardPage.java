package com.siigo.app.pageobjects;

import net.serenitybdd.core.pages.*;
import net.serenitybdd.annotations.*;
import net.serenitybdd.screenplay.targets.*;

@DefaultUrl("https://qastaging.siigo.com/#/dashboard/1055")
public class DashboardPage extends PageObject {
    // Target
    public static Target DASHBOARD_HEADER = Target.the("Header Dashboard").locatedBy("//siigo-header-molecule");

    // Javascrip Selector
    public static String BUTTON_CREAR = "return document.querySelector(\"siigo-header-molecule[class='data-siigo-five9 hydrated']\").shadowRoot.querySelector(\"siigo-button-atom[data-id='header-create-button']\").shadowRoot.querySelector(\"button\");";
    public static String BUTON_CLIENTES = "return document.querySelector(\"siigo-header-molecule[class='data-siigo-five9 hydrated']\").shadowRoot.querySelector(\"siigo-header-create-button-dropdown[data-id='header-create-button-dropdown']\").querySelector(\"div[class='content-create items-4 items-hidden']\").querySelector(\"div[class='content-create-items content-create-items-title-hidden content-create-items-open']\").querySelector(\"div[class='list list-customer-two']\").querySelector(\"li > div > a[data-value='Clientes']\");";
}