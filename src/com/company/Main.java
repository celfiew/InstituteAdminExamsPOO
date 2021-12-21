package com.company;

public class Main {

    public static void main(String[] args) {

        Institute digitalHouse = new Institute("DigitalHouse");
        try {
            digitalHouse.addCourse(FactoryStudy.getOfert("backend"));
            digitalHouse.addCourse(FactoryStudy.getOfert("frontend"));
            digitalHouse.addCourse(FactoryStudy.getOfert("fullstack"));
            digitalHouse.addCourse(FactoryStudy.getOfert("workshop"));
            digitalHouse.addCourse(FactoryStudy.getOfert("workshop2"));
            digitalHouse.addCourse(FactoryStudy.getOfert("career"));
            digitalHouse.ShowCurses();
        } catch (Exception e){
            System.err.println(e.getMessage());
        }








    }
}
