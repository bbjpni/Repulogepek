package com.bzsomi;

import java.util.ArrayList;

public class Repulogepek {

    public static void kilistazas(ArrayList<Repulogep> lista){
        for (Repulogep repcsi: lista) {
            System.out.println(repcsi+"\n");
        }
        System.out.println();
    }
    public static int legnagyobbTank(ArrayList<Repulogep> lista){
        int index = 0;
        for (int i = 1; i < lista.size(); i++) {
            index = lista.get(index).getTankMeret() < lista.get(i).getTankMeret() ? i : index;
        }
        System.out.println("A LEGNAGYOBB TANKKAL RENDELKEZŐ REPÜLŐGÉP:\n"+lista.get(index));
        return index;
    }

    public static void main(String[] args) {
        ArrayList<Repulogep> repter = new ArrayList<>();
        repter.add( new UtasSzallitoRepulo("xxxa2", 25, 25));
        repter.add( new CsomagSzallitoRepulo("yyya2", 50, 2000));
        repter.add( new KatonaiRepulogep("zzza2", 1000, 200, 2000));

        kilistazas(repter);
        legnagyobbTank(repter);

    }
}
