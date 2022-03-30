package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class IniciantePage {

    private WebDriver driver;

    private By começar = By.cssSelector("button[id=\"comecar\"]");

    public IniciantePage(WebDriver driver) {
        this.driver = driver;
    }

    private void esperarPeloBotão() {
        /*após clicar na aba iniciante, ocorre um delay para acessar o botão iniciar.
        devendo-se utilizar o comando abaixo*/
        FluentWait wait = new FluentWait(driver).
                withTimeout(Duration.ofSeconds(3)).
                pollingEvery(Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(começar));
        driver.findElement(começar).click();
    }
    /*
    Cada função inicializa um novo teste quando o anterior é finalizado e retorna para a aba iniciante
     */
    public Teste1 realizarTeste1() {
        esperarPeloBotão();
        return new Teste1(driver);
    }

    public Teste2 realizarTeste2() {
        esperarPeloBotão();
        return new Teste2(driver);
    }

    public Teste3 realizarTeste3() {
        esperarPeloBotão();
        return new Teste3(driver);
    }

    public Teste4 realizarTeste4() {
        esperarPeloBotão();
        return new Teste4(driver);
    }

    public Teste5 realizarTeste5() {
        esperarPeloBotão();
        return new Teste5(driver);
    }
}
