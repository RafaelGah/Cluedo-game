package com.company;

public class Tatort {
    private String raum;
    private String zweck;
    private String groesse;
    private int status;

    public String getRaum() {
        return raum;
    }

    public String getZweck() {
        return zweck;
    }

    public String getGroesse() {
        return groesse;
    }

    public int getStatus() {
        return status;
    }

    public Tatort(String raum, String zweck, String groesse, int status) {
        this.raum = raum;
        this.zweck = zweck;
        this.groesse = groesse;
        this.status = status;
    }

}
