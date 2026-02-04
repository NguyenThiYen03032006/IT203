public class SS09_05 {

    static abstract class Employee {
        protected int baseSalary;

        public Employee(int baseSalary) {
            this.baseSalary = baseSalary;
        }

        public abstract int calculateSalary();
    }

    static class OfficeEmployee extends Employee {
        private int workingDays;

        public OfficeEmployee(int workingDays) {
            super(1000);
            this.workingDays = workingDays;
        }

        @Override
        public int calculateSalary() {
            return baseSalary * workingDays + 3000;
        }
    }

    static class ProductionEmployee extends Employee {
        private int productCount;

        public ProductionEmployee(int productCount) {
            super(1000);
            this.productCount = productCount;
        }

        @Override
        public int calculateSalary() {
            return baseSalary + productCount * 5000;
        }
    }

    public static void main(String[] args) {
        Employee[] list = new Employee[3];

        list[0] = new OfficeEmployee(2);
        list[1] = new ProductionEmployee(3);
        list[2] = new OfficeEmployee(4);

        int sum = 0;
        for (Employee e : list) {
            sum += e.calculateSalary();
        }

        System.out.println("Tong Luong: " + sum);
    }
}
