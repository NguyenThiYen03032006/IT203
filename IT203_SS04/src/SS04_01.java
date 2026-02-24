import java.util.Scanner;

public class SS04_01 {
    public static String formatAuthor(String a){
        String[] word=a.trim().split("\\s+");
        StringBuilder newAuthor=new StringBuilder();
        for (String e:word){
            newAuthor.append(Character.toUpperCase(e.charAt(0)))
                    .append(e.substring(1).toLowerCase())
                    .append(" ");
        }
        return newAuthor.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Nhap ten sach: ");
        String bookName = sc.nextLine();

        System.out.print("Nhap ten tac gia: ");
        String author = sc.nextLine();

        String BookName=bookName.trim().replaceAll("\\s+"," ").toUpperCase();

        System.out.printf("[%s] - Tac gia: [%s]",BookName,formatAuthor(author));
    }
}
