package jogo;
import java.util.Scanner;

public class JogocomVoz {

    public static void jogoCompleto() {
        Scanner input = new Scanner(System.in);

        // Coletar dados do jogador
        System.out.print("Digite seu nome: ");
        falarTexto("Digite seu nome:");
        String nome = input.nextLine();
        String mensagem = "\nBem-vindo, " + nome + "!\n";
        System.out.println(mensagem);
        falarTexto(mensagem);

        // Desafio 1
        String introImpresso = "Bem vindo ao seu primeiro desafio. Seu primeiro desafio é numerar a ordem desses acontecimentos.";
        String introFala = "Bem vindo ao seu primeiro desafio. Se você está aqui, tem o potencial de mudar o mundo problemático em que vivemos. Seu primeiro desafio é numerar a ordem desses acontecimentos seguindo a logica. Vamos ver se você sabe algo de algoritmos.";
        String opcoes = "1 - Sair do banco.\n"
                + "2 - Aguardar a vez de ser atendido.\n"
                + "3 - Digitar a senha.\n"
                + "4 - Entrar na fila do caixa.\n"
                + "5 - Conferir o valor em dinheiro.\n"
                + "6 - Entrar no banco.\n"
                + "7 - Informar o valor a ser retirado.\n"
                + "8 - Pegar o comprovante, o cartão e o dinheiro.\n"
                + "9 - Entregar o cartão ao funcionário que atende no caixa.\n";
        String perguntaImpresso = "Coloque todos os números em ordem, de maneira seguida sem espaço ou símbolos, somente números. Exemplo: 4231.";
        String perguntaFala = "Coloque todos os números em ordem, de maneira seguida sem espaço ou símbolos, somente números. Por exemplo: quatro dois três um.";

        while (true) {
            System.out.println(introImpresso);
            System.out.println(opcoes);
            System.out.println(perguntaImpresso);
            falarTexto(introFala + " " + opcoes + " " + perguntaFala);
            int escolha;
            do {
                System.out.println("\nDigite 1 para responder ou 2 para repetir a pergunta:");
                escolha = input.nextInt();
                input.nextLine();
                if (escolha == 2) {
                    falarTexto(introFala + " " + opcoes + " " + perguntaFala);
                }
            } while (escolha != 1); 

            System.out.print("Coloque todos os número em ordem, de maneira seguida sem espaço ou simbolos, somente números(Exemplo:4231): ");
            falarTexto("Digite sua resposta.");
            int respostad1 = input.nextInt();
            if (respostad1 == 642973851 || respostad1 == 642793851) {
                System.out.println("Parabéns você acertou");
                falarTexto("Parabéns, você acertou.");
                break;
            } else {
                System.out.println("Tente novamente");
                falarTexto("Tente novamente.");
            }
        }
        System.out.println("Agora que você já sabe como funciona o jogo, vamos para o próximo desafio");
        falarTexto("Agora que você já sabe como funciona o jogo, vamos para o próximo desafio.");

        // Desafio 2
        String enunciado2 = "Desafio 2: Qual será a saída desse algoritmo?";
        String codigo2 = "int x = 5;\nint y = 3;\nif(x > y) {\n    System.out.println(x + y);\n} else {\n    System.out.println(x - y);\n}";
        String fala2 = "Qual será a saída desse algoritmo? Se x igual a cinco e y igual a três, se x maior que y, imprimir x mais y, senão imprimir x menos y.";
        while (true) {
            System.out.println("\n" + enunciado2);
            System.out.println(codigo2);
            falarTexto(fala2);
            int escolha;
            do {
                System.out.println("\nDigite 1 para responder ou 2 para repetir a pergunta:");
                escolha = input.nextInt();
                input.nextLine();
                if (escolha == 2) {
                    falarTexto(fala2);
                }
            } while (escolha != 1);

            System.out.print("Digite a resposta correta: ");
            falarTexto("Digite a resposta correta.");
            int resposta = input.nextInt();
            if (resposta == 8) {
                System.out.println("Correto! Vamos para o próximo desafio.");
                falarTexto("Correto! Vamos para o próximo desafio.");
                break;
            } else {
                System.out.println("Errado! Tente novamente.");
                falarTexto("Errado! Tente novamente.");
            }
        }

        // Desafio 3
        String enunciado3 = "Desafio 3: Quantas vezes o texto será impresso?";
        String codigo3 = "for(int i = 0; i < 4; i++) {\n    System.out.println(\"Algoritmo\");\n}";
        String fala3 = "Quantas vezes o texto será impresso? Para i igual a zero; enquanto i menor que quatro; i mais mais; imprimir Algoritmo.";
        while (true) {
            System.out.println("\n" + enunciado3);
            System.out.println(codigo3);
            falarTexto(fala3);
            int escolha;
            do {
                System.out.println("\nDigite 1 para responder ou 2 para repetir a pergunta:");
                escolha = input.nextInt();
                input.nextLine();
                if (escolha == 2) {
                    falarTexto(fala3);
                }
            } while (escolha != 1);

            System.out.print("Digite o número de vezes: ");
            falarTexto("Digite o número de vezes.");
            int resposta = input.nextInt();
            if (resposta == 4) {
                System.out.println("Muito bem! Próximo desafio.");
                falarTexto("Muito bem! Próximo desafio.");
                break;
            } else {
                System.out.println("Resposta incorreta! Tente novamente.");
                falarTexto("Resposta incorreta! Tente novamente.");
            }
        }

        // Desafio 4
        String enunciado4 = "Desafio 4: Qual será o valor final de 'soma'?";
        String codigo4 = "int soma = 0;\nfor(int i = 1; i <= 3; i++) {\n    soma += i;\n}";
        String fala4 = "Qual será o valor final da variável soma? Soma começa em zero. Para i igual a um; enquanto i menor ou igual a três; i mais mais; soma recebe soma mais i.";
        while (true) {
            System.out.println("\n" + enunciado4);
            System.out.println(codigo4);
            falarTexto(fala4);
            int escolha;
            do {
                System.out.println("\nDigite 1 para responder ou 2 para repetir a pergunta:");
                escolha = input.nextInt();
                input.nextLine();
                if (escolha == 2) {
                    falarTexto(fala4);
                }
            } while (escolha != 1);

            System.out.print("Digite o valor final de soma: ");
            falarTexto("Digite o valor final de soma.");
            int resposta = input.nextInt();
            if (resposta == 6) {
                System.out.println("Acertou! Vamos ao último desafio.");
                falarTexto("Acertou! Vamos ao último desafio.");
                break;
            } else {
                System.out.println("Errado! Tente novamente.");
                falarTexto("Errado! Tente novamente.");
            }
        }

        // Desafio 5
        String enunciado5 = "Desafio 5: Qual dessas opções representa um algoritmo para inverter um número inteiro?";
        String opcoes5 = "A: Receber o número, dividir por dois e imprimir o resultado. "
                + "B: Receber o número, converter para string, inverter e converter de volta para inteiro. "
                + "C: Receber o número, somar dez e imprimir. "
                + "D: Receber o número, multiplicar por menos um e imprimir.";
        String fala5 = "Qual dessas opções representa um algoritmo para inverter um número inteiro? Opção A: Receber o número, dividir por dois e imprimir o resultado. Opção B: Receber o número, converter para string, inverter e converter de volta para inteiro. Opção C: Receber o número, somar dez e imprimir. Opção D: Receber o número, multiplicar por menos um e imprimir.";
        while (true) {
            System.out.println("\n" + enunciado5);
            System.out.println(opcoes5);
            falarTexto(fala5);
            int escolha;
            do {
                System.out.println("\nDigite 1 para responder ou 2 para repetir a pergunta:");
                escolha = input.nextInt();
                input.nextLine();
                if (escolha == 2) {
                    falarTexto(fala5);
                }
            } while (escolha != 1);

            System.out.print("Digite a letra da opção correta: ");
            falarTexto("Digite a letra da opção correta.");
            String resposta = input.next().toUpperCase();
            if (resposta.equals("B")) {
                System.out.println("Parabéns! Você concluiu todos os desafios!");
                falarTexto("Parabéns! Você concluiu todos os desafios!");
                break;
            } else {
                System.out.println("Resposta incorreta! Tente novamente.");
                falarTexto("Resposta incorreta! Tente novamente.");
            }
        }
    }

    public static void falarTexto(String texto) {
        try {
            String comando = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; "
                    + "$speak = New-Object System.Speech.Synthesis.SpeechSynthesizer; "
                    + "$speak.SelectVoice('Microsoft Maria Desktop'); "
                    + "$speak.Volume = 75; "
                    + "$speak.Rate = 5; "
                    + "$speak.Speak('" + texto.replace("'", "''") + "');\"";
            Process p = Runtime.getRuntime().exec(comando);
            p.waitFor();
        } catch (Exception e) {
            System.out.println("Erro ao tentar falar: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        jogoCompleto();
    }
}   