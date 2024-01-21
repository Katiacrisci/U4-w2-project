package models;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public abstract class Pubblicazione {
    private Long Isbn;
    private String title;
    private Integer annoDiPubblicazione;
    private Integer numeroPagine;

    @Override
    public String toString() {
        return this.Isbn + "#" + this.title + "#" + this.annoDiPubblicazione + "#" + this.numeroPagine + "#";
    }
}
