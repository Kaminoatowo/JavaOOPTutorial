package esercizio2.dateformatter;

public class FormatterEUData extends DataFormatter {

    public FormatterEUData(String sep) {
        super(sep);
    }

    @Override
    String format(Data d) {
        var sb = new StringBuilder();
        sb.append(d.getGiorno());
        sb.append(getDelimiter());
        sb.append(d.getMese());
        sb.append(getDelimiter());
        sb.append(d.getAnno());
        return sb.toString();
    }
}
