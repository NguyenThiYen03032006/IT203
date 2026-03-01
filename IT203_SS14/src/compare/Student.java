package compare;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        /*
        Tra ve 1 neu doi tuong this > doi tuong o
        Trar ve 0 neu doi tuong this giong doi tuong o
        Tra ve -1 neu doi tuong thi < doi tuong o
         */
        // tieu chi ss
        // theo ten

        // Wrapper class: la kieu doi tuong cua cac kieu nguyen thuy
        if(this.score==o.score){
            return o.id-this.id;
        }

        //return this.name.compareTo(o.name);
        return Double.compare(this.score,o.score);
    }
    @Override
    public String toString() {
        return id + " - " + name + " - " + score;
    }
}
