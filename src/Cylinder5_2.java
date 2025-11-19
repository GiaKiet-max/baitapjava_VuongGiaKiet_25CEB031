public class Cylinder5_2 {
    private Circle5_2 base;
    private double height;

    public Cylinder5_2(){
        base = new Circle5_2();
        height = 1.0;
    }

    public Cylinder5_2(double radius, double height, String color){
        base = new Circle5_2(radius,color);
        this.height = height;
    }

    public Circle5_2 getBase() {
        return base;
    }

    public void setBase(Circle5_2 base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getvolume(){
        return base.getArea()*height;
    }

    public String toString(){
        return"Cylinder[base="+ base.toString() + ",hright="+ height + "]";
    }
}
