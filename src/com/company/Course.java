package com.company;

public class Course extends OfertAcademic {

    private String name;
    private String description;
    private double monthlyAmountWorkLoad;
    private int amountMonthsDuration;
    private double hourPrice;

    public Course(String name, String description, double monthlyAmountWorkLoad, int amountMonthsDuration, double hourPrice) {
        this.name = name;
        this.description = description;
        this.monthlyAmountWorkLoad = monthlyAmountWorkLoad;
        this.amountMonthsDuration = amountMonthsDuration;
        this.hourPrice = hourPrice;
    }

    @Override
    public double calculatePrice() {
        return (monthlyAmountWorkLoad * amountMonthsDuration) * hourPrice;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public double getMonthlyAmountWorkLoad() {
        return monthlyAmountWorkLoad;
    }
}
