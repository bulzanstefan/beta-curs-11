package org.betania.curs11;

import java.util.HashMap;
import java.util.Map;

public class TryMap {
    public static void main(String[] args) {
        Map<String, Integer> studentToGrade = new HashMap<>();

        studentToGrade.put("Ioan", 7);
        studentToGrade.put("Andrei", 10);
        studentToGrade.put("Maria", 9);
        studentToGrade.put("Crina", 10);

        System.out.println(studentToGrade);

        System.out.println(studentToGrade.get("Maria"));
        System.out.println(studentToGrade.get("na"));
        System.out.println(studentToGrade.keySet());
        System.out.println(studentToGrade.values());
        System.out.println(studentToGrade.entrySet());
        System.out.println(studentToGrade.getOrDefault("na", 33));

        for (String name : studentToGrade.keySet()) {
            System.out.println(studentToGrade.get(name));
        }
    }
}
