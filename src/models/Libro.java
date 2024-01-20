package models;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Libro extends Pubblicazione {

    private String autore;
    private String genere;

    @Override
    public String toString() {
        return super.toString() + this.autore + "#" + this.genere;
    }
}

