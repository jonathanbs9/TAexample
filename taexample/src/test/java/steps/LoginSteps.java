package steps;



import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginSteps {
    LoginPage login = new LoginPage();

    @Given("^Navego a la pantalla principal$")
    public void navigateToLogin(){
        login.navigateToLogin();
    }

    @When("^Ingreso email y password invalidos$")
    public void enterEmailAndPassword(){
        login.inputIncorrectEmailAndPassword();
    }

    @When("^Ingreso email y password correctos$")
    public void enterCorrectEmailAndPassword(){
        login.inputCorrectEmailAndPassword();
    }

    @When("^Ingreso contraseña$")
    public void enterPassword(){
        login.inputCorrectPassword();
    }


    @And("^Hago click en Login$")
    public void clickOnLogin(){
        login.clickLoginButton();
    }

    @Then("^Obtengo acceso invalido$")
    public void validateResult(){
        Assert.assertEquals("login error", login.getResult());
    }

    @Then("Obtengo acceso")
    public void validResult(){
        Assert.assertEquals("login success", login.getResult());
    }
}
