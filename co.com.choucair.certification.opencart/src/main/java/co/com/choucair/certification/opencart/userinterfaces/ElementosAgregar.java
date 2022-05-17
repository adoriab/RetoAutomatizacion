package co.com.choucair.certification.opencart.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosAgregar extends PageObject {

    public static final Target BTN_AGREGAR_CUSTOMER = Target.the("Btn Agregar cliente")
            .located(By.xpath("//a[@data-original-title='Add New']"));
    public static final Target FIRSNAME_CUSTOMER = Target.the("Firsname")
            .located(By.id("input-firstname"));
    public static final Target LASTNAME_CUSTOMER = Target.the("Lastname")
            .located(By.id("input-lastname"));
    public static final Target EMAIL_CUSTOMER = Target.the("Email")
            .located(By.id("input-email"));
    public static final Target TELEPHONE_CUSTOMER = Target.the("Telephone")
            .located(By.id("input-telephone"));
    public static final Target PASSWORD_CUSTOMER = Target.the("Password")
            .located(By.id("input-password"));
    public static final Target CONFIRM_CUSTOMER = Target.the("Password")
            .located(By.id("input-confirm"));
    public static final Target BTN_GUARDAR_CUSTOMER = Target.the("Btn guardar cliente")
            .located(By.xpath("//button[@data-original-title='Save']"));
    public static final Target CONFIRM_ADD = Target.the("No se tienen permisos para agregar")
            .located(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
}
