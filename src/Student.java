/**
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 29/09/2020
 */

// Lav 3 forskellige constructors til din Studerende klasse. Den ene skal ikke tage imod parametre,
// den anden skal tage imod navn, alder og by, og den tredje skal tage imod navn og alder.

public class Student {
    String studentName;
    int studentAge;
    String studentCity;
    String studyProgramme;


    //Class with no parameters
    Student(){
        System.out.println("This is a constructor with no parameters");
    }

    public Student(String studentName, int studentAge, String studentCity){
//        System.out.println("This is a constructor with three parameters: studentName, studentAge, studentCity");
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentCity = studentCity;
    }

    public Student(String studentName, int studentAge){
//        System.out.println("This is a constructor with two parameters: studentName, studentAge");
        this.studentName = studentName;
        this.studentAge = studentAge;
    }
}