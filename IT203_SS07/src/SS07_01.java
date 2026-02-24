
public class SS07_01 {
    public static void main(String[] args) {
        Student st1=new Student("SV01","Nguyen Van A");
        Student st2=new Student("SV02","Tran Thi B");
        st1.displayInfor();
        st2.displayInfor();
        Student.displayTotalStudent();
    }


}
class Student{
    private String studentId;
    private String studentName;
    private static int totalStudent=0;
    public Student(String studentId,String studentName){
        this.studentId=studentId;
        this.studentName=studentName;
        totalStudent++;
    }
    public void displayInfor(){
        System.out.printf("Student id: %5s | Student name: %15s \n",studentId,studentName);
    }
    public static void displayTotalStudent(){
        System.out.println("Total Student: "+ totalStudent);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
