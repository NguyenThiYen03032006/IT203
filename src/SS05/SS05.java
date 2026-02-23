package SS05;

public class SS05 {
    public static void main(String[] args) {

        Employee e1 = new OfficeStaff("Nguyễn Văn A", 8000);
        Employee e2 = new Manager("Trần Thị B", 15000, 5000);

        Employee[] list = {e1, e2};

        System.out.println("===== BẢNG LƯƠNG NHÂN SỰ =====");

        for (Employee e : list) {
            e.displayInfo();

            if (e instanceof BonusCalculator) {
                BonusCalculator b = (BonusCalculator) e;
                System.out.println("Thưởng KPI: " + b.getBonus());
            } else {
                System.out.println("Thưởng KPI: Không có");
            }

            System.out.println("Lương cuối: " + e.calculateSalary());
            System.out.println("---------------------");
        }
    }
}
