package SS01;

public class Circle implements Shape {
   private double radius;
   public Circle(double radius){
       this.radius=radius;
   }
    @Override
    public double getAria() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return radius*2*Math.PI;
    }
}
