package com.tbruntink01rocvantwente.opdracht3_tim_loek_martijn.data;

import java.io.Serializable;

/**
 * Created by Tim on 23-9-2016.
 */
public class Student implements Serializable{

    private int studentID;
    private String studentName;
    private String studentNumber;
    private String studentKlasnaam;
    private String studentEmail;
    private int imageRecourceID;

    public int getImageRecourceID() {
        return imageRecourceID;
    }

    public void setImageRecourceID(int imageRecourceID) {
        this.imageRecourceID = imageRecourceID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentKlasnaam() {
        return studentKlasnaam;
    }

    public void setStudentKlasnaam(String studentKlasnaam) {
        this.studentKlasnaam = studentKlasnaam;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentEmail(){ return studentEmail;}

    public void setStudentEmail(String studentEmail){ this.studentEmail = studentEmail;}


    public Student(int imageRecourceID, String studentName, String studentNumber) {
        this.imageRecourceID = imageRecourceID;

        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }


    public Student(int imageRecourceID, String studentName, String studentNumber,String studentEmail) {
        this.imageRecourceID = imageRecourceID;
        this.studentEmail = studentEmail;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }
}
