public class SS09_01 {
    static class Person{
        protected String name;
        protected int age;

        public Person(String name,int age){
            this.name=name;
            this.age=age;
        }
        public void display(){
            System.out.println("Ten: "+name);
            System.out.println("Tuoi: "+age);
        }
    }
    static class Student extends Person{
         int studentId;
         double avg;
        public Student(String name, int age,int studentId,double avg) {
            super(name, age);
            this.studentId =studentId;
            this.avg=avg;
        }
        @Override
        public void display(){
            super.display();
            System.out.println("Ma sinh vien: "+studentId);
            System.out.println("Diem trung binh: "+avg);
        }
    }

    public static void main(String[] args) {
        Student st1=new Student("Nguyen Van A", 18,1,8.7);
        st1.display();
    }
}
