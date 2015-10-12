package interf.abstr.virt;

/**
 * Created by GEO on 01.10.15.
 */
public class UrahSingleton {

    final Integer a=100;
    public String s="sfffsd";
    private static UrahSingleton ourInstance = new UrahSingleton();

    public static UrahSingleton getInstance() {
        return ourInstance;
    }

}
