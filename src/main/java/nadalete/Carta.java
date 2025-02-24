package nadalete;

public class Carta {
    private String nome; // valor (6, 7, Q, J, K, CORINGA)
    private String naipe;

    public Carta(String nome, String naipe) {
        this.nome = nome;
        this.naipe = naipe;
    }

    // criado somente os gets porque os sets não serão usados
    public String getNome() {
        return nome;
    }

    public String getNaipe() {
        return naipe;
    }

    @Override
    public String toString() {
        return nome + " de " + naipe;
    }
}
