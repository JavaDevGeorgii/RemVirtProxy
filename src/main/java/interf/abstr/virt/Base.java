package interf.abstr.virt;

/**
 * Created by GEO on 01.10.15.
 */
public class Base extends Ace {
    public Base() {
        System.out.println("Constructor Base ");

    }

    @Override
    public void doSam(){
        System.out.println("Class - Base, Method - doSam");
        //super.doSam();
    }

}
