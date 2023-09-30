package dipendenti;

public class Dipendente {
    private final String nome;
    private Reparto reparto;

    public Dipendente(String nome, Reparto reparto) {
        this.nome = nome;
        this.reparto = reparto;
    }

    public String getNome() {
        return nome;
    }

    public Reparto getReparto() {
        return reparto;
    }

    public void setReparto(Reparto reparto) {
        this.reparto = reparto;
    }
}