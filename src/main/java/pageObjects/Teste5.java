package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Teste5 {

    private WebDriver driver;

    private By gerarNum = By.cssSelector("button[id=\"gerar\"]");
    private By numeroAleatorio = By.cssSelector("div#numeroAleatorio");
    private By btn_confirmar = By.cssSelector("button[id=\"confirmar\"]");
    private By alerta = By.cssSelector("div#statusTeste");

    public Teste5(WebDriver driver) {
        this.driver = driver;
    }

    public void gerarNumero() {
        FluentWait wait = new FluentWait(driver).
                withTimeout(Duration.ofSeconds(3)).
                pollingEvery(Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(gerarNum));

        /*
        Neste método foi criado um laço de repetição que repete o click no botão de gerar um número aleatório
        até que o númer gerado seja par.
        Ao final do laço, ele clica em verificar se realmente é um número par
         */
        int num = 1;
        while (num % 2 != 0) {
            driver.findElement(gerarNum).click();
            num = Integer.parseInt(driver.findElement(numeroAleatorio).getText());
        }
        driver.findElement(btn_confirmar).click();
    }

    public String validarAlerta() {
        return driver.findElement(alerta).getText();
    }
}
