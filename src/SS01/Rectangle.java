package SS01;

public class Rectangle implements Shape{
    private double width,height;
    public Rectangle(double width,double height){
        this.height=height;
        this.width=width;
    }
    @Override
    public double getAria() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return (width+height)*2;
    }
}
