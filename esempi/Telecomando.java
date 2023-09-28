package esempi;

public class Telecomando{
    private final Televisore tv;

    public Telecomando(Televisore tv) {
        this.tv = tv;
    }

    public void premiTastoAccensione(){
        tv.toggleAcceso();
    }
}