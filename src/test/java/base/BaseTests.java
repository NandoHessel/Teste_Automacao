package base;

import data.MassaTestes;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.*;

public class BaseTests {

    public static WebDriver driver;

    protected MassaTestes dadosTest;
    protected HomePage homePage;
    protected IniciantePage iniciantePage;
    protected Teste1 teste1;
    protected Teste2 teste2;
    protected Teste3 teste3;
    protected Teste4 teste4;
    protected Teste5 teste5;

    @BeforeAll
    public static void inicializarDriver() {
        //ativa o driver do chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Web drivers\\ChromeDriver\\99\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @BeforeEach
    public void carregarPaginaInicial() {
        //abre a página onde estarão os testes
        driver.get("https://boratestarqa.com.br/");
        //instância os construtores
        homePage = new HomePage(driver);
        iniciantePage = new IniciantePage(driver);
        teste1 = new Teste1(driver);
        teste2 = new Teste2(driver);
        teste3 = new Teste3(driver);
        teste4 = new Teste4(driver);
        teste5 = new Teste5(driver);
        dadosTest = new MassaTestes();
    }

    //fecha a aba após os testes serem concluídos. está comentado para acompanhar a finalização
    /*@AfterAll
    public static void encerar() {
        //fecha a aba após os testes
        driver.quit();
    }*/

}
