public class SS07_04 {
    public static void main(String[] args) {

        ClassRoom s1 = new ClassRoom("Nguyen Van A");
        ClassRoom s2 = new ClassRoom("Tran Thi B");
        ClassRoom s3 = new ClassRoom("Le Van C");

        s1.payToFund(100000);
        s2.payToFund(150000);
        s3.payToFund(200000);

        System.out.println();
        ClassRoom.showClassFund();
    }
}
class ClassRoom{
    private static double classFund=0;
    private String nameStudent;
    public ClassRoom(String nameStudent){
        this.nameStudent=nameStudent;
    }
    public void payToFund(double amount) {
        if (amount > 0) {
            classFund += amount;
            System.out.println(nameStudent + " đã đóng " + amount + " vào quỹ lớp");
        }
    }
    public static void showClassFund() {
        System.out.println("Tổng quỹ lớp hiện tại: " + classFund);
    }
}