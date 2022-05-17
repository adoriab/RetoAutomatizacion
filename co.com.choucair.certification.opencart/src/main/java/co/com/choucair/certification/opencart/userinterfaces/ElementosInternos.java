package co.com.choucair.certification.opencart.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosInternos extends PageObject {

    public static final Target NOMBRE_CLIENTE = Target.the("Cliente").located(By.id("input-name"));
    public static final Target BTN_FILTRAR_CLIENTE = Target.the("Btn filtrar cliente").located(By.id("button-filter"));

}
