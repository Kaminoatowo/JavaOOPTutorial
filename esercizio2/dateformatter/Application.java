package esercizio2.dateformatter;

public class Application {
    public static void main(String[] args) {
        Data d = new Data(29,9,2023);
        var f1 = new FormatterEUData("/");
        var f2 = new FormatterLetterMonth();
        System.out.println(f1.format(d));
        System.out.println(f2.format(d));
    }
}
