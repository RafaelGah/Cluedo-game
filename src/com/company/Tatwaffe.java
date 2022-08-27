package com.company;

public class Tatwaffe {
    private String bezeichnung;
    private String farbe;
    private String schwierigkeit;

    public String getBezeichnung() {
        return bezeichnung;
    }

    public String getFarbe() {
        return farbe;
    }

    public String getSchwierigkeit() {
        return schwierigkeit;
    }

    public int getEffektivität() {
        return effektivität;
    }

    private int effektivität;

    public Tatwaffe(String bezeichnung, String farbe, String schwierigkeit, int effektivität) {
        this.bezeichnung = bezeichnung;
        this.farbe = farbe;
        this.schwierigkeit = schwierigkeit;
        this.effektivität = effektivität;
    }

    private void toeten(){
        return;
    }
}
