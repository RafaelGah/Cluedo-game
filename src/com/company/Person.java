package com.company;

import java.util.Date;

public class Person {

    private String name;
    private String geschlecht;
    private String beruf;
    private int alter;


    public Person(String name, String geschlecht, String beruf, int alter) {
        this.name = name;
        this.geschlecht = geschlecht;
        this.beruf = beruf;
        this.alter = alter;
    }

    private void begruessen(){
        return;
    }
    private void laufen(){
        return;
    }
    private void Printperson(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public String getBeruf() {
        return beruf;
    }

    public int getAlter() {
        return alter;
    }



}


