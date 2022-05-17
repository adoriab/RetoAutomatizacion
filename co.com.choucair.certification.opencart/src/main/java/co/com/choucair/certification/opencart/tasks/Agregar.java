package co.com.choucair.certification.opencart.tasks;

import co.com.choucair.certification.opencart.model.TablaExample;
import co.com.choucair.certification.opencart.userinterfaces.ElementosAgregar;
import co.com.choucair.certification.opencart.userinterfaces.ElementosInternos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Agregar implements Task {

    private TablaExample tablaExample;

    public Agregar(TablaExample tablaExample) {
        this.tablaExample = tablaExample;
    }

    public static Agregar customer(TablaExample tablaExample) {
        return Tasks.instrumented(Agregar.class,tablaExample);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ElementosAgregar.BTN_AGREGAR_CUSTOMER),
                Enter.theValue(tablaExample.getFirstname()).into(ElementosAgregar.FIRSNAME_CUSTOMER),
                Enter.theValue(tablaExample.getLastname()).into(ElementosAgregar.LASTNAME_CUSTOMER),
                Enter.theValue(tablaExample.getEmail()).into(ElementosAgregar.EMAIL_CUSTOMER),
                Enter.theValue(tablaExample.getTelephone()).into(ElementosAgregar.TELEPHONE_CUSTOMER),
                Enter.theValue(tablaExample.getPassword()).into(ElementosAgregar.PASSWORD_CUSTOMER),
                Enter.theValue(tablaExample.getConfirm()).into(ElementosAgregar.CONFIRM_CUSTOMER),
                Click.on(ElementosAgregar.BTN_GUARDAR_CUSTOMER));
    }
}
