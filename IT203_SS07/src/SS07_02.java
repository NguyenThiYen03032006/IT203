public class SS07_02 {
    public static void main(String[] args) {
        int a=10;
        int b=a;
        b=20;
        Student st1=new Student("SV01","Nguyen Van A");
        Student st2=st1;
        st2.setStudentName("Nguyen Van A2");
        // Kieu nguyen thuy
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("________________");
        // Kieu tham chieu
        System.out.println("st1: "+st1.getStudentName());
        System.out.println("st2: "+st2.getStudentName());
    }
}
