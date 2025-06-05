#  Torre dos Desafios
------------------------------------------------------------------------------------
Esse é um jogo interativo feito em Java que mistura lógica de programação com uma história imersiva. A ideia é levar o jogador por uma jornada onde cada fase representa um desafio que testa conhecimento e raciocínio, com uma pegada crítica sobre corrupção e liderança.


##  Sobre o projeto

O jogo foi pensado como uma experiência educativa e reflexiva. Através de uma sequência de perguntas e desafios, o jogador vai descobrindo aos poucos que está dentro de um teste maior do que imagina. Tudo é conduzido por uma narração via voz (usando o PowerShell), tornando a experiência mais dinâmica e acessível.

 ---



 ## Funcionalidades

* Narração por voz usando a biblioteca System.Speech do PowerShell (voz "Microsoft Maria").

* Personalização do jogo com o nome do jogador.

* Cinco desafios com temas de lógica e programação.

* Repetição das perguntas via comando.

* História dividida em partes que se conectam aos desafios.

* Final com um "plot twist" que encerra a experiência com uma mensagem crítica.

---

## `jogoCompleto()`
* Basicamente essa função é o que faz quase tudo, ela é responsável por:

* Apresentar a introdução narrativa, explicando o contexto do jogo.

* Coletar o nome do jogador, personalizando a experiência.

* Rodar uma sequência de 5 desafios interativos, cada um com lógica de programação.

* Gerenciar a narração por voz em tempo real, usando PowerShell.

* Inserir pausas narrativas entre os desafios, fazendo o jogador se sentir dentro de uma história.

* Apresentar um desafio final simbólico, que fecha a trama com um sentido maior.

* Validar todas as respostas dos jogadores, dando feedback imediato com voz e texto.

---

## `falarTexto(String texto)`
Esse método utiliza o PowerShell para ler textos em voz alta. É compatível com Windows e usa a voz "Microsoft Maria" (padrão do sistema).
  
```powershell
Add-Type -AssemblyName System.Speech
$speak = New-Object System.Speech.Synthesis.SpeechSynthesizer
$speak.SelectVoice('Microsoft Maria Desktop')
$speak.Speak('Texto desejado')
```

---

## Desafios

* Sequência lógica em uma situação do dia a dia (banco).

* Condicional if com soma de variáveis.

* Loop for simples contando repetições.

* Soma acumulativa com +=.

* Escolha correta de um algoritmo que inverte um número.

* Desafio final simbólico, que usa conhecimento anterior.

--- 
### Desenvolvedores 

* Arthur Vieira Santana **(https://github.com/ArtVieiraSantana)**
* Guilherme Pedroso Sanches **(https://github.com/gsanches-dev11)**
* Joâo Paulo Figueiredo Serafim **(https://github.com/joaopaulofserafim)**
* Mateus Stapani **(https://github.com/stapani7)**
* Patrick Assis Vieira **(https://github.com/patrick060)**