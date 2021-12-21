package com.company;

public class FactoryStudy{


    public static OfertAcademic getOfert(String nameInstance) throws Exception {

        OfertAcademic result = null;
        switch (nameInstance){
            case "backend":
            result = new Course("backend","develop the inteface of the web",16,2,1000);
                return result;
            case "frontend":
            result = new Course("frontend","develop the logic of the web",20,2,900);
                return result;
            case "workshop":
            result = new Workshop("SQL","work with basedate",10,20);
                return result;
            case "workshop2":
            result = new Workshop("SQL2","work with basedate",10,12);
                return result;
            case "fullstack":
            result = new ComplexProgram("fullstack");
            ((ComplexProgram) result).addCourse(FactoryStudy.getOfert("backend"));
            ((ComplexProgram) result).addCourse(FactoryStudy.getOfert("frontend"));
                return result;
            case "career":
            result = new Career("Tech Developer",200);
            ((Career) result).addCareer(FactoryStudy.getOfert("workshop"));
            ((Career) result).addCareer(FactoryStudy.getOfert("workshop2"));
            ((Career) result).addCareer(FactoryStudy.getOfert("frontend"));
            ((Career) result).addCareer(FactoryStudy.getOfert("backend"));
                return result;
            default:
                return null;
        }
    }
}
