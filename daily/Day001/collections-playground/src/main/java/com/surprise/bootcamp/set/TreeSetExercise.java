package com.surprise.bootcamp.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExercise {

    public static void main(String[] args) {

        Set<String> countries = new TreeSet<>();

        countries.add("South Africa");
        countries.add("Zimbabwe");
        countries.add("Botswana");
        countries.add("Namibia");
        countries.add("Lesotho");
        countries.add("Botswana");

        System.out.println("Countries:");

        for (String country : countries) {
            System.out.println(country);
        }

        System.out.println();

        System.out.println("Total Countries:");

        System.out.println(countries.size());

    }

}