package co.com.choucair.certification.opencart.questions;

import co.com.choucair.certification.opencart.userinterfaces.ElementosAgregar;
import co.com.choucair.certification.opencart.userinterfaces.ElementosOpenCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ConfirmarReg implements Question {

    public static ConfirmarReg registro() {
        return  new ConfirmarReg();

    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ElementosAgregar.CONFIRM_ADD).viewedBy(actor).asString();
    }
}
