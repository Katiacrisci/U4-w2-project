package models;

public enum Periodicita {
    QUOTIDIANO("QUOTIDIANO"), SETTIMANALE("SETTIMANALE"), MENSILE("MENSILE"), SEMESTRALE("SEMESTRALE");

    public final String value;

    Periodicita(String value) {
        this.value = value;
    }
}
