package com.surprise.bootcamp.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("Mary");
        names.add("Surprise");

        System.out.println("Using ArrayList:");
        System.out.println(names);

        // Switching implementation
        names = new LinkedList<>();

        names.add("Peter");
        names.add("Sarah");

        System.out.println("\nUsing LinkedList:");
        System.out.println(names);
    }
}