import java.util.Scanner;

public class Ex1_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1 = "";

        String str;
        System.out.println("Nhap mang: ");
        str=sc.nextLine();
        int n=str.length();
        for(int i=0; i<n;i++){
            char c=str.charAt(i);
            c=Character.toLowerCase(c);
            if(Character.isLetter(c)|| c==' '){
                if(i>0) {
                    if (str.charAt(i - 1) == ' ') {
                        if (i>1 &&str.charAt(i - 2) != ' '&& str.charAt(i-1)==' ') {
                            continue;

                        }else{
                            str1 += Character.toUpperCase(c);
                        }


                    }else {
                        str1 += c;
                    }

                }else{
                    str1+=Character.toUpperCase(c);
                }


            }
        }
        System.out.println(str1);

    }
}
