package SS01;

import java.util.Scanner;

public class SS01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Nhap ban kinh hinh tron");
        double r= sc.nextDouble();
        Shape c1= new Circle(r);

        System.out.println("Nhap canh 1 cua hinh chu nhat: ");
        double w=sc.nextDouble();
        System.out.println("Nhap canh 2 cua hinh chu nhat: ");
        double h=sc.nextDouble();
        Shape r1= new Rectangle(w,h);

        System.out.printf("Thong tin hinh tron: chu vi: %f | dien tich: %f \n",c1.getPerimeter(),c1.getAria());
        System.out.printf("Thon tin hinh chu nhat:  chu vi: %f | dien tich: %f ",r1.getPerimeter(),r1.getAria());

    }
}
