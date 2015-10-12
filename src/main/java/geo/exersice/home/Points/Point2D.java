package geo.exersice.home.Points;

/**
 * Created by GEO on 09.10.15.
 */
public class Point2D extends Point1D{
    private int y;

    public int getY() {
        return y;
    }

    public Point2D(int y, int x) {
        super(x);
        this.y = y;
        System.out.println("constructor Point3D ");
        Print();
    }

     public static void Print(){
         System.out.println("Point2D ");
     }

    @Override
    public String toString() {
        return super.toString()+" y=" + y;
    }
}
