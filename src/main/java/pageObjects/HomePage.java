package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private By bora = By.cssSelector("span[style=\"color:#FFF\"]");
    private By inciante = By.className("menu_nav_secao");


    //Construtor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    /*
    Método para validar se estamos no site correto. Retorna a String desejada.
     */
    public String validarTexto() {
        return driver.findElement(bora).getText();
    }

    /*
    Método para clicar na aba iniciante e retornar para a nova pageObject
     */
    public IniciantePage clicarAbaIniciante() {
        driver.findElements(inciante).get(1).click();
        return new IniciantePage(driver);
    }


}
