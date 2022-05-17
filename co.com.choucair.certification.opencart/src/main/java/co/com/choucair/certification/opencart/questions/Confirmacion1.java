package co.com.choucair.certification.opencart.questions;

import co.com.choucair.certification.opencart.userinterfaces.ElementosOpenCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Confirmacion1 implements Question {

    public static Confirmacion1 login() {
        return new Confirmacion1();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ElementosOpenCart.ANSWER_HOME).viewedBy(actor).asString();
    }
}
