package com.bzsomi;

public class CsomagSzallitoRepulo extends Repulogep implements IFreighter{
    private double csomagokSulya;

    public CsomagSzallitoRepulo(String azonosito, int tankMeret, double csomagokSulya) {
        super(azonosito, tankMeret);
        this.csomagokSulya = csomagokSulya;
    }

    @Override
    public double csomagokSulya() {
        return this.csomagokSulya;
    }
}
