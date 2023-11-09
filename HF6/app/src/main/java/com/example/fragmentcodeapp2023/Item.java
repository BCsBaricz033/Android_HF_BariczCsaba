package com.example.fragmentcodeapp2023;

public class Item {
    public String rovidites;
    public String penznem;
    public String vetelAr;
    public String eladasAr;
    public String vasarol;
    public String elad;

    public Item(String rovidites, String penznem, String vetelar, String eladasAr) {
        this.rovidites = rovidites;
        this.penznem = penznem;
        this.vetelAr = vetelar;
        this.eladasAr = eladasAr;
        this.vasarol="Cumpara";
        this.elad="Vinde";
    }

    public String getRovidites() {
        return rovidites;
    }

    public String getPenznem() {
        return penznem;
    }

    public String getVetelAr() {
        return vetelAr;
    }

    public String getEladasAr() {
        return eladasAr;
    }

    public String getVasarol() {
        return vasarol;
    }

    public String getElad() {
        return elad;
    }
}
