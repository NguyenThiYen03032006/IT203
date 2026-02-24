package ra.demo;
import ra.edu.Student;

public class Main extends Student{
    public static void main(String[] args) {
        Student s1=new Student();
       // s1.StudentId="SV004";
        s1.fullName="Nguyen Van E";
    }
    public void printEmail(){
        System.out.println(this.email);
        this.email="xyz@gmail.com";
    }
}
