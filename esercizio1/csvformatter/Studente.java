package csvformatter;



public class Studente extends Persona {

    private String classe;

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Studente(String nome, String cognome, String classe) {
        super(nome, cognome);
        this.classe = classe;
    }
    
}