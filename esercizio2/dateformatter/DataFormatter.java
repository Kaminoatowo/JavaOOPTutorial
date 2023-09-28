package esercizio2.dateformatter;

public abstract class DataFormatter {
    private final String delimiter;

    public String getDelimiter() {
        return delimiter;
    }

    protected DataFormatter(String delimiter) {
        this.delimiter = delimiter;
    }

    abstract String format(Data d);
}
