package co.com.choucair.certification.opencart.tasks;

import co.com.choucair.certification.opencart.userinterfaces.ElementosAgregar;
import co.com.choucair.certification.opencart.userinterfaces.ElementosEliminar;
import co.com.choucair.certification.opencart.util.MetodosFuncionales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Eliminar implements Task {

    private MetodosFuncionales metodosFuncionales;

    public static Eliminar cliente() {
        return Tasks.instrumented(Eliminar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ElementosEliminar.BTN_SELEC_CUSTOMER),
                Click.on(ElementosEliminar.BTN_ELIMINAR));
        metodosFuncionales.aceptarPopUp();
        actor.attemptsTo(Click.on(ElementosEliminar.BTN_SELEC_CUSTOMER),
                Click.on(ElementosEliminar.BTN_ELIMINAR));

    }
}
