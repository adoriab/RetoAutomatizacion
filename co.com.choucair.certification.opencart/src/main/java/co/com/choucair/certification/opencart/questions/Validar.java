package co.com.choucair.certification.opencart.questions;

import co.com.choucair.certification.opencart.model.TablaExample;
import co.com.choucair.certification.opencart.userinterfaces.ElementosInternos;
import co.com.choucair.certification.opencart.util.MetodosFuncionales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validar implements Question<Boolean>{
    private TablaExample tablaExample;
    private MetodosFuncionales metodosFuncionales;

    public Validar(TablaExample tablaExample) {

        this.tablaExample = tablaExample;
    }

    public static Validar ip(TablaExample tablaExample) {

        return new Validar(tablaExample);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String verificarIp = Text.of(metodosFuncionales.IP_CLIENTE(tablaExample.getIp())).viewedBy(actor).asString();
        if (tablaExample.getIp().equals(verificarIp)) {
            resultado = true;
        }else {
            resultado = false;
        }
        return true;
    }
}
