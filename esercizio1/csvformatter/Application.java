package csvformatter;

public class Application {
    public void main(String[] args) {
        var persona = new Persona("Mario", "Rossi");
        var studente1 = new Studente("Pinco", "Panco", "4AI");
        var formatter = new CSVformatter(";");
        System.out.println(formatter.format(persona));
        System.out.println(formatter.format(studente1));
    }
}