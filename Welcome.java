package com.training;

interface CourseDetails{
    int getCourseFess();
    String getCourseName();
    int getCourseDuration();
    int getTrainingExperience();
}

abstract class JSAcademy{

    String getCourseName(){
        return "Java";
    }
}
public class Welcome{
    public static void main(String[] args){
        Demo d=new Demo();
        System.out.println(d.getCourseName());
    }
}
