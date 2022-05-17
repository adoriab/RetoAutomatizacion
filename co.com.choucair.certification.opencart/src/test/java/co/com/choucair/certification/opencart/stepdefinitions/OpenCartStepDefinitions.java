package co.com.choucair.certification.opencart.stepdefinitions;

import co.com.choucair.certification.opencart.model.TablaExample;
import co.com.choucair.certification.opencart.questions.Confirmacion1;
import co.com.choucair.certification.opencart.questions.ConfirmarReg;
import co.com.choucair.certification.opencart.questions.Validar;
import co.com.choucair.certification.opencart.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

public class OpenCartStepDefinitions {
    @Before
    public void iniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Ana ingresa a OpenCart$")
    public void anaIngresaAOpenCart() {

        OnStage.theActorCalled("Ana").wasAbleTo(AbrirPag.AppWeb());
    }

    @And("^valida que se encuentra en el login de la app$")
    public void validaQueSeEncuentraEnElLoginDeLaApp() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Confirmacion1.login(), Matchers.equalTo("OpenCart")));
    }

    @When("^ingresa sus credenciales$")
    public void ingresaSusCredenciales(List<TablaExample> tablaExamples) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.webPag(tablaExamples.get(0)));
    }
    @And("^Navega por el Menu$")
    public void navegaPorElMenu(List<TablaExample> tablaExamples) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarM.menu(tablaExamples.get(0)));
    }

    @And("^Busca un Cliente por Customer name$")
    public void buscaUnClientePorCustomerName(List<TablaExample> tablaExamples) {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarInformacion.cliente(tablaExamples.get(0)));
    }

    @Then("^Valida la IP de conexion$")
    public void validaLaIPDeConexion(List<TablaExample> tablaExamples) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.ip(tablaExamples.get(0))));
    }

    @And("^Agrega un cliente$")
    public void agregaUnCliente(List<TablaExample> tablaExamples) {
        OnStage.theActorInTheSpotlight().attemptsTo(Agregar.customer(tablaExamples.get(0)));
    }

    @Then("^Valida que no se pueden realizar registros$")
    public void validaQueNoSePuedenRealizarRegistros() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ConfirmarReg.registro(), Matchers.equalTo("Warning: You do not have permission to modify customers!\n×")));
    }

    @And("^Selecciona el cliente a eliminar$")
    public void seleccionaElClienteAEliminar() {
        OnStage.theActorInTheSpotlight().attemptsTo(Eliminar.cliente());
    }

    @Then("^Valida que no se puede eliminar el cliente$")
    public void validaQueNoSePuedeEliminarElCliente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ConfirmarReg.registro(), Matchers.equalTo("Warning: You do not have permission to modify customers!\n×")));
    }
}
