package com.rikkeiedu.management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student[] students=new Student[100];
        int currentIndex=0;// luu tru so luong phan tu dang co
        int choice=0;
        do {
            System.out.println("""
                    --- MENU ---
                    1. Add Student.
                    2. Show all.
                    3. AvgScore all Student.
                    4. Exit.
                    """);
            System.out.print("Your choice: ");
            choice= Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1: {
                    Student newSt = new Student();
                    System.out.print("Enter student name: ");
                    newSt.setFullName(sc.nextLine());
                    System.out.print("Enter student score: ");
                    newSt.setScore(Integer.parseInt(sc.nextLine()));
                    students[currentIndex++] = newSt;
                    System.out.println("Student add successfully");
                    break;
                }
                case 2: {
                    System.out.println("--- Student list ---");
                    if(currentIndex==0){
                        System.out.println("List is empty!");
                    }
                    else {
                        for (int i = 0; i < currentIndex; i++) {
                            students[i].displayInfor();
                        }
                    }
                    break;
                }
                case 3: {
                    int avgScore=0;
                    for (int i=0;i<currentIndex;i++){
                        avgScore+=students[i].getScore();
                    }
                    float avg=(float)avgScore/currentIndex;
                    System.out.printf("Student agv Score: %.2f \n",avg);
                    break;
                }
                case 4:
                    choice=4;
                    System.out.println("Your choice Exit");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(choice!=4);
    }
}
