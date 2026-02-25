import java.util.Scanner;

public class Ex3 {

    static boolean isCheck(int[] arr, int size, int value){
        for(int i=0;i<size;i++){
            if(arr[i]==value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao so phan tu mang A: ");
        int n=sc.nextInt();
        int[] arrA=new int[n];
        System.out.println("Nhap vao so phan tu mang B: ");
        int m=sc.nextInt();
        int[] arrB=new int[m];
        int[] arrAB=new int[m];
        int count =0;

        System.out.println("Nhap tung phan tu mang A");
        for(int i=0;i<n;i++){
            arrA[i]=sc.nextInt();
        }
        System.out.println("Nhap tung phan tu mang B");
        for(int i=0;i<m;i++){
            arrB[i]=sc.nextInt();
        }


        for(int i=0;i<n;i++){
            // Tim giao
            if(isCheck(arrB,m,arrA[i])){
                boolean flag= true;
                for(int j=0;j<count;j++){
                    // check giao trung
                    if(arrAB[j]==arrA[i]){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    arrAB[count++]=arrA[i];
                }
            }
        }

        for(int i=0;i<count;i++){
            System.out.print(arrAB[i]+" ");
        }
    }
}
