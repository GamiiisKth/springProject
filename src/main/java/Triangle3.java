import java.util.List;

/**
 * Created by joshuaPro on 2016-01-18.
 */
public class Triangle3 {
    List<Point>  points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }


    public void draw (){
        System.out.println("\n Triangle3 is running..");

        for (Point point: points){
            System.out.println(point);
        }
    }
}
