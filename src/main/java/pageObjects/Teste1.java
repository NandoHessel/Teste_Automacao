package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Teste1 {

    private WebDriver driver;
    private By campoTeste = By.cssSelector("input[type=\"text\"]");
    private By enviarMsg = By.cssSelector("button[id=\"enviarMsg\"]");
    private By alerta = By.id("statusTeste");
    private By validar = By.cssSelector("button[style=\"display: block;\"]");


    public Teste1 (WebDriver driver) {
        this.driver = driver;
    }

    public void preencherTexto(String texto) {
        FluentWait wait = new FluentWait(driver).
                withTimeout(Duration.ofSeconds(3)).
                pollingEvery(Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(campoTeste));
        driver.findElement(campoTeste).sendKeys(texto);
    }

    public void enviarMensagem() {
        driver.findElement(enviarMsg).click();
    }

    public String validarAlertadeSucesso() {
        return driver.findElement(alerta).getText();
    }
    public IniciantePage validarTeste() {
        driver.findElement(validar).click();
        return new IniciantePage(driver);
    }
}
