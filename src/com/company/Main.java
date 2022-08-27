package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Person person = new Person("Miss Scarlett", "weiblich", "Koch", 67);
        Person person1 = new Person("Colonel Mustard", "männlich", "Colonel", 56);
        Person person2 = new Person("Miss White", "weiblich", "Kellner", 32);
        Person person3 = new Person("Professor Plum", "männlich", "Pfarrer", 89);
        Person person4 = new Person("Bonez", "männlich", "Bäcker", 65);
        Person person5 = new Person("Professor Kek", "männlich", "Koch", 12);

        Tatwaffe tatwaffe = new Tatwaffe("Hammer", "schwarz", "leicht", 8);
        Tatwaffe tatwaffe1 = new Tatwaffe("5 Franke", "silber", "schwer", 1);
        Tatwaffe tatwaffe2 = new Tatwaffe("Laptop", "schwarz", "mittel", 4);
        Tatwaffe tatwaffe3 = new Tatwaffe("Ak-47", "grau", "leicht", 10);

        Tatort tatort = new Tatort("Badezimmer", "waschen", "gross", 4);
        Tatort tatort1 = new Tatort("Büro", "arbeiten", "mittel", 3);
        Tatort tatort2 = new Tatort("Küche", "kochen", "klein", 1);
        Tatort tatort3 = new Tatort("Schlafzimmer", "schlafen", "mittel", 5);
        Tatort tatort4 = new Tatort("Wohnzimmer", "leben", "klein",2);
        Tatort tatort5 = new Tatort("Garten", "landwirtschaft", "gross", 4);

        ArrayList<Person> personen = new ArrayList();
        personen.add(person);
        personen.add(person1);
        personen.add(person2);
        personen.add(person3);
        personen.add(person4);
        personen.add(person5);

        for (Person person0 : personen) {
            System.out.println(person0.getName() + " " + person0.getBeruf() + " " + person0.getGeschlecht() + " " + person0.getAlter());
        }
        System.out.println("\n");

        ArrayList<Tatwaffe> tatwaffen = new ArrayList();
        tatwaffen.add(tatwaffe);
        tatwaffen.add(tatwaffe1);
        tatwaffen.add(tatwaffe2);
        tatwaffen.add(tatwaffe3);

        for (Tatwaffe tatwaffe0 : tatwaffen) {
            System.out.println(tatwaffe0.getBezeichnung() + " " + tatwaffe0.getSchwierigkeit() + " " + tatwaffe0.getFarbe() + " " + tatwaffe0.getEffektivität());
        }
        System.out.println("\n");

        Tatort[] tatorte =
                {tatort, tatort1, tatort2, tatort3, tatort4, tatort5};

        for (int i = 0; i < tatorte.length; i++) {
            System.out.println(tatorte[i].getRaum() + " " + tatorte[i].getZweck() + " " + tatorte[i].getGroesse() + " " + tatorte[i].getStatus());
        }
        SpielLogik spielLogik = new SpielLogik();
        spielLogik.spielen(personen, tatwaffen, tatorte);

    }
}
