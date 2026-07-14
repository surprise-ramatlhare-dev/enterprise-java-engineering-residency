package com.surprise.bootcamp.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExercise {

    public static void main(String[] args) {

        List<String> cities = new LinkedList<>();

        cities.add("Johannesburg");
        cities.add("Cape Town");
        cities.add("Durban");
        cities.add("Polokwane");

        System.out.println("Cities:");
        System.out.println(cities);

        cities.addFirst("Pretoria");

        cities.addLast("Bloemfontein");

        System.out.println("\nAfter additions:");
        System.out.println(cities);

        cities.removeFirst();

        cities.removeLast();

        System.out.println("\nAfter removals:");
        System.out.println(cities);

        System.out.println("\nLooping:");

        for(String city : cities){
            System.out.println(city);
        }

    }

}