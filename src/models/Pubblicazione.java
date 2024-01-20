package models;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public abstract class Pubblicazione {
    private long Isbn;
    private String title;
    private int annoDiPubblicazione;
    private int numeroPagine;

    @Override
    public String toString() {
        return this.Isbn + "#" + this.title + "#" + this.annoDiPubblicazione + "#" + this.numeroPagine + "#";

    }
}
