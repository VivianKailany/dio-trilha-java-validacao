import java.util.Locale;
import java.util.Scanner;

/**
* <h1>Contador</h1>
* A classe Contador é responsável por realizar a contagem de números entre dois parâmetros fornecidos pelo usuário e imprimir.
* 
* @author  Vivian Kailany
* @since   10/05/2024
*/

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close();
    }

    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            // Realizar o for para imprimir os números com base na variável contagem
            for (int indice = 1; indice <= contagem; indice++) {
                System.out.println(indice);
            }
        }
    }
}
