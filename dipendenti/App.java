package diendenti;

import java.util.ArrayList;
import java.util.List;

// gestione di anagrafica dipedenti
// reparti: IT, LOGISTICA, PRODUZIONE

class App {

    private final List<Dipendenti> dipendenti;

    public App() {
        dipendenti = new ArrayList<>();
    }

    public static void main(String[] args) {
        var app = new App();
        app.run();
    }

    private void run() {
        var d1 = creaDipendente("Mario Rossi", Reparto.IT);
        var d2 = creaDipendente("Mario Bianchi", Reparto.LOGISTICA);
        var d3 = creaDipendente("Mario Neri", Reparto.PRODUZIONE);

        System.out.println(String.format("I dipendenti snoo %d", numeroDipendenti()));
        System.out.println(String.format("I dipendenti del reparto IT sono %d", numeroDipendenti(Reparto.IT)));
    }

    private int numeroDipendenti() {
        return dipedenti.size();
    }

    private int numeroDipendenti(Reparto reparto) {
        var count = 0;
        for (var d:dipendenti) {
            if (d.getReparto() == reparto) {
                count++;
            }
        }
        return count;
    }

    private Dipendente creaDipendente(String nome, Reparto reparto) {
        var dipedente = new Dipendente(nome, reparto);
        dipedenti.add(dipedente);
        return dipedente;
    }
}