package esempi;

public class Televisore {
    //proprietà costanti
    private final String marca;
    private final String colore;
    private final int dimensioni;

	//proprietà variabili
    private int canaleSelezionato;
    private boolean acceso;

	public Televisore(String marca, String colore, int dimensioni) {
        this.marca = marca;
        this.colore = colore;
        this.dimensioni = dimensioni;

        canaleSelezionato = 0;
        acceso = false;
    }

    public void setCanaleSelezionato(int canaleSelezionato) {
        this.canaleSelezionato = canaleSelezionato;
    }

    public void setAcceso(boolean acceso) {
		this.acceso = acceso;
    }

    public String getMarca() {
        return marca;
    }

    public String getColore() {
        return colore;
    }

    public String getDimensioni() {
        return dimensioni + "\"";
    }

    public int getCanaleSelezionato() {
        return canaleSelezionato;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void toggleAcceso() {
        acceso = !acceso;
    }
}