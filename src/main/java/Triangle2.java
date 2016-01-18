/**
 * Created by joshuaPro on 2016-01-18.
 */
public class Triangle2 {
    private Point a;
    private Point b;
    private Point c;

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }
    public void draw(){
        System.out.println("\n Triangle 2 is running..");
    System.out.println( "point1 "+ a + "\npoint2 "+ b +"\npoint3 " + c);
    }
}
