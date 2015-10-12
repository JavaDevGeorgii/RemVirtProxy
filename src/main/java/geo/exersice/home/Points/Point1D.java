package geo.exersice.home.Points;

/**
 * Created by GEO on 09.10.15.
 */
public class Point1D {
    private int x;

    public Point1D(int x) {
        this.x = x;
        System.out.println("constructor Point1D ");
        Print();
    }

    public int getX() {
        return x;
    }

    public static void Print(){
        System.out.println("Point1D ");
    }

    @Override
    public String toString() {
        return "Point{" + " x=" + x;
    }
}

