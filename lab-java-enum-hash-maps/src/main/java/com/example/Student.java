package com.example;

import java.util.Map;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }


    //increaseGrade aumenta el 10% pero no pasa del los 100 puntos maximos de grade.

    public static Map<String, Student> increaseGrades(Map<String,Student> students) {
        for (Map.Entry<String,Student> entry : students.entrySet()){
            Student student = entry.getValue();
            int currentGrade = student.getGrade();
            int incresedGrade = (int) Math.round(currentGrade*1.10);
            if (incresedGrade>100){
                incresedGrade = 100;
            }
            student.setGrade(incresedGrade);
        }
        return students;
    }
}
