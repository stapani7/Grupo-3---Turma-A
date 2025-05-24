package jogo;
import java.util.Scanner;

public class JogocomVoz {

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
    
    /**
         * Este método utiliza o PowerShell do Windows para realizar o áudio do texto passado como parâmetro.
         * Ele executa um comando que instancia a classe SpeechSynthesizer do .NET via PowerShell, seleciona a voz "Microsoft Maria Desktop",
         * define o volume e a velocidade da fala, e em seguida fala o texto especificado. É importante observar que o método funciona apenas
         * em ambientes Windows que possuam a voz especificada instalada e o PowerShell habilitado. O texto é sanitizado para evitar erros de
         * sintaxe no PowerShell ao lidar com aspas simples.
    */

    public static void coletarDadosJogador() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        falarTexto("Digite seu nome:");
        String nome = input.nextLine();
        System.out.print("Digite seu curso: ");
        falarTexto("Digite seu curso:");
        String curso = input.nextLine();
        System.out.print("Digite sua turma: ");
        falarTexto("Digite sua turma:");
        String turma = input.nextLine();
        String mensagem = "\nBem-vindo, " + nome + " do curso " + curso + ", turma " + turma + "!\n";
        System.out.println(mensagem);
        falarTexto(mensagem);
    }
    
    /**
         * Este método coleta dados do jogador através do console, solicitando que ele digite seu nome, curso e turma.
         * Para cada solicitação, a função também chama o método falarTexto para repetir em voz alta o que está sendo pedido,
         * proporcionando uma interação auditiva, que é o diferencial do nosso jogo. Após coletar todas as informações, o método exibe e fala uma mensagem de boas-vindas
         * personalizada com os dados fornecidos pelo usuário. Isso ajuda o usuário a se sentir visto e reconhecido.
     */

    public static void desafio1() {
        Scanner input = new Scanner(System.in);
        String introImpresso = "Bem vindo ao seu primeiro desafio. Seu primeiro desafio é numerar a ordem desses acontecimentos.";
        String introFala = "Bem vindo ao seu primeiro desafio. Se você está aqui, tem o potencial de mudar o mundo problemático em que vivemos. Seu primeiro desafio é numerar a ordem desses acontecimentos. Vamos ver se você sabe algo de algoritmos.";
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
                input.nextLine(); // Limpa o buffer
                if (escolha == 2) {
                    falarTexto(introFala + " " + opcoes + " " + perguntaFala);
                }
            } while (escolha != 1);

            System.out.print("Coloque todos os número em ordem, de maneira seguida sem espaço ou simbolos, somente números(Exemplo:4231): ");
            falarTexto("Digite sua resposta.");
            int respostad1 = input.nextInt();
            if (respostad1 == 642973851) {
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
    }

    /*
        * Este método implementa o primeiro desafio do jogo. Ele solicita que o jogador organize uma sequência de eventos em uma ordem correta.
        * O desafio consiste em apresentar ao jogador uma lista de ações numeradas, e ele deve digitar a sequência correta de números 
        * que representa a ordem correta dos acontecimentos. O jogo oferece a opção de repetir a pergunta caso o jogador queira.
        * 
        * O programa começa com uma introdução impressa e falada, detalhando o objetivo do desafio e apresentando as opções de ações.
        * O jogador deve então fornecer a sequência de números correta (por exemplo: 642973851). Se a resposta estiver errada, ele é 
        * incentivado a tentar novamente, e o loop continua até que o jogador acerte a sequência. Caso a resposta seja correta, o jogo 
        * avança para o próximo desafio.
        * 
        * A interação é tanto visual (através de impressões no console) quanto auditiva (através da função `falarTexto`, que fala as instruções 
        * e as respostas). Isso cria uma experiência mais imersiva e acessível para o jogador.
    */

    public static void desafio2() {
        Scanner input = new Scanner(System.in);
        String enunciado = "Desafio 2: Qual será a saída desse algoritmo?";
        String codigo = "int x = 5;\nint y = 3;\nif(x > y) {\n    System.out.println(x + y);\n} else {\n    System.out.println(x - y);\n}";
        String fala = "Qual será a saída desse algoritmo? Se x igual a cinco e y igual a três, se x maior que y, imprimir x mais y, senão imprimir x menos y.";
        while (true) {
            System.out.println("\n" + enunciado);
            System.out.println(codigo);
            falarTexto(fala);
            int escolha;
            do {
                System.out.println("\nDigite 1 para responder ou 2 para repetir a pergunta:");
                escolha = input.nextInt();
                input.nextLine();
                if (escolha == 2) {
                    falarTexto(fala);
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
    }

    /**
         * Este método implementa o segundo desafio do jogo, no qual o jogador deve identificar a saída de um código simples em Java.
         * O código apresentado no desafio envolve uma comparação entre duas variáveis (`x` e `y`) e imprime um valor baseado no resultado
         * dessa comparação.
         * 
         * O enunciado é impresso e falado, explicando o que o código faz: se `x` for maior que `y`, o programa imprime a soma de `x` e `y`;
         * caso contrário, imprime a diferença entre `x` e `y`.
         * 
         * O jogador deve então inserir a resposta correta. A resposta correta para esse código é `8`, já que a soma de `5` e `3` resulta em `8`.
         * 
         * O jogo oferece a opção de repetir a explicação do código caso o jogador não tenha entendido a pergunta, permitindo mais interatividade.
         * Se a resposta estiver correta, o programa exibe uma mensagem de sucesso e avança para o próximo desafio. Caso contrário, o jogador 
         * é incentivado a tentar novamente.
         * 
         * A interação inclui tanto o texto impresso no console quanto a comunicação auditiva, com as instruções sendo faladas através da 
         * função `falarTexto`, proporcionando uma experiência mais envolvente e acessível.
     */

    public static void desafio3() {
        Scanner input = new Scanner(System.in);
        String enunciado = "Desafio 3: Quantas vezes o texto será impresso?";
        String codigo = "for(int i = 0; i < 4; i++) {\n    System.out.println(\"Algoritmo\");\n}";
        String fala = "Quantas vezes o texto será impresso? Para i igual a zero; enquanto i menor que quatro; i mais mais; imprimir Algoritmo.";
        while (true) {
            System.out.println("\n" + enunciado);
            System.out.println(codigo);
            falarTexto(fala);
            int escolha;
            do {
                System.out.println("\nDigite 1 para responder ou 2 para repetir a pergunta:");
                escolha = input.nextInt();
                input.nextLine();
                if (escolha == 2) {
                    falarTexto(fala);
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
    }

    /**
         * Este método implementa o terceiro desafio do jogo, onde o jogador deve determinar quantas vezes um texto será impresso
         * com base em um loop `for` apresentado no código.
         * 
         * O código exibido no desafio é um laço `for` que inicia com `i = 0` e continua enquanto `i` for menor que 4, incrementando 
         * `i` a cada iteração. O código imprime a palavra "Algoritmo" em cada iteração do loop.
         * 
         * O enunciado e a explicação do código são apresentados tanto de forma escrita quanto falada, através da função `falarTexto`, 
         * garantindo que o jogador entenda o que o código faz: imprime o texto "Algoritmo" 4 vezes, pois o loop executa 4 iterações.
         * 
         * O jogador deve inserir o número de vezes que o texto será impresso. Se a resposta correta (4) for fornecida, o jogo avança 
         * para o próximo desafio. Caso a resposta esteja errada, o jogador é incentivado a tentar novamente.
         * 
         * A interação no jogo é tanto visual quanto auditiva, criando uma experiência mais imersiva e acessível para o jogador.
     */

    public static void desafio4() {
        Scanner input = new Scanner(System.in);
        String enunciado = "Desafio 4: Qual será o valor final de 'soma'?";
        String codigo = "int soma = 0;\nfor(int i = 1; i <= 3; i++) {\n    soma += i;\n}";
        String fala = "Qual será o valor final da variável soma? Soma começa em zero. Para i igual a um; enquanto i menor ou igual a três; i mais mais; soma recebe soma mais i.";
        while (true) {
            System.out.println("\n" + enunciado);
            System.out.println(codigo);
            falarTexto(fala);
            int escolha;
            do {
                System.out.println("\nDigite 1 para responder ou 2 para repetir a pergunta:");
                escolha = input.nextInt();
                input.nextLine();
                if (escolha == 2) {
                    falarTexto(fala);
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
    }

    /**
         * Este método implementa o quarto desafio do jogo, onde o jogador deve calcular o valor final da variável 'soma'
         * com base no código apresentado.
         * 
         * O código exibido no desafio é um laço `for` que inicia com `i = 1` e continua enquanto `i` for menor ou igual a 3,
         * incrementando `i` a cada iteração. Em cada iteração, o valor de `i` é somado à variável `soma`.
         * 
         * O jogador deve calcular o valor final da variável `soma` após a execução do loop. Como `soma` começa com 0 e o loop
         * executa três vezes (com `i` assumindo os valores 1, 2 e 3), o valor final de `soma` será a soma desses valores: 1 + 2 + 3 = 6.
         * 
         * O enunciado e a explicação do código são apresentados tanto de forma escrita quanto falada, através da função `falarTexto`, 
         * garantindo que o jogador entenda o que o código faz.
         * 
         * O jogador deve inserir o valor final de `soma`. Se a resposta correta (6) for fornecida, o jogo avança para o próximo desafio.
         * Caso a resposta esteja errada, o jogador é incentivado a tentar novamente.
         * 
         * A interação no jogo é tanto visual quanto auditiva, criando uma experiência mais imersiva e acessível para o jogador.
     */

    public static void desafio5() {
        Scanner input = new Scanner(System.in);
        String enunciado = "Desafio 5: Qual dessas opções representa um algoritmo para inverter um número inteiro?";
        String opcoes = "A: Receber o número, dividir por dois e imprimir o resultado. "
                + "B: Receber o número, converter para string, inverter e converter de volta para inteiro. "
                + "C: Receber o número, somar dez e imprimir. "
                + "D: Receber o número, multiplicar por menos um e imprimir.";
        String fala = "Qual dessas opções representa um algoritmo para inverter um número inteiro? Opção A: Receber o número, dividir por dois e imprimir o resultado. Opção B: Receber o número, converter para string, inverter e converter de volta para inteiro. Opção C: Receber o número, somar dez e imprimir. Opção D: Receber o número, multiplicar por menos um e imprimir.";
        while (true) {
            System.out.println("\n" + enunciado);
            System.out.println(opcoes);
            falarTexto(fala);
            int escolha;
            do {
                System.out.println("\nDigite 1 para responder ou 2 para repetir a pergunta:");
                escolha = input.nextInt();
                input.nextLine();
                if (escolha == 2) {
                    falarTexto(fala);
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

     /**
         * Este método implementa o quinto desafio do jogo, onde o jogador deve identificar o algoritmo correto para inverter
         * um número inteiro entre várias opções fornecidas.
         * 
         * O enunciado apresenta quatro opções, sendo que a opção correta é a letra "B", que descreve um algoritmo que:
         * 1. Recebe o número.
         * 2. Converte o número para uma string.
         * 3. Inverte a string.
         * 4. Converte a string de volta para inteiro.
         * 
         * As outras opções são incorretas:
         * - A: Não realiza a inversão do número, apenas o divide por dois.
         * - C: Soma 10 ao número e imprime o resultado, sem inverter o número.
         * - D: Multiplica o número por -1, o que não inverte o número, mas o transforma em seu oposto.
         * 
         * O enunciado e as opções são apresentados tanto de forma escrita quanto falada, por meio da função `falarTexto`, 
         * para garantir que o jogador compreenda as alternativas.
         * 
         * O jogador deve inserir a letra correspondente à opção correta ("B"). Caso a resposta esteja correta, o jogo parabeniza
         * o jogador e conclui todos os desafios. Se a resposta for errada, o jogador é incentivado a tentar novamente.
         * 
         * A interação no jogo é tanto visual quanto auditiva, promovendo uma experiência mais imersiva e acessível para o jogador.
     */

    public static void main(String[] args) {
        coletarDadosJogador();
        desafio1();
        desafio2();
        desafio3();
        desafio4();
        desafio5();
    }
}
