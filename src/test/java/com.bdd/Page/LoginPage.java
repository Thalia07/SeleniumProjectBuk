package com.bdd.Page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class LoginPage extends PageObject {
    private BasePage basePage;
    private final WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
    private By btnLogin = By.id("login2");
    private By txtUsername = By.id("loginusername");
    private By txtPassword = By.id("loginpassword");
    private By btnIniciarSesion = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    private By lblNaneUser = By.id("nameofuser");

    public void ingresarCredenciales() throws Exception {
        basePage.click(btnLogin);
        basePage.sendKey(txtUsername,"testQABukAutomationNew");
        basePage.sendKey(txtPassword,"testQABukAutomationNew");
        Thread.sleep(1000);
        basePage.click(btnIniciarSesion);

    }
    public void validarUsuario() throws Exception {
        basePage.equals(lblNaneUser,"Welcome testQABukAutomationNew");
        System.out.println("Validación de usuario exitosa");
        Thread.sleep(1000);
    }
}