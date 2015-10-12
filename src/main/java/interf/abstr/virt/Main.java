package interf.abstr.virt;

/**
 * Created by GEO on 01.10.15.
 */
public class Main {
    public static void main(String[] args)  {

        Ship.Engine engine=new Ship().new Engine();

        Ship ship=new Ship();
        ship.intit();

    }
}