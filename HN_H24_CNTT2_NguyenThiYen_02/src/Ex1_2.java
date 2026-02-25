import java.util.Scanner;

public class Ex1_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str;
        System.out.println("Nhap 1 chuoi bat ky:");
        str=sc.nextLine();
        char[] str2=new char[str.length()];
        int[] count2=new int[str.length()];
        int count=0;
        int index=0;
        boolean flag=true;
        char result=str.charAt(0);
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(i==0){
                str2[0]=c;
                index++;
            }
            for(int j=0;j<str2.length;j++){
                if(str2[j]!=c){
                    str2[index]=c;
                    count2[index]=1;
                }else{
                    count2[j]+=1;
                }
            }
        }
        for(int i=0;i<str2.length;i++){
            if(count2[i]==1){
                System.out.println(str2[i-1]);

            }
        }

    }
}
