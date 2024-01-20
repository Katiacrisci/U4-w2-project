package models;

import lombok.AllArgsConstructor;

@AllArgsConstructor


public class Rivista extends Pubblicazione {

    Periodicita periodicita;

    public String toString() {
        return super.toString() + this.periodicita;

    }
}

