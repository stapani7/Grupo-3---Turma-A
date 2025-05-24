# Explicação - Função falarTexto
------------------------------------------------------------------------------------
 Este método utiliza o PowerShell do Windows para realizar o áudio do texto passado como parâmetro.
  Ele executa um comando que instancia a classe SpeechSynthesizer do .NET via PowerShell, seleciona a voz "Microsoft Maria Desktop",
  define o volume e a velocidade da fala, e em seguida fala o texto especificado. 
  
  É importante observar que o método funciona apenas
  em ambientes Windows que possuam a voz especificada instalada e o PowerShell habilitado. O texto é sanitizado para evitar erros de
  sintaxe no PowerShell ao lidar com aspas simples.

  ## Código
------------------------------------------------------------------------------------
```java
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

```
### Entrada: Recebe um texto como parâmetro.
------------------------------------------------------------------------------------
### PowerShell: Executa um comando PowerShell para usar a síntese de fala.
------------------------------------------------------------------------------------
### Fala: Converte o texto em fala com a voz "Microsoft Maria Desktop".
------------------------------------------------------------------------------------
### Erro: Se algo der errado, exibe uma mensagem de erro no console.




# Explicação - coletarDadosJogador
------------------------------------------------------------------------------------
  Este método coleta dados do jogador através do console, solicitando que ele digite seu nome, curso e turma.

  Para cada solicitação, a função também chama o método falarTexto para repetir em voz alta o que está sendo pedido,
  proporcionando uma interação auditiva, que é o diferencial do nosso jogo. 
  
  Após coletar todas as informações, o método exibe e fala uma mensagem de boas-vindas
  personalizada com os dados fornecidos pelo usuário. Isso ajuda o usuário a se sentir visto e reconhecido.


  ## Código
  ------------------------------------------------------------------------------------
```java
Copiar
Editar
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

```

## Como Funciona
------------------------------------------------------------------------------------
### Entrada de Dados: Solicita ao usuário que insira seu nome, curso e turma.
------------------------------------------------------------------------------------

### Uso de falarTexto: Faz as perguntas e lê a mensagem final em voz alta.
------------------------------------------------------------------------------------

### Exibição: Exibe a mensagem de boas-vindas no console e a lê em voz alta.
------------------------------------------------------------------------------------






# Explicação - Função Desafio 1 

Este método implementa o primeiro desafio do jogo. Ele solicita que o jogador organize uma sequência de eventos em uma ordem correta.
O desafio consiste em apresentar ao jogador uma lista de ações numeradas, e ele deve digitar a sequência correta de números 
que representa a ordem correta dos acontecimentos. O jogo oferece a opção de repetir a pergunta caso o jogador queira.

O programa começa com uma introdução impressa e falada, detalhando o objetivo do desafio e apresentando as opções de ações.

O jogador deve então fornecer a sequência de números correta (por exemplo: 642973851). Se a resposta estiver errada, ele é 
incentivado a tentar novamente, e o loop continua até que o jogador acerte a sequência. Caso a resposta seja correta, o jogo 
avança para o próximo desafio.

A interação é tanto visual (através de impressões no console) quanto auditiva (através da função `falarTexto`, que fala as instruções 
e as respostas). Isso cria uma experiência mais imersiva e acessível para o jogador.

## Código
------------------------------------------------------------------------------------

```java
Copiar
Editar
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

```
## Como Funciona
------------------------------------------------------------------------------------

### Introdução: Apresenta uma descrição do desafio e as opções que precisam ser ordenadas.
------------------------------------------------------------------------------------

### Interação do Usuário: O usuário pode escolher tentar responder ou ouvir novamente as instruções.
------------------------------------------------------------------------------------

### Resposta: O jogador deve digitar a sequência correta de números (no caso, 642973851).
------------------------------------------------------------------------------------

### Verificação: Se a resposta estiver correta, o jogo parabeniza o jogador e avança para o próximo desafio. Se errar, o jogador é incentivado a tentar novamente.
------------------------------------------------------------------------------------

### Uso de falarTexto: Toda a interação e as instruções são lidas em voz alta para o usuário.
------------------------------------------------------------------------------------





# Explicação - Função Desafio 2

Este método implementa o segundo desafio do jogo, no qual o jogador deve identificar a saída de um código simples em Java.
O código apresentado no desafio envolve uma comparação entre duas variáveis (`x` e `y`) e imprime um valor baseado no resultado
dessa comparação.

O enunciado é impresso e falado, explicando o que o código faz: se `x` for maior que `y`, o programa imprime a soma de `x` e `y`;
caso contrário, imprime a diferença entre `x` e `y`.

O jogador deve então inserir a resposta correta. A resposta correta para esse código é `8`, já que a soma de `5` e `3` resulta em `8`.
 
O jogo oferece a opção de repetir a explicação do código caso o jogador não tenha entendido a pergunta, permitindo mais interatividade.
Se a resposta estiver correta, o programa exibe uma mensagem de sucesso e avança para o próximo desafio. Caso contrário, o jogador 
é incentivado a tentar novamente.

A interação inclui tanto o texto impresso no console quanto a comunicação auditiva, com as instruções sendo faladas através da 
função `falarTexto`, proporcionando uma experiência mais envolvente e acessível.

## Código
------------------------------------------------------------------------------------
```java
Copiar
Editar
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

```

## Como Funciona
------------------------------------------------------------------------------------

### Enunciado e Código: O jogador recebe o enunciado e o código para analisar.
------------------------------------------------------------------------------------

### Instruções de Áudio: O desafio é lido em voz alta para o jogador.
------------------------------------------------------------------------------------

### Interação: O jogador escolhe se deseja responder ou ouvir as instruções novamente.
------------------------------------------------------------------------------------

### Resposta: O jogador precisa digitar a resposta correta. No caso, a saída correta do código é 8.
------------------------------------------------------------------------------------

### Verificação: Se a resposta estiver correta, o jogo avança para o próximo desafio. Caso contrário, o jogador é incentivado a tentar novamente.
------------------------------------------------------------------------------------


# Explicação - Função Desafio 3

Este método implementa o terceiro desafio do jogo, onde o jogador deve determinar quantas vezes um texto será impresso
com base em um loop `for` apresentado no código.

O código exibido no desafio é um laço `for` que inicia com `i = 0` e continua enquanto `i` for menor que 4, incrementando 
`i` a cada iteração. O código imprime a palavra "Algoritmo" em cada iteração do loop.

O enunciado e a explicação do código são apresentados tanto de forma escrita quanto falada, através da função `falarTexto`, 
garantindo que o jogador entenda o que o código faz: imprime o texto "Algoritmo" 4 vezes, pois o loop executa 4 iterações.

O jogador deve inserir o número de vezes que o texto será impresso. Se a resposta correta (4) for fornecida, o jogo avança 
para o próximo desafio. Caso a resposta esteja errada, o jogador é incentivado a tentar novamente.

A interação no jogo é tanto visual quanto auditiva, criando uma experiência mais imersiva e acessível para o jogador.



## Código
```java
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
```
## Como Funciona
------------------------------------------------------------------------------------

### Enunciado e Código: O jogador é apresentado ao enunciado do desafio e ao código do loop.
------------------------------------------------------------------------------------

### Instruções de Áudio: O enunciado e o código são lidos em voz alta para o jogador.
------------------------------------------------------------------------------------

### Interação: O jogador decide se quer responder ou ouvir as instruções novamente.
------------------------------------------------------------------------------------

### Resposta: O jogador deve identificar quantas vezes o texto "Algoritmo" será impresso. A resposta correta é 4.
------------------------------------------------------------------------------------

### Verificação: Se a resposta estiver correta, o jogo avança para o próximo desafio. Se errar, o jogador é incentivado a tentar novamente.
------------------------------------------------------------------------------------