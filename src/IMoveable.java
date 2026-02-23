public interface IMoveable {
    // phuong thuc tuu tuong
    public abstract void move();
    void fly();// viet gon lai
    // hang so
    public static final String ABC="ABC";
    String DEF="DEF";// viet gon

    // tu java 8 tro di bo sung them cac phuong thuc sau
    default void printColor(String color){
        System.out.println(color);
    }
    static void sum(int a , int b){
        System.out.println(a+b);
    }
    private void clone(String str){
        System.out.println("Clone: "+str);
    }
}
