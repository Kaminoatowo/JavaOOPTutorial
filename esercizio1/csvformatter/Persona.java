package csvformatter;

public class Persona {
    private final String nome;
    private final String cognome;

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
    
}