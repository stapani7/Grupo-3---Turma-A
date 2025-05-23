## Explicação - Função falarTexto

 Este método utiliza o PowerShell do Windows para realizar o áudio do texto passado como parâmetro.
  Ele executa um comando que instancia a classe SpeechSynthesizer do .NET via PowerShell, seleciona a voz "Microsoft Maria Desktop",
  define o volume e a velocidade da fala, e em seguida fala o texto especificado. É importante observar que o método funciona apenas
  em ambientes Windows que possuam a voz especificada instalada e o PowerShell habilitado. O texto é sanitizado para evitar erros de
  sintaxe no PowerShell ao lidar com aspas simples.


## Explicação - coletarDadosJogador
      
  Este método coleta dados do jogador através do console, solicitando que ele digite seu nome, curso e turma.
  Para cada solicitação, a função também chama o método falarTexto para repetir em voz alta o que está sendo pedido,
  proporcionando uma interação auditiva, que é o diferencial do nosso jogo. Após coletar todas as informações, o método exibe e fala uma mensagem de boas-vindas
  personalizada com os dados fornecidos pelo usuário. Isso ajuda o usuário a se sentir visto e reconhecido.



## Explicação - Fumção Desafio 1 