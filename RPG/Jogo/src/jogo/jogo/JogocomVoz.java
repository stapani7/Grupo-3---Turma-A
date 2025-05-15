package jogo;
import java.util.Scanner;

public class JogocomVoz {

    // Método para falar texto usando PowerShell (Windows)
    public static void falarTexto(String texto) {
        try {
            String comando = "PowerShell -Command \"Add-Type –AssemblyName System.Speech; "
                    + "$speak = New-Object System.Speech.Synthesis.SpeechSynthesizer; "
                    + "$speak.Speak('" + texto.replace("'", "''") + "');\"";
            Runtime.getRuntime().exec(comando);
        } catch (Exception e) {
            System.out.println("Erro ao tentar falar: " + e.getMessage());
        }
    }

    public static void coletarDadosJogador() {
        Scanner input = new Scanner(System.in);
        falarTexto("Digite seu nome:");
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        falarTexto("Digite seu curso:");
        System.out.print("Digite seu curso: ");
        String curso = input.nextLine();
        falarTexto("Digite sua turma:");
        System.out.print("Digite sua turma: ");
        String turma = input.nextLine();
        String mensagem = "\nBem-vindo, " + nome + " do curso " + curso + ", turma " + turma + "!\n";
        falarTexto(mensagem);
        System.out.println(mensagem);
    }

    public static void desafio1(){
        Scanner input = new Scanner(System.in);
        String intro = "Bem vindo ao seu primeiro desafio. Se você está aqui, tem o potencial de mudar o mundo problemático em que vivemos. Seu primeiro desafio é numerar a ordem desses acontecimentos. Vamos ver se você sabe algo de algoritmos.";
        falarTexto(intro);
        System.out.println(intro);
        int i = 0;
        while(i == 0){
            String opcoes = "1. Sair do banco\n"
                    + "2. Aguardar a vez de ser atendido\n"
                    + "3. Digitar a senha\n"
                    + "4. Entrar na fila do caixa\n"
                    + "5. Conferir o valor em dinheiro\n"
                    + "6. Entrar no banco\n"
                    + "7. Informar o valor a ser retirado\n"
                    + "8. Pegar o comprovante, o cartão e o dinheiro\n"
                    + "9. Entregar o cartão ao funcionário que atende no caixa\n";
            falarTexto(opcoes);
            System.out.println(opcoes);
            String pergunta = "Coloque todos os números em ordem, de maneira seguida sem espaço ou símbolos, somente números. Exemplo: quatro dois três um.";
            falarTexto(pergunta);
            System.out.println("Coloque todos os número em ordem, de maneira seguida sem espaço ou simbolos, somente números(Exemplo:4231): ");
            int respostad1 = input.nextInt();
            if (respostad1 == 642973851){
                falarTexto("Parabéns, você acertou.");
                System.out.println("Parabéns você acertou");
                i++;
            }else{
                falarTexto("Tente novamente.");
                System.out.println("Tente novamente");
            }
        }
        falarTexto("Agora que você já sabe como funciona o jogo, vamos para o próximo desafio.");
        System.out.println("Agora que você já sabe como funciona o jogo, vamos para o próximo desafio");
    }

    public static void desafio2() {
        Scanner input = new Scanner(System.in);
        String pergunta = "Desafio dois: Qual será a saída desse algoritmo? int x igual a cinco; int y igual a três; se x maior que y, imprimir x mais y; senão, imprimir x menos y.";
        falarTexto(pergunta);
        System.out.println("\nDesafio 2: Qual será a saída desse algoritmo?");
        System.out.println("int x = 5;\nint y = 3;\nif(x > y) {\n    System.out.println(x + y);\n} else {\n    System.out.println(x - y);\n}");
        falarTexto("Digite a resposta correta:");
        System.out.print("Digite a resposta correta: ");
        int resposta = input.nextInt();
        if (resposta == 8) {
            falarTexto("Correto! Vamos para o próximo desafio.");
            System.out.println("Correto! Vamos para o próximo desafio.");
        } else {
            falarTexto("Errado! A resposta correta era oito. Vamos continuar.");
            System.out.println("Errado! A resposta correta era 8. Vamos continuar.");
        }
    }

    public static void desafio3() {
        Scanner input = new Scanner(System.in);
        String pergunta = "Desafio três: Quantas vezes o texto será impresso? Para i igual a zero; enquanto i menor que quatro; i mais mais; imprimir Algoritmo.";
        falarTexto(pergunta);
        System.out.println("\nDesafio 3: Quantas vezes o texto será impresso?");
        System.out.println("for(int i = 0; i < 4; i++) {\n    System.out.println(\"Algoritmo\");\n}");
        falarTexto("Digite o número de vezes:");
        System.out.print("Digite o número de vezes: ");
        int resposta = input.nextInt();
        if (resposta == 4) {
            falarTexto("Muito bem! Próximo desafio.");
            System.out.println("Muito bem! Próximo desafio.");
        } else {
            falarTexto("Resposta incorreta! O correto era quatro.");
            System.out.println("Resposta incorreta! O correto era 4.");
        }
    }

    public static void desafio4() {
        Scanner input = new Scanner(System.in);
        String pergunta = "Desafio quatro: Qual será o valor final de soma? int soma igual a zero; para i igual a um; enquanto i menor ou igual a três; i mais mais; soma mais igual a i.";
        falarTexto(pergunta);
        System.out.println("\nDesafio 4: Qual será o valor final de 'soma'?");
        System.out.println("int soma = 0;\nfor(int i = 1; i <= 3; i++) {\n    soma += i;\n}");
        falarTexto("Digite o valor final de soma:");
        System.out.print("Digite o valor final de soma: ");
        int resposta = input.nextInt();
        if (resposta == 6) {
            falarTexto("Acertou! Vamos ao último desafio.");
            System.out.println("Acertou! Vamos ao último desafio.");
        } else {
            falarTexto("Errado! O valor correto era seis.");
            System.out.println("Errado! O valor correto era 6.");
        }
    }

    public static void desafio5() {
        Scanner input = new Scanner(System.in);
        String pergunta = "Desafio cinco: Qual dessas opções representa um algoritmo para inverter um número inteiro?";
        String opcoes = "A: Receber o número, dividir por dois e imprimir o resultado. "
                + "B: Receber o número, converter para string, inverter e converter de volta para inteiro. "
                + "C: Receber o número, somar dez e imprimir. "
                + "D: Receber o número, multiplicar por menos um e imprimir.";
        falarTexto(pergunta);
        System.out.println("\nDesafio 5: Qual dessas opções representa um algoritmo para inverter um número inteiro?");
        falarTexto(opcoes);
        System.out.println("A) Receber o número, dividir por 2 e imprimir o resultado\n" +
                "B) Receber o número, converter para string, inverter e converter de volta para inteiro\n" +
                "C) Receber o número, somar 10 e imprimir\n" +
                "D) Receber o número, multiplicar por -1 e imprimir");
        falarTexto("Digite a letra da opção correta:");
        System.out.print("Digite a letra da opção correta: ");
        String resposta = input.next().toUpperCase();
        if (resposta.equals("B")) {
            falarTexto("Parabéns! Você concluiu todos os desafios!");
            System.out.println("Parabéns! Você concluiu todos os desafios!");
        } else {
            falarTexto("Resposta incorreta! A opção correta era B.");
            System.out.println("Resposta incorreta! A opção correta era B.");
        }
    }

    public static void main(String[] args) {
        coletarDadosJogador();
        desafio1();
        desafio2();
        desafio3();
        desafio4();
        desafio5();
    }
}