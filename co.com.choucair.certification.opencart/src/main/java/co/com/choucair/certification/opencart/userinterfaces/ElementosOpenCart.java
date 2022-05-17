package co.com.choucair.certification.opencart.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosOpenCart extends PageObject {

    public static final Target INPUT_USER= Target.the("Escriba su usuario")
            .located(By.id("input-username"));

    public static final Target INPUT_PASSWORD = Target.the("Escriba su contraseña")
            .located(By.id("input-password"));

    public static final Target ENTER_BUTTON = Target.the("Boton de confirmacion de login")
            .located(By.xpath("//button[contains(text(),'Login')]"));

    public static final Target ANSWER_HOME = Target.the("Home OpenCart")
            .located(By.xpath("//a[text()='OpenCart']"));



    public static By BORRAR_USER = By.id("input-username");
    public static By BORRAR_PASS = By.id("input-password");
}
