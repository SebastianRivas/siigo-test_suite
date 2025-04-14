package com.siigo.app.tasks.thirdparty;

import java.util.*;
import com.siigo.app.questions.*;
import net.serenitybdd.screenplay.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.type.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ValidateAlerts implements Task {
    private final String jsonAlerts;

    public ValidateAlerts(String jsonAlerts) {
        this.jsonAlerts = jsonAlerts;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Map<String, String>> json = null;

        try {
            json = mapper.readValue(jsonAlerts, new TypeReference<Map<String, Map<String, String>>>() {});
        } catch (Exception e) {
            System.out.println(e);
        }

        for (Map.Entry<String, Map<String, String>> value : json.entrySet()) {
            actor.should(seeThat(ShadowIsVisible.from(value.getValue().get("jsSelector"))));
            actor.should(seeThat(ShadowHasText.from(value.getValue().get("jsSelector"), value.getValue().get("text"))));
        }
    }

    public static ValidateAlerts validate(String jsonAlerts) {
        return Tasks.instrumented(ValidateAlerts.class, jsonAlerts);
    }
    
}
