package it.epicode;

import java.util.Objects;

public class Pair {
    private int intero;
    private String parola;

    public Pair(int intero, String parola) {
        this.intero = intero;
        this.parola = parola;
    }

    public int getIntero() {
        return intero;
    }
    public String getParola() {
        return parola;
    }

    public void setIntero(int intero) {
        this.intero = intero;
    }
    public void setParola(String parola) {
        this.parola = parola;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Pair && obj.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(intero, parola);
    }
}


