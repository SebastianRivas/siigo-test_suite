package com.siigo.app.interactions;

import net.serenitybdd.screenplay.*;

public class SleepThread implements Interaction {
    private final int segundos;

    public SleepThread(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(segundos * 1000L);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static SleepThread sleep(int segundos) {
        return Tasks.instrumented(SleepThread.class, segundos);
    }
}
