public class Circle2 {

    private double radius = 1.0;

    public Circle2(){
    }

    public double Circle2(){
        return radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(){
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getCircumference(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle2{" +
                "radius=" + radius +
                '}';
    }
}
