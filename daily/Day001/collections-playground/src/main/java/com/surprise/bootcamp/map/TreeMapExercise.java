package com.surprise.bootcamp.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExercise {

    public static void main(String[] args) {

        Map<String, Integer> studentMarks = new TreeMap<>();

        studentMarks.put("Peter", 70);
        studentMarks.put("John", 82);
        studentMarks.put("Surprise", 100);
        studentMarks.put("Amanda", 95);
        studentMarks.put("Chris", 88);

        System.out.println("Student Marks:");

        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}