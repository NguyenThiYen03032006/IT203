import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static ProductRepository repo = new ProductRepository();
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm theo ID");
            System.out.println("4. Xóa theo ID");
            System.out.println("5. Sắp xếp theo giá tăng dần");
            System.out.println("6. Thống kê theo loại");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    findById();
                    break;
                case 4:
                    removeById();
                    break;
                case 5:
                    sortByPrice();
                    break;
                case 6:
                    statistics();
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void addProduct() {
        System.out.println("1. Electronic");
        System.out.println("2. Food");
        System.out.print("Chọn loại: ");
        int type = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập ID: ");
        String id = sc.nextLine();

        System.out.print("Nhập tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(sc.nextLine());

        Product p = null;

        if (type == 1) {
            System.out.print("Nhập số tháng bảo hành: ");
            int warranty = Integer.parseInt(sc.nextLine());
            p = new ElectronicProduct(id, name, price, warranty);
        } else if (type == 2) {
            System.out.print("Nhập % giảm giá: ");
            int discount = Integer.parseInt(sc.nextLine());
            p = new FoodProduct(id, name, price, discount);
        }

        if (repo.add(p)) {
            System.out.println("Thêm thành công!");
        } else {
            System.out.println("Thêm thất bại (trùng ID hoặc lỗi dữ liệu)!");
        }
    }

    private static void showAll() {
        List<Product> list = repo.findAll();
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        for (Product p : list) {
            p.displayInfo();
            System.out.println("Thành tiền: " + p.calculateFinalPrice());
            System.out.println("-------------------");
        }
    }

    private static void findById() {
        System.out.print("Nhập ID cần tìm: ");
        String id = sc.nextLine();

        Product p = repo.findById(id);

        if (p != null) {
            p.displayInfo();
            System.out.println("Thành tiền: " + p.calculateFinalPrice());
        } else {
            System.out.println("Không tìm thấy!");
        }
    }

    private static void removeById() {
        System.out.print("Nhập ID cần xóa: ");
        String id = sc.nextLine();

        if (repo.removeById(id)) {
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Không tìm thấy ID!");
        }
    }

    private static void sortByPrice() {
        List<Product> sorted = new ArrayList<>(repo.findAll());
        sorted.sort(Comparator.comparingDouble(Product::getPrice));

        for (Product p : sorted) {
            System.out.println(p.getId() + " - " + p.getPrice());
        }
    }

    private static void statistics() {
        Map<String, Integer> map = repo.countByType();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}