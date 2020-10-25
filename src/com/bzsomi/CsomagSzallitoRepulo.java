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

    @Override
    public String toString() {
        return String.format("Csomag szállító %s\nUTASOK SZÁMA: %.2f kg", super.toString(), this.csomagokSulya);
    }
}
