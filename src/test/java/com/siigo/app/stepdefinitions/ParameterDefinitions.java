package com.siigo.app.stepdefinitions;

import io.cucumber.java.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actors.*;

public class ParameterDefinitions {

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
}
