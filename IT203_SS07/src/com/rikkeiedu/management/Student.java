package com.rikkeiedu.management;

public class Student {
    private static int currentId=1;
    private int id;
    private String fullName;
    private final String className="RikkeiEducation";
    private int score;

    public Student(){
        this.id=currentId++;
    }

    public Student(String fullName,int score){
        this.fullName=fullName;
        this.score=score;
    }

    public String getClassName() {
        return className;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        Student.currentId = currentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void displayInfor(){
        System.out.printf("| Student ID: %5d | Full Name: %20s | Score: %3d | School: %20s |\n",id,fullName,score,className);
    }
}
