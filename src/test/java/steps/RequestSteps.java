package steps;

import static org.junit.Assert.assertNotNull;

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
}
