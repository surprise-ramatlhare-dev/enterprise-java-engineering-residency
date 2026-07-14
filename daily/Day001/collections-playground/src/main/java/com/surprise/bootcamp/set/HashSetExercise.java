package com.surprise.bootcamp.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExercise {

    public static void main(String[] args) {

        Set<String> programmingLanguages = new HashSet<>();

        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C#");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");

        System.out.println("Programming Languages:");

        for (String language : programmingLanguages) {
            System.out.println(language);
        }

        System.out.println();

        System.out.println("Total Languages:");

        System.out.println(programmingLanguages.size());

    }

}