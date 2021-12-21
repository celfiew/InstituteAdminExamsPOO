package com.company;

import java.util.ArrayList;
import java.util.List;

public class Career extends OfertAcademic {
    private static final int MINIMUN_HOURS_TO_HAVE = 10;
    private List<OfertAcademic> courses;
    private String name;
    private double basicValue;

    public Career(String name, double basicValue) {
        this.name = name;
        this.basicValue = basicValue;
        this.courses = new ArrayList<>();
    }

    public void addCareer(OfertAcademic career) throws Exception {
        if (career instanceof Course){
            if (((Course) career).getMonthlyAmountWorkLoad()<= MINIMUN_HOURS_TO_HAVE){
                throw new Exception();
            }
        }
            courses.add(career);
    }

    public double calculatePrice(){
        double totalPrice = 0;
        for (OfertAcademic course: courses) {
            totalPrice += course.calculatePrice();
        }
        return totalPrice + basicValue;
    }

    @Override
    public String toString() {
        return name;
    }

}
