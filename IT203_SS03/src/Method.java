import java.util.Scanner;

public class Method {
    // phuong thuc ko static
    public double sum1(double a, double b){
        return a+b;
    }
    // phuong thuc co static
    public static double sum2(double a, double b){
        return a+b;
    }
    // goi phuong thuc
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);// cap phat dong
        input.nextInt();
        Method method=new Method();// phai cap phat dong
        double rs1=method.sum1(1,2);

        double rs2=sum2(1,2);

    }


}
