package com.company;

public class Workshop extends OfertAcademic {
    private String name;
    private String description;
    private double workshopPrice;
    private double amountOfPracticeWork;


    public Workshop(String name, String description, double workshopPrice, double amountOfPracticeWork) {
        this.name = name;
        this.description = description;
        this.workshopPrice = workshopPrice;
        this.amountOfPracticeWork = amountOfPracticeWork;
    }

    @Override
    public double calculatePrice() {
        return amountOfPracticeWork * workshopPrice;
    }

    @Override
    public String toString() {
        return name;
    }

}
