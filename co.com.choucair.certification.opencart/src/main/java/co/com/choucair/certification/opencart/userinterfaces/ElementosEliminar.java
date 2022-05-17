package co.com.choucair.certification.opencart.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosEliminar extends PageObject {
    public static final Target BTN_SELEC_CUSTOMER = Target.the("Btn Seleccionar Cliente")
            .located(By.xpath("//input[@name='selected[]']"));
    public static final Target BTN_ELIMINAR = Target.the("Btn Eliminar Cliente")
            .located(By.xpath("//button[@data-original-title='Delete']"));
}
