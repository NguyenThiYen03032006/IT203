public class ss01_03 {
    public static void main(String[] args) {
        String book1= "Java Basic";
        String book2="Python Intro";
        System.out.printf("Truoc khi doi \n book1: %s \n book2: %s \n",book1,book2);
        // doi
        String temp= book1;
        book1=book2;
        book2=temp;
        System.out.printf("Sau khi doi \n book1: %s \n book2: %s",book1,book2);

        //- Heap: chứa các đối tượng chuỗi "Java Basic" và "Python Intro". Khi hoán đổi, các chuỗi trong Heap không thay đổi, vẫn nằm nguyên đó.
        //- Stack: chứa biến tham chiếu (book1, book2, temp). Khi swap, các biến này chỉ đổi chỗ tham chiếu sang đối tượng khác trong Heap.

    }
}
