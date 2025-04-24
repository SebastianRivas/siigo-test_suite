package com.siigo.app.pageobjects;

import net.serenitybdd.core.pages.*;
import net.serenitybdd.annotations.*;
import net.serenitybdd.screenplay.targets.*;

@DefaultUrl("https://qastaging.siigo.com/#/dashboard/1055")
public class DashboardPage extends PageObject {
    // Target
    public static Target DASHBOARD_HEADER = Target.the("Header Dashboard").locatedBy("//siigo-header-molecule");
}