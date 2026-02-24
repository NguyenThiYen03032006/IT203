import java.util.Scanner;

public class BTTH {
    public static boolean checkBookId(String bookId){
        return bookId.matches("LIB-\\d{4}-S");// xxxx la 4 chu so
    }
    public static boolean checkISBN(String isbn){
        return isbn.matches("\\d{10}");
    }
    public static boolean checkYear(String year){
        if(!year.matches("\\d{4}")) return false;
        int y=Integer.parseInt(year);
        return y<=2026;
    }
    // dinh dang ten tac gia mà ten sach
    public static String normalizeText(String input){
        String[] word=input.trim().split("\\s+");
        StringBuilder result=new StringBuilder();
        for(String e:word){
            result.append(Character.toUpperCase(e.charAt(0)))// viet hoa chua dau tien
                    .append(e.substring(1).toLowerCase())// tu chu thu 2 thi viet thuong
                    .append(" ");
        }
        return result.toString().trim(); // chuyen tu stringbuilder thanh string va xoa dau " " cuoi cung
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("----- KET QUA BIEN MUC -----");
        System.out.print("MA sach chuan (LIB-xxxx-S): ");
        String bookId=sc.nextLine();
        System.out.print("ISBN-10: ");
        String isbn=sc.nextLine();
        System.out.print("Ten sach: ");
        String bookName=sc.nextLine();
        System.out.print("Ten tac gia: ");
        String author=sc.nextLine();
        System.out.print("Nam XB: ");
        String year=sc.nextLine();
        boolean flag=true;
        if(!checkBookId(bookId)){
            System.out.println("Nhap sai ma sach");
            flag=false;
        }
        if(!checkISBN(isbn)){
            System.out.println("Nhap sai ma ISBN");
            flag=false;
        }
        if(!checkYear(year)){
            System.out.println("Nam xuat ban chua hop le");
            flag=false;
        }
        if(flag)  System.out.printf("Trich dan: [%s] - [%s] - [%s] (%s)",isbn,normalizeText(bookName),normalizeText(author),year);
     }
}
