package co.com.choucair.certification.opencart.tasks;

import co.com.choucair.certification.opencart.model.TablaExample;
import co.com.choucair.certification.opencart.userinterfaces.ElementosInternos;
import co.com.choucair.certification.opencart.util.MetodosFuncionales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarInformacion implements Task {

    private TablaExample tablaExample;
    private MetodosFuncionales metodosFuncionales;

    public BuscarInformacion(TablaExample tablaExample) {
        this.tablaExample = tablaExample;
    }

    public static BuscarInformacion cliente(TablaExample tablaExample) {
        return Tasks.instrumented(BuscarInformacion.class, tablaExample);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(tablaExample.getCustomername()).into(ElementosInternos.NOMBRE_CLIENTE),
                Click.on(ElementosInternos.BTN_FILTRAR_CLIENTE));
    }
}
