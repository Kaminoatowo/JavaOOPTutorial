package anagrafica;

public class Studente extends Persona {
    private String classe;

	public Studente(String nome, String cognome, String classe) {
        super(nome, cognome);
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }

    @Override
    public String toString() {
        return "Studente{" + getNomeCompleto() + " | " + getClasse() + "}";
    }
}