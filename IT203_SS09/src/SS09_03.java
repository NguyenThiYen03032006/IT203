public class SS09_03 {
    static class Employee{
        protected String name;
        protected double salary;
        public Employee(String name,double salary){
            this.name=name;
            this.salary=salary;
        }
        public void display(){
            System.out.println("Ten: "+ name);
            System.out.println("Luong co ban: "+salary);
        }
    }
    static class Manager extends Employee{
        String department;
        public Manager(String name,double salary,String department){
            super(name,salary);
            this.department =department;
        }
        @Override
        public void display(){
            super.display();
            System.out.println("Phong ban: "+department);
        }
    }

    public static void main(String[] args) {
        Manager mn=new Manager("Nguyen Van A",15000.00,"Sale");
        mn.display();
    }
}
