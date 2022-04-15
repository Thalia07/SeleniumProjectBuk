package com.bdd.Page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends PageObject {
    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public void click(By element) throws Exception {
        try {
            driver.findElement(element).click();
        } catch (Exception e) {
            throw new Exception("No se pudo dar click sobre el elemento: " + element);
        }
    }

    public void clear(By element) throws Exception {
        try {
            driver.findElement(element).clear();
        } catch (Exception e) {
            throw new Exception("No se pudo dar click sobre el elemento: " + element);
        }
    }

    public String getText(By element) throws Exception {
        try {
            return driver.findElement(element).getText();
        } catch (Exception e) {
            throw new Exception("No se puedo obtener el texto del elemento: " + element);

        }
    }

    public void sendKey(By element, String textoCaja) throws Exception {
        try {
            driver.findElement(element).sendKeys(textoCaja);
        } catch (Exception e) {
            throw new Exception("No se escribir dentro del elemento: " + element);
        }
    }

    public String getTitle() {

        return driver.getTitle();
    }

    public void waitClicleable(By element) throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 35);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            throw new Exception("No se pudo esperar el elemento " + e);
        }
    }

    public void waitPresent() throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 15);
            wait.until(ExpectedConditions.alertIsPresent());
        } catch (Exception e) {
            throw new Exception("No se pudo esperar el elemento " + e);
        }
    }

    public boolean equals(By element, String textObjeto) throws Exception {
        try {
            return driver.findElement(element).equals(textObjeto);
        } catch (Exception e) {
            throw new Exception("El Texto es diferente al Elemento: " + element);
        }
    }
}
