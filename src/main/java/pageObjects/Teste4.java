package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Teste4 {

    private WebDriver driver;

    private By selecao = By.className("dropmenu");
    private By ferramentas = By.cssSelector(".dropmenu li");
    private By alerta = By.id("statusTeste");

    public Teste4(WebDriver driver) {
        this.driver = driver;
    }

    public void clicarEmFerramenta() {
        FluentWait wait = new FluentWait(driver).
                withTimeout(Duration.ofSeconds(3)).
                pollingEvery(Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(selecao));
        driver.findElement(selecao).click();
    }
    public WebElement selecionarFerramenta(int ferramenta) {
        driver.findElements(ferramentas).get(ferramenta).click();
        return null;
    }

    public String validarSucesso() {
        return driver.findElement(alerta).getText();
    }
}
