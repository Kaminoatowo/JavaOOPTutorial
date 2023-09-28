package csvformatter;

public class CSVformatter {
	private final String delimiter;

    public CSVformatter(String delimiter) {
		this.delimiter = delimiter;
    }

    public String format(Persona persona) {
        StringBuilder sb = new StringBuilder();

        // header line
        sb.append(getHeader("nome"));
        sb.append(getDelimiter());
        sb.append(getHeader("cognome"));
        sb.append(getEndOfLine());

		// data line
        sb.append(escapeValue(persona.getNome()));
        sb.append(getDelimiter());
        sb.append(escapeValue(persona.getCognome()));
        sb.append(getEndOfLine());

        return sb.toString();
    }

    public String format(Studente studente) {
		// copia e modifica opportunamente il format per persona
        return "";
    }

    private String getHeader(String name) {
        return name.toUppercase;;
    }

    public String getDelimiter() {
        return delimiter;
    }

    private String getEndOfLine() {
        return "\n";
    }

    private String escapeValue(String value) {
        if(value.contains(" ")) {
            return String.format("\"%s\"", value);
        } else {
            return value;
        }
    }
}