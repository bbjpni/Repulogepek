package com.bzsomi;

public class Repulogep {
    private String azonosito;
    private int tankMeret;

    public Repulogep(String azonosito, int tankMeret) {
        this.azonosito = azonosito;
        this.tankMeret = tankMeret;
    }

    public int getTankMeret() {
        return tankMeret;
    }

    @Override
    public String toString() {
        return String.format("repülőgép:\nAZONOSÍTÓ: %s\nTANKMÉRETE: %d l", this.azonosito, this.tankMeret);
    }
}
