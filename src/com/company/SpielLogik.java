package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SpielLogik {
    public void spielen(ArrayList<Person> personen, ArrayList<Tatwaffe> tatwaffen, Tatort[] tatorte) {
        Scanner scanner = new Scanner(System.in);
        int eingabeP = 0;
        int eingabeW = 0;
        int eingabeo = 0;

        Random random = new Random();
        Person person;
        int number = random.nextInt(personen.size());
        person = personen.get(number);
        for (int i = 0; i < number; i++) {
            person = personen.get(i);
        }

        Tatwaffe tatwaffe;
        int number1 = random.nextInt(tatwaffen.size());
        tatwaffe = tatwaffen.get(number1);
        for (int i = 0; i < number1; i++) {
            tatwaffe = tatwaffen.get(i);
        }
        Tatort tatort;

        int number2 = random.nextInt(tatorte.length);
        tatort = tatorte[number2];
        for (int i = 0; i < number2; i++) {
            tatort = tatorte[i];
        }


        int zaehler = 0;


        for (int i = 0; i < 8 && zaehler < 3; i++) {
            zaehler = 0;
            String eingabePerson = "";
            System.out.println("Geben sie ihren Versuch ein (Person) 1-6: ");
            eingabePerson = scanner.nextLine();
            eingabeP = Integer.parseInt(eingabePerson);
            String eingabeTatawaffe = "";
            System.out.println("Geben sie ihren Versuch ein (Waffe) 1-4: ");
            eingabeTatawaffe = scanner.nextLine();
            eingabeW = Integer.parseInt(eingabeTatawaffe);
            String eingabeTatort = "";
            System.out.println("Geben sie ihren Versuch ein (Tatort) 1-6: ");
            eingabeTatort = scanner.nextLine();
            eingabeo = Integer.parseInt(eingabeTatort);

            if (eingabeP == number) {
                zaehler++;
            }
            if (eingabeW == number1) {
                zaehler++;
            }
            if (eingabeo == number2) {
                zaehler++;
            }
            System.out.println("Sie haben " + zaehler + " aus 3 richtig.");
        }
        if (zaehler == 3) {
            System.out.println("Ihre Antwort war korrekt: " + person.getName() + " " + tatwaffe.getBezeichnung() + " " +tatort.getRaum());
        } else {
            System.out.println("Leider haben sie es nicht geschafft.");
        }


    }
}
