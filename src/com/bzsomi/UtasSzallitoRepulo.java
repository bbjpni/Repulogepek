package com.bzsomi;

public class UtasSzallitoRepulo extends Repulogep implements IPassanger {

    private int utasokSzama;

    public UtasSzallitoRepulo(String azonosito, int tankMeret, int utasokSzama) {
        super(azonosito, tankMeret);
        this.utasokSzama = utasokSzama;
    }

    @Override
    public int utasokSzama() {
        return this.utasokSzama;
    }
}
