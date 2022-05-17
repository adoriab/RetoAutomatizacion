package co.com.choucair.certification.opencart.tasks;

import co.com.choucair.certification.opencart.model.TablaExample;
import co.com.choucair.certification.opencart.userinterfaces.ElementosOpenCart;
import co.com.choucair.certification.opencart.util.MetodosFuncionales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.WebElement;

public class Login implements Task {

    MetodosFuncionales metodosFuncionales;
    private TablaExample tablaExample;

    public Login(TablaExample tablaExample) {
        this.tablaExample = tablaExample;
    }

    public static Login webPag(TablaExample tablaExample) {
        return Tasks.instrumented(Login.class,tablaExample);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //metodosFuncionales.borrarCampo(ElementosOpenCart.BORRAR_USER);
        actor.attemptsTo(Enter.theValue(tablaExample.getUsuario()).into(ElementosOpenCart.INPUT_USER));
        //metodosFuncionales.borrarCampo(ElementosOpenCart.BORRAR_PASS);
        actor.attemptsTo(Enter.theValue(tablaExample.getContrasena()).into(ElementosOpenCart.INPUT_PASSWORD),
                Click.on(ElementosOpenCart.ENTER_BUTTON));
    }
}
