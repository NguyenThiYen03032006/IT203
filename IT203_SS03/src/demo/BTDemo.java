package demo;
import java.util.Scanner;

/*
    bt
    1.1 : Nhập vào và in mảng
    Thực hiện cho ng dùng nhập vào số lượng phần tử của mảng n
    và nhập n gtri cho từng phần tử
    Tiến hành in ra cac ptu trong mang vua nhap

    1.2: phát triển 1.1 thêm vào các yc:
    -Tìm và in số nto
    -Tính tỏng các số fibonacy
    - TÌm min,max trong mảng
    - tính tổng các giai thừa của từng ohaanf tử trong mảng
 */
public class BTDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        do{
            System.out.print("input: ");
            n=sc.nextInt();
        }while (n>=0);

        int[] arrayN= new int[n];
        for(int i=0;i<n;i++){
            arrayN[i]=sc.nextInt();
        }
        System.out.print("output: Mang vua nhap: ");
        for (int e:arrayN) System.out.print(e + " \n");

        // tim so nto
        System.out.print("Cac so nto la: ");
        for (int e : arrayN) {
            if (e < 2) continue;
            boolean flag = true;
            for (int i = 2; i<=Math.sqrt(e); i++) {
                if (e % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.print(e + " ");
        }

        // tinh tong cac so fibonaci
        // kiem tra co trong day fibonaci khong
        int sumFibonaci=0;
        for (int e:arrayN){
            if(e<0) continue;
            int a1=5*(e*e)+4;
            int a2=5*(e*e)-4;
            int b1= (int) Math.sqrt(a1);
            int b2=(int) Math.sqrt(a2);
            if(b1*b1==a1||b2*b2==a2 ) {
                sumFibonaci+=e;
            }
        }
        if(sumFibonaci==0) System.out.println("Trong day khong co so fibonaci");
        else System.out.println("\nTong cac so fibonaci"+sumFibonaci);
        // tim min , max trong mang
        int min=arrayN[0], max=arrayN[0];
        for (int e:arrayN){
            if(e<min) min=e;
            if(e>max) max=e;
        }
        System.out.println("min: "+min);
        System.out.println("max: "+max);
        // tinh tong cac gia thua
        long sum=0;
        for (int e: arrayN){
            if(e<0) continue;
            if(e==0){
                sum+=1;
                continue;
            }
            // tinh giai thua
            long fact=1;
            for (int i=1;i<=e;i++){
                fact*=i;
            }
            // cong lai
            sum+=fact;
        }
        System.out.println("Tong cac giai thua: "+ sum);
    }
}
