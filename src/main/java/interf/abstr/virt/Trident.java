package interf.abstr.virt;

/**
 * Created by GEO on 01.10.15.
 */
public class Trident extends Base{
    public Trident() {
        System.out.println("Constructor Trident ");
    }

    @Override
    public void doSam(){
        System.out.println("Class - Trident, Method - doSam");
        //super.doSam();
    }
}
