package co.com.choucair.certification.opencart.util;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class MetodosFuncionales extends PageObject {
    WebDriver driver;
    Wait wait;

    public By borrarCampo(By elemento){
        getDriver().findElement(elemento).clear();
        return borrarCampo(elemento);
    }

    public static Target ELEMENTO_MENU(String valorMenu){
        String parteA = "(//a[contains(text(),'";
        String parteB = "')])[1]";
        String xpathMenu = parteA + valorMenu + parteB;
        return Target.the("Menu Principal").located(By.xpath(xpathMenu));
    }

    public static Target ELEMENTO_SUBMENU(String valorSubMenu){
        String parteA = "(//a[contains(text(),'";
        String parteB = "')])[2]";
        String xpathMenu = parteA + valorSubMenu + parteB;
        return Target.the("Sub Menu").located(By.xpath(xpathMenu));
    }

    public static Target IP_CLIENTE(String valorSubMenu){
        String parteA = "//td[contains(text(),'";
        String parteB = "')]";
        String xpathMenu = parteA + valorSubMenu + parteB;
        return Target.the("Sub Menu").located(By.xpath(xpathMenu));
    }

   public void aceptarPopUp(){
        driver.findElement(By.linkText("See an example alert")).click();
        Alert alert = (Alert) wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }
}
