package ra.edu;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        // khoi tao doi tuong
        Student student=new Student();//cap phat bo nho cho doi tuong Student
        // gan cac thong tin cua doi tuong
        student.studentId="SV001";
        student.fullName="Nguyen Van A";
        student.email="nva@gmail.com";
        // student.phoneNumber="0987654321";
        student.setPhoneNumber("0123456789");
        student.dateOfBirth=new Date();
        // goi phuong thuc
        student.checkID();
        student.doHomerwork();

        // object va Instance( the hien)
        Student s2=new Student("SV002","Tran Thi B","ttb@gmail.com","0987654321",new Date());

        System.out.println(s2.fullName);
        System.out.println(student.fullName);

        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println(s2); //ra.edu.Student@7e6cbb7a
        System.out.println(s2.toString());
    }
}
