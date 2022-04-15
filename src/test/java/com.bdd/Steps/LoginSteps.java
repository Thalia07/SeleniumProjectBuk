package com.bdd.Steps;

import com.bdd.Page.LoginPage;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps  extends ScenarioSteps {
    private LoginPage loginPage;

    public void login(){
        System.out.println("Iniciar sesión");
        loginPage.open();
    }
    public void ingresarCredencialesUsuario() throws Exception {
       loginPage.ingresarCredenciales();
    }

    public void validarCredenciales() throws Exception {
        loginPage.validarUsuario();
    }
}
