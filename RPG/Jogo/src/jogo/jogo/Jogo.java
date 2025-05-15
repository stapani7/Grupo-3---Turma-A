package jogo;
import java.util.Scanner;
/**
 *
 * Arthur Vieira - Guilherme Sanches - Joao Paulo Serafim - Mateus Stapani - Patrick Assis Vieira
 */
public class Jogo {

    public static void coletarDadosJogador() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite seu curso: ");
        String curso = input.nextLine();
        System.out.print("Digite sua turma: ");
        String turma = input.nextLine();
        System.out.println("\nBem-vindo, " + nome + " do curso " + curso + ", turma " + turma + "!\n");
    }

    public static void desafio1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao seu primeiro desafio se você está aqui\n" +
                " tem o potencial de mudar o mundo problemático em que vivemows\n" +
                " seu primeiro desafio é numerar a ordem desses acontecimentos \n" +
                " vamos ver se você sabe algo de algoritmos.");
        int i = 0;
        while(i == 0){
            System.out.println("1. Sair do banco\n" +
                    "2.Aguardar a vez de ser atendido\n" +
                    "3.Digitar a senha\n" +
                    "4.Entrar na fila do caixa\n" +
                    "5.Conferir o valor em dinheiro\n" +
                    "6.Entrar no banco\n" +
                    "7.Informar o valor a ser retirado\n" +
                    "8.Pegar o comprovante, o cartão e o dinheiro\n" +
                    "9.Entregar o cartão ao funcionário que atende no caixa\n");
            System.out.println("Coloque todos os número em ordem, de maneira seguida sem espaço ou simbolos, somente números(Exemplo:4231): ");
            int respostad1 = input.nextInt();
            if (respostad1 == 642973851){
                System.out.println("Parabéns você acertou");
                i++;
            }else{
                System.out.println("Tente novamente");
            }
        }
        System.out.println("Agora que você já sabe como funciona o jogo, vamos para o próximo desafio");
    }

    public static void desafio2() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nDesafio 2: Qual será a saída desse algoritmo?");
        System.out.println("int x = 5;\nint y = 3;\nif(x > y) {\n    System.out.println(x + y);\n} else {\n    System.out.println(x - y);\n}");
        System.out.print("Digite a resposta correta: ");
        int resposta = input.nextInt();
        if (resposta == 8) {
            System.out.println("Correto! Vamos para o próximo desafio.");
        } else {
            System.out.println("Errado! A resposta correta era 8. Vamos continuar.");
        }
    }

    public static void desafio3() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nDesafio 3: Quantas vezes o texto será impresso?");
        System.out.println("for(int i = 0; i < 4; i++) {\n    System.out.println(\"Algoritmo\");\n}");
        System.out.print("Digite o número de vezes: ");
        int resposta = input.nextInt();
        if (resposta == 4) {
            System.out.println("Muito bem! Próximo desafio.");
        } else {
            System.out.println("Resposta incorreta! O correto era 4.");
        }
    }

    public static void main(String[] args) {
        coletarDadosJogador();
        desafio1();
        desafio2();
        desafio3();
    }
}