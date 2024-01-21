package models;


public class Rivista extends Pubblicazione {

    Periodicita periodicita;

    public Rivista(long Isbn, String title, int annoDiPubblicazione, int numeroPagine, Periodicita periodicita) {
        super(Isbn, title, annoDiPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }

    public Rivista(String[] values) {
        super(Long.parseLong(values[0]), values[1], Integer.parseInt(values[2]), Integer.parseInt(values[3]));
        this.periodicita = Periodicita.valueOf(values[4].replace("\n", ""));
    }

    public String toString() {
        return super.toString() + this.periodicita + "\n";
    }
}

