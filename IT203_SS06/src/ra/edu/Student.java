package ra.edu;

import java.util.Date;

public class Student {
    // thuoc tinh
    String studentId;
    public  String fullName;
    Date dateOfBirth;
    protected String email;
    private String phoneNumber;

    // phuong thuc
    // phuong thuc khoi tao : constructor la 1 phuong thuc dac biet de khoi tao doi tuong
    public Student(){// ko tra ve gtri
        // de thiet lap cac gtri ban dau cho thuoc tinh
        studentId="Sv001";
        fullName="Nguyen Van C";
        email="nvc@gmail.com";
        phoneNumber="0123456789";
        dateOfBirth=new Date();
    }
    public Student(String studentId,String fullName,String email,String phoneNumber,Date dateOfBirth){
        this.studentId=studentId;
        this.fullName=fullName;
        this.dateOfBirth=dateOfBirth;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }
    void checkID(){
        System.out.println("Student "+ fullName+ " check in at "+ new Date());
    }
    void doHomerwork(){
        System.out.println("Student "+fullName +" is doing homework");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber==null || phoneNumber.isBlank()||phoneNumber.matches("^[0-9]{10}$")){
            System.out.println("So dien thoai khong hop le");
            return;
        }
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
