import java.util.*;

class Patient{
    String name;
    int severiry;
    int time;

    public Patient(String name, int severiry, int time) {
        this.name = name;
        this.severiry = severiry;
        this.time = time;
    }
    @Override
    public String toString() {
        return name + " (Mức " + severity + ", đến lúc " + arrivalTime + ")";
    }
}
public class Bai5 {
    public static void main(String[] args) {

        // Comparator: so sánh severity trước, nếu bằng thì so arrivalTime
        Comparator<Patient> patientComparator = (p1, p2) -> {
            if (p1.severity != p2.severity) {
                return p1.severity - p2.severity; // severity nhỏ hơn ưu tiên trước
            } else {
                return p1.arrivalTime - p2.arrivalTime; // đến sớm ưu tiên trước
            }
        };

        TreeSet<Patient> queue = new TreeSet<>(patientComparator);

        // Thêm bệnh nhân
        queue.add(new Patient("Bệnh nhân A", 3, 800));
        queue.add(new Patient("Bệnh nhân B", 1, 815));
        queue.add(new Patient("Bệnh nhân C", 1, 805));

        System.out.println("Thứ tự xử lý:");

        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}
