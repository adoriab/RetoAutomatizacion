package co.com.choucair.certification.opencart.tasks;

import co.com.choucair.certification.opencart.model.TablaExample;
import co.com.choucair.certification.opencart.util.MetodosFuncionales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class BuscarM implements Task {
    private TablaExample tablaExample;
    private MetodosFuncionales metodosFuncionales;
    public BuscarM(TablaExample tablaExample) {
        this.tablaExample = tablaExample;
    }

    public static BuscarM menu(TablaExample tablaExample) {
        return Tasks.instrumented(BuscarM.class, tablaExample);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(metodosFuncionales.ELEMENTO_MENU(tablaExample.getMenu())),
                Click.on(metodosFuncionales.ELEMENTO_SUBMENU(tablaExample.getSubmenu())));
    }
}
