package com.cc.java;

public class Konto {
    
    public String kontoInhaber;
    public int kontostand;
    public String eu;

    
    public Konto(String kontoInhaber, int kontostand) {
        this.kontoInhaber = kontoInhaber;
        this.kontostand = kontostand;
        eu = " Zaster";

    }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

    public String getKontoInhaber() {
        return kontoInhaber;
    }

    public void setKontoInhaber(String kontoInhaber) {
        this.kontoInhaber = kontoInhaber;
    }

    



}
