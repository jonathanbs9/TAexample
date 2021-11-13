package pages;

import org.apache.commons.logging.Log;

public class RequestPage extends BasePage {
    // Login
    private String inputEmail = "//input[@id='email']";
    private String inputPassword = "//input[@id='password']";
    private String loginButton = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/button[1]";

    // Main 
    private String loginAlert = "//span[contains(text(),'Cerrar')]";
    private String misSolicitudesButton = "//*[@id='__next']/header/div/div/button[1]/span[1]";
    private String misSolicitudesText = "//*[@id='__next']/div/div/div[2]/div/div[1]/h2";
    private String solicitudButton = "//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/button[1]/span[1]";
    
    // Detalle solicitud
    private String inputSolicitud = "//input[@id='solicitud']"; 
    private String inputCorreo = "//body/div[@id='__next']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]";
    private String inputUser = "//body/div[@id='__next']/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[1]/div[1]/input[1]";
    private String inputApellido = "//body/div[@id='__next']/div[1]/div[1]/div[2]/form[1]/div[1]/div[6]/div[1]/div[1]/input[1]";
        
    public RequestPage() {
        super(driver);
        
    }

    public void succesfullLoginToMain(){
        navigateTo("https://intranet-frontend-liart.vercel.app/");
        write(inputEmail, "user@avalith.net");
        write(inputPassword, "secret");
        clickElement(loginButton);
    }

    public void clickOnMisSolicitudes(){
        clickElement(loginAlert);
        clickElement(misSolicitudesButton);
    }

    public String getResult(){
        return textFromElement(misSolicitudesText);
    }

    public void clickOnDeterminadaSolicitud(){
        clickElement(solicitudButton);
    }

    public String seeDetailRequest(){
        return textFromElement(inputSolicitud);
        
    }

    
}
