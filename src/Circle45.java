public class Circle45 extends Shape{
    private double radius = 1.0;

    public Circle45(){}

    public Circle45(double radius){
        this.radius = radius;
    }

    public Circle45(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return "Circle[" + super.toString() +",radius= "+radius+"]";
    }
}
