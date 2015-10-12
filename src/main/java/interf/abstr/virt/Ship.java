package interf.abstr.virt;

/**
 * Created by GEO on 01.10.15.
 */
public class Ship {

    private Engine engine;
    private int weight=122;
    protected String aas="Man";

    public class Engine{
        private int enginpower;
        public String engineBrand;

        public void launch(int a, String s){
            System.out.println("Start engine! "+a+" "+s);
        }
    }
    void Prt(){

    }

    public final void intit(){
        engine=new Engine();
        engine.launch(engine.enginpower, engine.engineBrand);
        engine.engineBrand="A"+aas;
        engine.enginpower=weight+33;
        engine.launch(engine.enginpower, engine.engineBrand);

    }
}
