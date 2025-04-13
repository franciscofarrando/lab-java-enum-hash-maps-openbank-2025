package com.example;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, Student> studentsHashMap = new HashMap<>();

        //studentsHashMap.put("Alfonso",99);

        //System.out.println(studentsHashMap.get("Alfonso"));

        //Creo 4 students
        Student student1 = new Student("Alsonso", 90);
        Student student2 = new Student("Florencio", 70);
        Student student3 = new Student("Mercedes", 99);
        Student student4 = new Student("Luz", 78);

        //los agrego al map

        studentsHashMap.put(student1.getName(),student1);
        studentsHashMap.put(student2.getName(),student2);
        studentsHashMap.put(student3.getName(),student3);
        studentsHashMap.put(student4.getName(),student4);


        studentsHashMap.values().forEach(System.out::println);


        System.out.println("-------------------");
        //aumento un 10% la nota con increaseGrade
        Map<String, Student> studentsUpdatedMap = Student.increaseGrades(studentsHashMap);

        studentsHashMap.values().forEach(System.out::println);

    }
}