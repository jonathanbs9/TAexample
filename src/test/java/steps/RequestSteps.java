package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RequestPage;

public class RequestSteps {
    RequestPage requestPage = new RequestPage();
    
    @Given("^Un usuario que accede a la pagina principal$")
    public void un_usuario_que_accede_a_la_pagina_principal() {
        requestPage.succesfullLoginToMain();
    }

    @When("^Hago click en mis solicitudes$")
    public void hago_click_en_mis_solicitudes() {
        requestPage.clickOnMisSolicitudes();
    }

    @When("^Hago click en Crear Solicitud$")
    public void hago_click_en_Crear_Solicitud() {
        requestPage.clickOnCrearSolicitud();
    }


    @Then("^Tengo una lista de mis solicitudes$")
    public void tengo_una_lista_de_mis_solicitudes() {
        String expected = "se muestra una lista de todas las solicitudes que has enviado o editado.";
        //Assert.assertEquals(expected, requestPage.getResult());
        Assert.assertTrue(requestPage.getResult().contains(expected));
    }

    @And("^Hago click en una solicitud determinada$")
    public void clickEnUnaSolicitudDeterminada(){
        requestPage.clickOnDeterminadaSolicitud();
    }

    @Then("^Puedo ver el detalle de una solicitud$")
    public void veoDetalleDeUnaSolicitud(){
        Assert.assertNotNull(requestPage.seeDetailRequest());
    }

    @And("^Completo los campos correctamente e ingreso una fecha de finalizacion menor a la fecha de inicio$")
    public void completoCamposConFechaDeFinMenorALaFechaDeInicio(){
        requestPage.completoCamposConFechaFinMenor();
    }

    @And("^Hago click en Enviar Solicitud$")
    public void clickEnEnviarSolicitud(){
        requestPage.clickEnEnviarSolicitud();
    }

    @Then("^Espero un mensaje de error$")
    public void espero_un_mensaje() {
        String string = "Error al crear la solicitud";
        Assert.assertEquals(string, requestPage.obtengoMensajeDeError());
    }

    
}
