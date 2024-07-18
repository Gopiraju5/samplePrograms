package com.practice.java.oops;

public class Institute {

    private String instituteRollNumber;
    private String instituteName;
    private String instituteCourses;

    public Institute(String instituteRollNumber, String instituteName, String instituteCourses){
        super();
        this.instituteRollNumber = instituteRollNumber;
        this.instituteName = instituteName;
        this.instituteCourses = instituteCourses;
    }

    public String toString(){
        return "Institute {instituteRollNumber = "+instituteRollNumber+
                ", instituteName = "+instituteName+
                " , instituteCourses = "+instituteCourses+ " }";
    }
}
