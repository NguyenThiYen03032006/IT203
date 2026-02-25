import java.util.Scanner;
public class Ex2_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("n= ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Nhap mang so nguyen");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n-i-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Nhap mang so nguyen");
        int check=arr[0];
        for (int i=0;i<n;i++){
            if(arr[i]!=check){
                System.out.println("So con thieu la: "+ check);
                break;
            }else{
                check++;
            }
        }
    }
}
