package com.company;

import java.util.HashSet;
import java.util.Set;

public class ComplexProgram extends OfertAcademic {
    private static final double DISCOUNT_PROGRAM = 0.20;
    private String name;
    private Set<OfertAcademic> listCourses;

    public ComplexProgram(String name) {
        this.name = name;
        this.listCourses = new HashSet<>();
    }

    public void addCourse(OfertAcademic course){
        this.listCourses.add(course);
    }

    @Override
    public double calculatePrice() {
        double totalPrice = 0;
        for (OfertAcademic course: listCourses) {
            totalPrice += course.calculatePrice();
        }
        return totalPrice*(1-DISCOUNT_PROGRAM);
    }
    @Override
    public String toString() {
        return name;
    }



}
