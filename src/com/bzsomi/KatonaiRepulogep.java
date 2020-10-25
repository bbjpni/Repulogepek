package com.bzsomi;

public class KatonaiRepulogep extends Repulogep implements IPassanger, IFreighter{
    private int utasokSzama;
    private double csomagokSulya;

    public KatonaiRepulogep(String azonosito, int tankMeret, int utasokSzama, double csomagokSulya) {
        super(azonosito, tankMeret);
        this.utasokSzama = utasokSzama;
        this.csomagokSulya = csomagokSulya;
    }

    @Override
    public double csomagokSulya() {
        return this.csomagokSulya;
    }

    @Override
    public int utasokSzama() {
        return this.utasokSzama;
    }
}
