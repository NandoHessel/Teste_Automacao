package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Teste2 {

    private WebDriver driver;

    private By email = By.cssSelector("input[id=\"username\"]");
    private By senha = By.cssSelector("input[id=\"password\"]");
    private By entrar = By.cssSelector("button[id=\"entrar\"]");
    private By alert = By.cssSelector("div[id=\"statusTeste\"]");
    private By validar = By.cssSelector("button[style=\"display: block;\"]");

    public Teste2(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherEmail(String texto) {
        FluentWait wait = new FluentWait(driver).
                withTimeout(Duration.ofSeconds(3)).
                pollingEvery(Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(email));
        driver.findElement(email).sendKeys(texto);
    }

    public void preencherSenha(String texto) {
        driver.findElement(senha).sendKeys(texto);
    }

    public void clicarEmEntrar() {
        driver.findElement(entrar).click();
    }

    public String alertaDeSucesso() {
        return driver.findElement(alert).getText();
    }

}
