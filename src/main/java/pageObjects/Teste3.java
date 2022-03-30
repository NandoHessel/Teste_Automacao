package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Teste3 {

    private WebDriver driver;

    private By itens =By.id("check[]");
    private By btnComprar = By.cssSelector("button[class=\"button\"]");
    private By alerta = By.id("statusTeste");

    public Teste3(WebDriver driver) {
        this.driver = driver;
    }

    public void selecionarItens() {
        FluentWait wait = new FluentWait(driver).
                withTimeout(Duration.ofSeconds(3)).
                pollingEvery(Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(itens));

        for (int cont = 0; cont <= 3; cont++) {
            driver.findElements(itens).get(cont).click();
        }
    }

    public void clicarEmComprar() {
        driver.findElement(btnComprar).click();
    }

    public String alertaDeSucesso() {
        return driver.findElement(alerta).getText();
    }
}
