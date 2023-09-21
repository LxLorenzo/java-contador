package live.lorenzocasa.contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo número");
        int parametroDois = terminal.nextInt();

        while (parametroUm > parametroDois) {
            System.out.println("Digite o primeiro número");
            parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo número");
            parametroDois = terminal.nextInt();
        }

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;

        for(int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
