package com.company;

import java.util.HashSet;
import java.util.Set;

public class Institute {
    private String name;
    private Set<OfertAcademic> courses;

    public Institute(String name) {
        this.name = name;
        this.courses = new HashSet<>();
    }

    public void addCourse(OfertAcademic course){
        courses.add(course);
    }

    public void ShowCurses() {
        for (OfertAcademic course: courses) {
            System.out.println("The course of " + course.toString() + " has a price of: " + course.calculatePrice());
        }
    }
}
