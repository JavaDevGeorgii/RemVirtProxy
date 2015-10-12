package geo.exersice.home;

import geo.exersice.home.Points.Point1D;
import geo.exersice.home.Points.Point2D;
import geo.exersice.home.Points.Point3D;

/**
 * Created by GEO on 09.10.15.
 */
public class Main {
    public static void main(String[] args) {

        Point3D point3D = new Point3D(10, 10, 10);
        System.out.println(point3D);
        Point3D.Print();
        Point2D.Print();
        Point1D.Print();
    }
}


