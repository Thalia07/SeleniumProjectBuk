package com.bdd.StepsDefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import com.bdd.Steps.LoginSteps;

public class LoginStepsDefinitions {
    @Steps
    private LoginSteps loginSteps;

    @Dado("que el usuario abre la pagina web")
    public void queElUsuarioAbreLaPaginaWeb() {
        loginSteps.login();
    }

    @Cuando("ingresa sus credenciales")
    public void ingresaSusCredenciales() throws Exception {
        loginSteps.ingresarCredencialesUsuario();
    }

    @Entonces("se visualiza el dashboard y se valida el usuario")
    public void seVisualizaElDashboardYSeValidaElUsuario() throws Exception {
        loginSteps.validarCredenciales();
    }
}
