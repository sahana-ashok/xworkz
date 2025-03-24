package com.xworkz.prog.District;

public class ExperinceDetail {
    String place;
    int noOfYear;

    String[] education ={
            "B.E","BCA"
    };
    public ExperienceDetail(){
        for (String expi:education){
            System.out.println(expi);
        }
    }
}
