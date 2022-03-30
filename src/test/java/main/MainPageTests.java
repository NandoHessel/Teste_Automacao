package main;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MainPageTests extends BaseTests {

    @Test
    public void testRealizarAtividades() {
        //Acessar e validar se está na página correta
        assertThat(homePage.validarTexto(), is("BORA"));
        //clicar na aba iniciante
        homePage.clicarAbaIniciante();

        /*
        Começar o teste 1
        */
        iniciantePage.realizarTeste1();
        //prencher campo de texto
        teste1.preencherTexto("Olá, mundo");
        //clicar em enviar msg
        teste1.enviarMensagem();
        //validar alerta de sucesso
        assertThat(teste1.validarAlertadeSucesso(), is("Mensagem enviada com Sucesso."));
        //enviar teste
        teste1.validarTeste();

        /*
        Começar o teste 2
        */
        iniciantePage.realizarTeste2();
        //preencher informações
        String email = "iniciante@boratestarqa.com.br";
        String senha = "Teste@02";

        teste2.preencherEmail(email);
        teste2.preencherSenha(senha);
        //clicar em entrar
        teste2.clicarEmEntrar();
        //validar alerta de sucesso
        assertThat(teste2.alertaDeSucesso(), is("Login Realizado."));
        //enviar teste
        teste1.validarTeste();

        /*
        Começar o teste 3
        */
        iniciantePage.realizarTeste3();
        //selecionar itens
        teste3.selecionarItens();
        //clicar em comprar
        teste3.clicarEmComprar();
        //validar msg de sucesso
        assertThat(teste3.alertaDeSucesso(), is("Compra realizada com Sucesso."));
        //enviar teste
        teste1.validarTeste();

        /*
        Começar o teste 4
        */
        iniciantePage.realizarTeste4();
        teste4.clicarEmFerramenta();
        //selenium = 0
        //Cypress = 1
        //PlayWright = 2
        //Robot = 3
        teste4.selecionarFerramenta(0);
        //validar msg de sucesso
        assertThat(teste4.validarSucesso(), is("FERRAMENTA SELECIONADA!"));
        //enviar teste
        teste1.validarTeste();

        /*
        Começar o teste 5
        */
        iniciantePage.realizarTeste5();
        //gerar número
        teste5.gerarNumero();
        //validar msg de sucesso
        assertThat(teste5.validarAlerta(), is("NUMERO PAR!"));
        //enviar teste
        teste1.validarTeste();
    }
}
