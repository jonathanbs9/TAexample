package pages;


public class LoginPage extends BasePage {
    private String loginButton = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[2]/form[1]/button[1]";
    private String inputEmail = "//input[@id='email']";
    private String inputPassword = "//input[@id='password']";
    private String loginMessage = "//*[@id='notistack-snackbar']";
    //private String emailMessage = "//*[@id='email-helper-text']";
    //private String passwordMessage = "//*[@id='password-helper-text']";

    public LoginPage() {
        super(driver);
    }
    
    public void navigateToLogin(){
        navigateTo("https://intranet-frontend-liart.vercel.app/");
    }
    
    public void inputIncorrectEmailAndPassword(){
        write(inputEmail, "invalid@email.com");
        write(inputPassword, "invalidPassword");
    }

    public void inputCorrectEmailAndPassword(){
        write(inputEmail, "user@avalith.net");  
        write(inputPassword, "secret");
    }

    public void inputCorrectPassword(){
        write(inputPassword, "9999");
    }

    public void clickLoginButton(){
        clickElement(loginButton);
    }

    public String getResult(){
        return  textFromElement(loginMessage);    
    }
    
    
}
