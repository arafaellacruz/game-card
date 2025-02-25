# Atividade: Criação de Classes de Jogo de Cartas

## Descrição

Implemente um sistema básico de baralho com as classes `Carta` e `Baralho`.

### Classe Carta

- **Atributos:**
  - `nome`: Nome da carta.
  - `naipe`: Naipe da carta.

- **Métodos:**
  - `getNome()`,
  - `getNaipe()`, 

### Classe Baralho

- **Atributos:**
  - `cartas`: Lista com 52 cartas + incluindo 4 coringas.

- **Métodos:**
  - `Baralho()`: Inicializa as cartas.
  - `embaralhar()`: Embaralha as cartas.
  - `distribuirCarta()`: Retorna a carta do topo ou `null`.
  - `hasCarta()`: Verifica se há cartas no baralho.
  - `imprimirBaralho()`: Imprime as cartas do baralho.

