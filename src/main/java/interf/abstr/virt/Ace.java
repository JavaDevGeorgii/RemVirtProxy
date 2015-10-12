package interf.abstr.virt;

/**
 * Created by GEO on 01.10.15.
 */
public class Ace {
    private int x;
    private int y;
    private double z;
    private float f;
    private String str;

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Ace)){
            return false;
        }else {
            Ace a= (Ace) obj;
            Double.compare(a.z, z);
            return a.x==x && a.y==y;
        }

    }

    @Override
    public int hashCode() {

        long d=Double.doubleToLongBits(z);
        int res=17;
        res=31*res+(int) x;
        res=31*res+(int) y;
        res=31*res+Float.floatToIntBits(f);
        //res=31*res+(int)str;
        res= (int) (31*res+(d^(d>>>32)));
        return res;
    }

    public void doSam(){
        System.out.println("Class - Ace, Method - doSam");
    }

    public Ace() {
        System.out.println("Constructor Ace");
    }
}
