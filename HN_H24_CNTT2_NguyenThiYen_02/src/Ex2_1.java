import java.util.Scanner;

public class Ex2_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Nhap vao vi tri muon xoa");
        int index=sc.nextInt();
        System.out.println("Nhap mang ban dau: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Mang ban dau la: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        // xoa
        for(int i=index;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        System.out.println("\nMang sau khi xoa phan tu vi tri "+index);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
