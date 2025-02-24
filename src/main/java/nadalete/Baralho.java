package nadalete;

public class Baralho {

    // criar classe com atributo do tipo Carta e instanciar classe Cart[56], array principal
    private Carta[] baralho = new Carta[56];

    public Baralho() {
        // criando variáveis pra criar looping de criação de carta
        String[] nomes = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Q", "J", "K"};
        String[] naipes = {"Paus", "Copas", "Espada", "Ouros"};
        int i = 0;

        // criação de cartas normais - 52
        // esse for percorre cada naipe e cada nome criando uma combinação de nome+naipe
        for (String naipe : naipes) {
            for (String nome : nomes) {
                baralho[i] = new Carta(nome, naipe);
                i++;
            }
        }

        // criação de cartas coringas - 4
        // usamos < 56 porque o array começa em 0, então é sempre uma posição a menos
        for (int baralhoAtual = 52; baralhoAtual < 56; baralhoAtual++) {
            baralho[baralhoAtual] = new Carta("Coringa", "Coringa");
        }
    }

    // troca a posição da carta dentro do array baralho
    public void embaralhar() {
        for (int i = baralho.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));

            Carta aux = baralho[i];
            baralho[i] = baralho[j];
            baralho[j] = aux;
        }
    }

    //
    public Carta distribuirCarta() {
        int topo = baralho.length - 1;

        while (topo >= 0 && baralho[topo] == null) {
            topo--;
        }

        if (topo < 0) {
            System.out.println("O baralho está vazio!");
            return null;
        }

        Carta cartaRetirada = baralho[topo];
        baralho[topo] = null;

        return cartaRetirada;
    }

    // função para verificar se uma carta dada o nome e naipe estão no baralho
    public boolean hasCarta(String nome, String naipe) {
        for (Carta c : baralho) {
            if (c != null && c.getNome().equals(nome) && c.getNaipe().equals(naipe)) {
                return true;
            }
        }
        return false;
    }

    public void imprimirBaralho() {
        for (Carta carta : baralho) {
            if (carta != null) {
                if (carta.getNome().equalsIgnoreCase("Coringa")) {
                    System.out.println(carta.getNome()); // imprimindo somente o nome das coringas
                } else {
                    System.out.println(carta); // mostrando o resto do baralho
                }
            }
        }
    }
}
