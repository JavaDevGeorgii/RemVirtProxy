package geo.exersice.home.Points;

/**
 * Created by GEO on 09.10.15.
 */
public class Point3D extends Point2D{
    private int z;

    public int getZ() {
        return z;
    }

    public Point3D(int y, int x, int z) {
        super(y, x);
        this.z = z;
        System.out.println("constructor Point2D ");
        Print();
    }


    public static void Print(){
        System.out.println("Point3D ");
    }

    public Point3D() {
        this(1,1,1);
    }

    @Override
    public String toString() {
        return super.toString() +" z=" + z +'}';
    }
}
