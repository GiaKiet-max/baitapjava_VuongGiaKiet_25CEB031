public class TestLine {
    public static void main(String[]args){
        Line l1 = new Line(0,0,3,4);
        System.out.println(l1);

        Point5_1 p1 = new Point5_1(20,11);
        Point5_1 p2 = new Point5_1(10,7);
        Line l2 = new Line(p1,p2);
        System.out.println(l2);
    }
}
