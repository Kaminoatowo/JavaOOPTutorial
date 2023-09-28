package esercizio2.dateformatter;

public class FormatterLetterMonth extends DataFormatter {

    public FormatterLetterMonth() {
        super(" ");
    }

    @Override
    String format(Data d) {
        var sb = new StringBuilder();
        sb.append(d.getGiorno());
        sb.append(getDelimiter());
        sb.append(getNomeMese(d.getMese()));
        sb.append(getDelimiter());
        sb.append(d.getAnno());
        return sb.toString();
    }

    private String getNomeMese(int mese) {
        switch (mese) {
            case 1:
                
                return "Gennaio";
            case 2:
                
                return "Febbraio";
            case 3:
                
                return "Marzo";
            case 4:
                
                return "Aprile";
            case 5:
                
                return "Maggio";
            case 6:
                
                return "Giugno";
            case 7:
                
                return "Luglio";
            case 8:
                
                return "Agosto";
            case 9:
                
                return "Settembre";
            case 10:
                
                return "Ottobre";
            case 11:
                
                return "Novembre";
            case 12:
                
                return "Dicembre";
        }
        return "ERROR";
    }
}
