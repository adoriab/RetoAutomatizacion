package co.com.choucair.certification.opencart.tasks;

import co.com.choucair.certification.opencart.userinterfaces.OpenCart;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPag implements Task {

    private OpenCart openCart;

    public static AbrirPag AppWeb() {
        return Tasks.instrumented(AbrirPag.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(openCart));
    }
}
