package esempi;

public class Esempio01 {
    public static void main(String[] args) {
        var televisore1 = new Televisore("LG", "nero", 55);
		var telecomando = new Telecomando(televisore1);

        System.out.println(televisore1.getMarca() + " " + 
        televisore1.getColore() + " " + 
        televisore1.getDimensioni());
        
        telecomando.premiTastoAccensione();
        
        if (televisore1.isAcceso()) {
            System.out.println("acceso");
        } else {
            System.out.println("spento");
        }
    }
}