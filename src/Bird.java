import java.io.Serializable;

public class Bird implements IMoveable, Serializable,Cloneable {
    @Override
    public void fly() {
        System.out.println("Bird is moving");
    }

    @Override
    public void move() {
        System.out.println("Bird is flying");
    }
}